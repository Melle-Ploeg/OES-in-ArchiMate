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

    public static String writeRecurrence(String name, List<Integer> recurrences, List<String> objects) {
        String result = String.format("    createNextEvent() {\n" +
                "       return new %s({delay");

        return null;
    }

}
