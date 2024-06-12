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

}
