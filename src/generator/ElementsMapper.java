package generator;

import grammars.ElementsGrammarBaseVisitor;
import grammars.ElementsGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementsMapper extends ElementsGrammarBaseVisitor<Object> {
    private final Map<String, ElemType> types;
    private final Map<String, Double> values;
    private final Map<String, List<Integer>> recurrences;
    private final Map<String, String> names;

    public ElementsMapper() {
        types = new HashMap<>();
        values = new HashMap<>();
        recurrences = new HashMap<>();
        names = new HashMap<>();
    }

    public void runMapper(ParseTree parseTree) {
        visit(parseTree);
    }

    @Override
    public Object visitRow(ElementsGrammarParser.RowContext ctx) {
        types.put(ctx.IDENTIFIER().getText(), (ElemType) visit(ctx.type()));
        names.put(ctx.IDENTIFIER().getText(), ctx.name().getText().replaceAll("[ |\"]", ""));
        if (types.get(ctx.IDENTIFIER().getText()) == ElemType.CONSTRAINT) {
            if (ctx.name().getText().contains("Initial")) {
                types.replace(ctx.IDENTIFIER().getText(), ElemType.INITIAL);
                Double initial = Double.parseDouble(ctx.name().getText().replaceAll("[^0-9|.]", ""));
                values.put(ctx.IDENTIFIER().getText(), initial);
            } else if (ctx.name().getText().contains("Range")) {
                types.replace(ctx.IDENTIFIER().getText(), ElemType.RANGE);
            }
        } else if (types.get(ctx.IDENTIFIER().getText()) == ElemType.ASSESSMENT) {
            if (ctx.name().getText().contains("Likelihood")) {
                types.replace(ctx.IDENTIFIER().getText(), ElemType.LIKELIHOOD);
                Double chance = Double.parseDouble(ctx.name().getText().replaceAll("[^0-9|.]", ""));
                values.put(ctx.IDENTIFIER().getText(), chance);
            } else if (ctx.name().getText().contains("Recurrence")) {
                types.replace(ctx.IDENTIFIER().getText(), ElemType.RECURRENCE);
                List<Integer> vals = new ArrayList<>();
                for (String str : ctx.name().getText().split("-")) {
                    vals.add(Integer.parseInt(str.replaceAll("[^0-9]", "")));
                }
                recurrences.put(ctx.IDENTIFIER().getText(), vals);
            }
        }
        return null;
    }

    @Override
    public Object visitObject(ElementsGrammarParser.ObjectContext ctx) {
        return ElemType.OBJECT;
    }

    @Override
    public Object visitEvent(ElementsGrammarParser.EventContext ctx) {
        return ElemType.EVENT;
    }

    @Override
    public Object visitOther(ElementsGrammarParser.OtherContext ctx) {
        if (ctx.VALUE() != null) {
            return ElemType.ATTRIBUTE;
        } else if (ctx.ASSESSMENT() != null) {
            return ElemType.ASSESSMENT;
        } else if (ctx.CONSTRAINT() != null) {
            return ElemType.CONSTRAINT;
        }
        return null;
    }

    public Map<String, ElemType> getTypes() {
        return types;
    }

    public Map<String, Double> getValues() {
        return values;
    }

    public Map<String, List<Integer>> getRecurrences() {
        return recurrences;
    }

    public Map<String, String> getNames() {
        return names;
    }
}
