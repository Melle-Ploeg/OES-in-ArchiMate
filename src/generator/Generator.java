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
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    }

    public void genObject(String id) throws IOException {
        String name = names.get(id).replaceAll(" ", "");
        name = name.replaceAll("\"", "");
        File file = new File("src\\generatedSim\\" + name + ".js");
        FileWriter writer = new FileWriter(file.getPath());
        StringBuilder result = new StringBuilder(CodeHelper.objectConstructor(name));

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

        for (String attrId : attributeIds) {
            List<String> attrRels = getRelations(attrId);
            for (String relId : attrRels) {
                List<String> elIds = sourceTarget.get(relId);
                if (relationTypes.get(relId) == RelationsType.ASSOCIATION) {
                    for (String i : elIds) {
                        if (elementTypes.get(i) == ElemType.INITIAL) {
                            result.append(String.format("       this.%s = %s;\n", names.get(attrId), elementValues.get(i)));
                        }
                    }
                }
            }
        }

        if (recurrences.containsKey(id)) {

        }


        result.append("     } \n}");
        writer.append(result);
        writer.flush();
    }

    public void genEvent(String id) throws IOException {
        String name = names.get(id).replaceAll(" ", "");
        name = name.replaceAll("\"", "");
        File file = new File("src\\generatedSim\\" + name + ".js");
        FileWriter writer = new FileWriter(file.getPath());

        List<String> relations = getRelations(id);
        List<String> objects = getEventObjects(relations);
        StringBuilder result = new StringBuilder(CodeHelper.eventConstructor(name, objects));
        result.append("    } \n");

        result.append("\n   onEvent() {\n" +
                "       var followUpEvents = [];\n");
        for (String relId : relations) {
            if (relationTypes.get(relId) == RelationsType.INFLUENCES) {
                String objectName = names.get(sourceTarget.get(relId).get(1));
                Operant op = operants.get(relId);
                Double value = relationValues.get(relId);
                result.append(CodeHelper.writeAssignment(name, objectName, op, value));
            }
        }
        result.append("       return followUpEvents;\n" +
                "   }\n");

        result.append("}");
        writer.append(result);
        writer.flush();

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
        gen.genObject("\"id-369163e55b7a4bc2b87629ba91edb51c\"");
        gen.genEvent("\"id-c0745dc9412145a4920db1865e7e3af2\"");
    }

}
