package generator;

import grammars.ElementsGrammarLexer;
import grammars.ElementsGrammarParser;
import grammars.RelationsGrammarLexer;
import grammars.RelationsGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class Generator {
    private final Map<String, ElemType> elementTypes;
    private final Map<String, Double> elementValues;
    private final Map<String, List<Integer>> recurrences;
    private final Map<String, String> names;
    private final Map<String, RelationsType> relationTypes;
    private final Map<String, List<String>> sourceTarget;
    private final Map<String, Double> relationValues;
    private final Map<String, Operant> operants;
    private final Map<String, String> attrToObj;
    private final Map<String, List<String>> objAttrs;
    private final Map<String, Double> attrInitials;

    private final String targetLocation = "C:\\Users\\melle\\IdeaProjects\\oes\\JavaScript\\Core0\\Generated\\";

    public Generator(ParseTree elementTree, ParseTree relationTree) {
        ElementsMapper elMapper = new ElementsMapper();
        elMapper.runMapper(elementTree);
        elementTypes = elMapper.getTypes();
        elementValues = elMapper.getValues();
        recurrences = elMapper.getRecurrences();
        names = elMapper.getNames();

        RelationsMapper relMapper = new RelationsMapper();
        relMapper.runMapper(relationTree);
        relationTypes = relMapper.getTypes();
        sourceTarget = relMapper.getSourceTarget();
        relationValues = relMapper.getValues();
        operants = relMapper.getOperants();

        attrToObj = new HashMap<>();
        objAttrs = new HashMap<>();
        attrInitials = new HashMap<>();
        buildObjAttrs();
    }

    public void genSim() throws IOException {
        copyStandardFiles();
        List<String> events = new ArrayList<>();
        List<String> objects = new ArrayList<>();
        for (String elId : elementTypes.keySet()) {
            if (elementTypes.get(elId) == ElemType.OBJECT) {
                objects.add(elId);
            } else if (elementTypes.get(elId) == ElemType.EVENT) {
                events.add(elId);
            }
        }
        setAttrInitials(objects);
        for (String id : events) {
            genEvent(id);
        }
        for (String id : objects) {
            genObject(id);
        }
        File file = new File(targetLocation + "simulation.js");
        FileWriter writer = new FileWriter(file.getPath());
        StringBuilder simulationText = new StringBuilder();
        List<String> eventNames = new ArrayList<>();
        List<String> objectNames = new ArrayList<>();
        for (String id : events) {
            eventNames.add(names.get(id));
        }
        for (String id : objects) {
            objectNames.add(names.get(id));
        }
        simulationText.append(CodeHelper.writeSimulationSetup(objectNames, eventNames, askTimeLimit()));
        simulationText.append(CodeHelper.writeObjectDeclaration(objects, names));
        for (String startEvent : findStartEvents(events)) {
            simulationText.append(CodeHelper.writeStartEvent(names.get(startEvent), getEventObjects(getRelations(startEvent))));
        }
        simulationText.append("}\n");
        simulationText.append(CodeHelper.writeStatisticSetup(objAttrs, names, attrInitials));

        writer.append(simulationText);
        writer.flush();
    }

    private void copyStandardFiles() throws IOException {
        Path simWorkerTarget = Paths.get(targetLocation + "\\simulation-worker.js");
        Path simWorkerSource = Paths.get("src\\generator\\simulation-worker.js");
        Files.copy(simWorkerSource, simWorkerTarget, StandardCopyOption.REPLACE_EXISTING);

        Path indexTarget = Paths.get(targetLocation + "\\index.html");
        Path indexSource = Paths.get("src\\generator\\index.html");
        Files.copy(indexSource, indexTarget, StandardCopyOption.REPLACE_EXISTING);
    }

    private void buildObjAttrs() {
        for (String id : elementTypes.keySet()) {
            if (elementTypes.get(id) == ElemType.OBJECT) {
                List<String> attributeIds = new ArrayList<>();
                List<String> objectRels = getRelations(id);
                for (String relId : objectRels) {
                    List<String> elIds = sourceTarget.get(relId);
                    if (relationTypes.get(relId) == RelationsType.ASSOCIATION) {
                        for (String i : elIds) {
                            if (elementTypes.get(i) == ElemType.ATTRIBUTE) {
                                attributeIds.add(i);
                                attrToObj.put(i, id);
                            }
                        }
                    }
                }
                objAttrs.put(id, attributeIds);
            }
        }
    }

    private void setAttrInitials(List<String> objects) {
        for (String objId : objects) {
            List<String> attributeIds = objAttrs.get(objId);
            for (String attrId : attributeIds) {
                List<String> attrRels = getRelations(attrId);
                for (String relId : attrRels) {
                    List<String> elIds = sourceTarget.get(relId);
                    if (relationTypes.get(relId) == RelationsType.ASSOCIATION) {
                        for (String i : elIds) {
                            if (elementTypes.get(i) == ElemType.INITIAL) {
                                attrInitials.put(attrId, elementValues.get(i));
                            }
                        }
                    }
                }
            }
        }
    }

    public void genObject(String id) throws IOException {
        String name = names.get(id).replaceAll(" ", "");
        name = name.replaceAll("\"", "");
        File file = new File(targetLocation + name + ".js");
        FileWriter writer = new FileWriter(file.getPath());
        StringBuilder result = new StringBuilder(CodeHelper.objectConstructor(name));

        List<String> attributeIds = objAttrs.get(id);
        for (String attrId : attributeIds) {
            result.append(String.format("        this.%s = %s;\n", names.get(attrId), attrInitials.get(attrId)));
        }
        result.append("     } \n}");
        writer.append(result);
        writer.flush();
    }

    public void genEvent(String id) throws IOException {
        String name = names.get(id).replaceAll(" ", "");
        name = name.replaceAll("\"", "");
        File file = new File(targetLocation + name + ".js");
        FileWriter writer = new FileWriter(file.getPath());

        List<String> relations = getRelations(id);
        List<String> objects = getEventObjects(relations);
        StringBuilder result = new StringBuilder(CodeHelper.eventConstructor(name, objects));
        result.append("    } \n");

        result.append("\n   onEvent() {\n" +
                "       var followUpEvents = [];\n");
        for (String relId : relations) {
            if (relationTypes.get(relId) == RelationsType.INFLUENCES) {
                String attrId = sourceTarget.get(relId).get(1);
                String attrName = names.get(attrId);
                Operant op = operants.get(relId);
                Double value = relationValues.get(relId);
                result.append(CodeHelper.writeAssignment(names.get(attrToObj.get(attrId)), attrName, op, value));
            }
        }

        for (String relId : relations) {
            if (relationTypes.get(relId) == RelationsType.TRIGGERING && sourceTarget.get(relId).get(0).equals(id)) {
                Double likelihood = getLikelihood(relId);
                if (likelihood == null) {
                    likelihood = 1.0;
                }
                String subjectName = names.get(sourceTarget.get(relId).get(1));
                result.append(CodeHelper.writeEventTrigger(subjectName, likelihood, getEventObjects(getRelations(sourceTarget.get(relId).get(1)))));
            }
        }

        result.append("       return followUpEvents;\n" +
                "   }\n");

        if (getRecurrence(relations) != null) {
            result.append(CodeHelper.writeRecurrence(name, getRecurrence(relations), objects));
        }

        result.append("}");
        writer.append(result);
        writer.flush();

    }

    private Double getLikelihood(String relId) {
        for (String relId2 : getRelations(relId)) {
            for (String id : sourceTarget.get(relId2)) {
                if (elementValues.containsKey(id)) {
                    return elementValues.get(id) / 100;
                } else {
                    return 1.0;
                }
            }
        }
        return null;
    }

    private List<Integer> getRecurrence(List<String> relations) {
        for (String relId : relations) {
            if (recurrences.containsKey(sourceTarget.get(relId).get(0))) {
                return recurrences.get(sourceTarget.get(relId).get(0));
            } else if(recurrences.containsKey(sourceTarget.get(relId).get(1))) {
                return recurrences.get(sourceTarget.get(relId).get(1));
            }
        }
        return null;
    }

    private List<String> getEventObjects(List<String> relations) {
        List<String> objects = new ArrayList<>();
        for (String relId : relations) {
            if (relationTypes.get(relId) == RelationsType.ASSOCIATION) {
                if (elementTypes.get(sourceTarget.get(relId).get(0)) == ElemType.OBJECT) {
                    objects.add(names.get(sourceTarget.get(relId).get(0)));
                } else if (elementTypes.get(sourceTarget.get(relId).get(1)) == ElemType.OBJECT) {
                    objects.add(names.get(sourceTarget.get(relId).get(1)));
                }
            }
        }
        return objects;
    }

    private List<String> getRelations(String id) {
        List<String> result = new ArrayList<>();
        for (String relId : sourceTarget.keySet()) {
            if (sourceTarget.get(relId).contains(id)) {
                result.add(relId);
            }
        }
        return result;
    }

    private List<String> findStartEvents(List<String> events) {
        List<String> result = new ArrayList<>();
        List<String> nonStart = new ArrayList<>();
        for (String relId : sourceTarget.keySet()) {
            if (relationTypes.get(relId) == RelationsType.TRIGGERING) {
                nonStart.add(sourceTarget.get(relId).get(1));
            }
        }
        for (String relId : events) {
            if (!nonStart.contains(relId)) {
                result.add(relId);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        File elementsFile = new File("src\\examples/elements.csv");
        CharStream charStream = CharStreams.fromPath(Paths.get(elementsFile.getPath()));
        Lexer lexer = new ElementsGrammarLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        ElementsGrammarParser elementsParser = new ElementsGrammarParser(tokens);
        ParseTree elementsTree = elementsParser.csvFile();

        File relationsFile = new File("src\\examples/relations.csv");
        charStream = CharStreams.fromPath(Paths.get(relationsFile.getPath()));
        lexer = new RelationsGrammarLexer(charStream);
        tokens = new CommonTokenStream(lexer);
        RelationsGrammarParser relationsParser = new RelationsGrammarParser(tokens);
        ParseTree relationsTree = relationsParser.csvFile();

        Generator gen = new Generator(elementsTree, relationsTree);
        gen.genSim();
    }

    public static Integer askTimeLimit() {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;
        Integer result = null;
        System.out.println("Please enter a time limit (in simulation turns): ");
        while (!success) {
            try {
                success = true;
                result = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input, please enter a whole number.");
                success = false;
            }
        }
        return result;
    }

}
