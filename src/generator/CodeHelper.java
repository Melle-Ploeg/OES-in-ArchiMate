package generator;

import java.util.List;
import java.util.Map;

/**
 * This class contains code to generate several types of code
 */
public class CodeHelper {

    /**
     * Writes an object's constructor
     * @param name The object's name
     * @return The start of an object constructor
     */
    public static String objectConstructor(String name) {
        String result = String.format("class %s extends oBJECT { \n", name);
        result += "    constructor({id, name}) { \n";
        result += "        super(id, name);\n";
        return result;
    }

    /**
     * Writes an event's constructor
     * @param name The event's name
     * @param objects Names of the objects the event will be constructed with
     * @return A complete event constructor
     */
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

    /**
     * Writes an assignment event rule
     * @param objectName Name of object whose attribute is to be changed
     * @param attrName Name of attribute to be changed
     * @param op Operant of assignment
     * @param value Value in equation
     * @return Assignment and simulation assignment line
     */
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

    /**
     * Writes the recurrence functions of an event
     * @param name Name of event
     * @param recurrences List of 1 or 2 long, describing either a static recurrence or a range of recurrence
     * @param objects Objects used as arguments in event's constructor
     * @return Next event creation and recurrence getter methods
     */
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

    /**
     * Writes the code for a triggering event rule
     * @param subjectName Name of event to be triggered
     * @param likelihood Chance of event to be triggered. Use 1.0 if the chance of 100%
     * @param argNames Names of arguments to be passed to created event
     * @return Code triggering an event, with probability
     */
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

    /**
     * Declares the time limit, object types, and event types for the simulation
     * @param objectNames List of objects in this simulation
     * @param eventNames List of events in this simulation
     * @param timeLimit Time limit of this simulation
     * @return Code for simulation settings
     */
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

    /**
     * Writes code for declaration of simulation objects
     * @param objIds List of sim object IDs
     * @param names Map of object IDs to names
     * @return Code that declares simulation objects
     */
    public static StringBuilder writeObjectDeclaration(List<String> objIds, Map<String, String> names) {
        StringBuilder result = new StringBuilder();
        for (String objId : objIds) {
            String name = names.get(objId);
            result.append(String.format("    var %sDef = new %s({id: %s, name: \"%s\"});\n",
                    name, name, objId, name));
        }
        return result;
    }

    /**
     * Writes code to put a starting event on the future events list
     * @param eventName Name of starting event
     * @param arguments Arguments of starting event
     * @return Line of code that puts the given event on the FEL
     */
    public static StringBuilder writeStartEvent(String eventName, List<String> arguments) {
        StringBuilder result = new StringBuilder(String.format("    sim.FEL.add(new %s({delay:0", eventName));
        for (String argument : arguments) {
            result.append(String.format(", %s: %sDef", argument, argument));
        }
        result.append("}));\n");
        return result;
    }

    /**
     * Sets the initial values for all attributes in this simulation for the statistics
     * @param objAttrs Map of object to attribute IDs
     * @param names Map of element names
     * @param attrInitials Map of attribute initial values
     * @return Code initialising the attributes for the simulation statistics
     */
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
