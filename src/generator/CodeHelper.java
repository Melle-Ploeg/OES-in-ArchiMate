package generator;

import java.util.List;

public class CodeHelper {

    public static String objectConstructor(String name) {
        String result = String.format("class %s extends oBJECT { \n", name);
        result += "   constructor({id, name}) { \n";
        result += "   super(id, name);\n";
        return result;
    }

    public static String eventConstructor(String name, List<String> objects) {
        StringBuilder result = new StringBuilder(String.format("class %s extends eVent { \n" +
                "   constructor({delay", name));
        for (String s : objects) {
            result.append(String.format(", %s", s));
        }
        result.append("}) {\n" +
                "       super(delay);\n");
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
            result.append(String.format("        return %s;\n", recurrences.getFirst()));
        } else {
            result.append(String.format("return math.getUniformRandomInteger(%s, %s);\n", recurrences.getFirst(), recurrences.get(1)));
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

}
