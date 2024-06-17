package generator;

import java.util.List;
import java.util.Map;

public class CodeHelper {

    public static String objectConstructor(String name) {
        String result = String.format("class %s extends oBJECT { \n", name);
        result += "    constructor({id, name}) { \n";
        result += "        super(id, name);\n";
        return result;
    }

    public static String eventConstructor(String name, List<String> objects) {
        StringBuilder result = new StringBuilder(String.format("class %s extends eVENT { \n" +
                "   constructor({delay", name));
        for (String s : objects) {
            result.append(String.format(", %s", s));
        }
        result.append("}) {\n" +
                "       super({delay: delay});\n");
        for (String s : objects) {
            result.append(String.format("       this.%s = %s;\n", s, s));
        }
        return result.toString();
    }

    public static StringBuilder writeAssignment(String objectName, String attrName, Operant op, Double value) {
        StringBuilder result = new StringBuilder(String.format("       this.%s.%s = this.%s.%s ", objectName, attrName, objectName, attrName));
        StringBuilder simStat = new StringBuilder(String.format("       sim.stat.%s%s = sim.stat.%s%s ", objectName, attrName, objectName, attrName));
        switch (op) {
            case DIV:
                result.append("/ ");
                simStat.append("/ ");
                break;
            case MULT:
                result.append("* ");
                simStat.append("* ");
                break;
            case PLUS:
                result.append("+ ");
                simStat.append("+ ");
                break;
            case MINUS:
                result.append("- ");
                simStat.append("- ");
                break;
        }
        result.append(String.format("%s;\n", value));
        simStat.append(String.format("%s;\n", value));
        result.append(simStat);
        return result;
    }

    public static StringBuilder writeRecurrence(String name, List<Integer> recurrences, List<String> objects) {
        StringBuilder result = new StringBuilder(String.format("    createNextEvent() {\n" +
                "       return new %s({delay: %s.recurrence()", name, name));
        for (String arg : objects) {
            result.append(String.format(", %s: this.%s", arg, arg));
        }
        result.append("});\n    }\n");

        result.append("    static recurrence() {\n");
        if (recurrences.size() == 1) {
            result.append(String.format("        return %s;\n", recurrences.get(0)));
        } else {
            result.append(String.format("return math.getUniformRandomInteger(%s, %s);\n", recurrences.get(0), recurrences.get(1)));
        }
        result.append("    }\n");
        return result;
    }

    public static StringBuilder writeEventTrigger(String subjectName, Double likelihood, List<String> argNames) {
        StringBuilder result = new StringBuilder();
        result.append(String.format("       if(Math.random() < %s) {\n    ", likelihood));
        result.append(String.format("        followUpEvents.push(new %s({", subjectName));
        for (int i = 0; i < argNames.size(); i++) {
            result.append(String.format("%s: this.%s", argNames.get(i), argNames.get(i)));
            if (!(i == argNames.size() - 1)) {
                result.append(", ");
            }
        }
        result.append("}));\n       }\n");
        return result;
    }

    public static StringBuilder writeSimulationSetup(List<String> objectNames, List<String> eventNames, int timeLimit) {
        StringBuilder result = new StringBuilder(String.format("sim.scenario.durationInSimTime = %s;\n", timeLimit));
        result.append("sim.model.time = \"discrete\";\n");
        result.append("sim.model.timeUnit = \"min\";\n\n");
        result.append("sim.model.objectTypes = [");
        for (int i = 0; i < objectNames.size(); i++) {
            result.append(String.format("\"%s\"", objectNames.get(i)));
            if (i < objectNames.size() - 1) {
                result.append(", ");
            }
        }
        result.append("];\n");
        result.append("sim.model.eventTypes = [");
        for (int i = 0; i < eventNames.size(); i++) {
            result.append(String.format("\"%s\"", eventNames.get(i)));
            if (i < eventNames.size() - 1) {
                result.append(", ");
            }
        }
        result.append("];\n");
        result.append("sim.scenario.setupInitialState = function () {\n");
        return result;
    }

    public static StringBuilder writeObjectDeclaration(List<String> objIds, Map<String, String> names) {
        StringBuilder result = new StringBuilder();
        for (String objId : objIds) {
            String name = names.get(objId);
            result.append(String.format("    var %sDef = new %s({id: %s, name: \"%s\"});\n",
                    name, name, objId, name));
        }
        return result;
    }

    public static StringBuilder writeStartEvent(String eventName, List<String> arguments) {
        StringBuilder result = new StringBuilder(String.format("    sim.FEL.add(new %s({delay:0", eventName));
        for (String argument : arguments) {
            result.append(String.format(", %s: %sDef", argument, argument));
        }
        result.append("}));\n");
        return result;
    }

    public static StringBuilder writeStatisticSetup(Map<String, List<String>> objAttrs, Map<String, String> names, Map<String, Double> attrInitials) {
        StringBuilder result = new StringBuilder("sim.model.setupStatistics = function() {\n");
        for (String objId : objAttrs.keySet()) {
            String objName = names.get(objId);
            for (String attrId : objAttrs.get(objId)) {
                String attrName = names.get(attrId);
                Double value = attrInitials.get(attrId);
                result.append(String.format("    sim.stat.%s%s = %s;\n", objName, attrName, value));
            }
        }
        result.append("};\n");
        return result;
    }

}
