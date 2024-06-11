package generator;

import grammars.ElementsGrammarBaseVisitor;
import grammars.ElementsGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementsMapper extends ElementsGrammarBaseVisitor<Object> {
    private Map<String, ElemTypes> types = new HashMap<>();
    private Map<String, Double> values = new HashMap<>();
    private Map<String, List<Integer>> recurrences = new HashMap<>();

    public ElementsMapper() {
        types = new HashMap<>();
        values = new HashMap<>();
        recurrences = new HashMap<>();
    }

    public void runMapper(ParseTree parseTree) {
        visit(parseTree);
    }

    @Override
    public Object visitRow(ElementsGrammarParser.RowContext ctx) {
        types.put(ctx.IDENTIFIER().getText(), (ElemTypes) visit(ctx.type()));
        if (types.get(ctx.IDENTIFIER().getText()) == ElemTypes.CONSTRAINT) {
            if (ctx.name().getText().contains("Initial")) {
                types.replace(ctx.IDENTIFIER().getText(), ElemTypes.INITIAL);
                Double initial = Double.parseDouble(ctx.name().getText().replaceAll("[^0-9|.]", ""));
                values.put(ctx.IDENTIFIER().getText(), initial);
            } else if (ctx.name().getText().contains("Range")) {
                types.replace(ctx.IDENTIFIER().getText(), ElemTypes.RANGE);
            }
        } else if (types.get(ctx.IDENTIFIER().getText()) == ElemTypes.ASSESSMENT) {
            if (ctx.name().getText().contains("Likelihood")) {
                types.replace(ctx.IDENTIFIER().getText(), ElemTypes.LIKELIHOOD);
                Double chance = Double.parseDouble(ctx.name().getText().replaceAll("[^0-9|.]", ""));
                values.put(ctx.IDENTIFIER().getText(), chance);
            } else if (ctx.name().getText().contains("Recurrence")) {
                types.replace(ctx.IDENTIFIER().getText(), ElemTypes.RECURRENCE);
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
        return ElemTypes.OBJECT;
    }

    @Override
    public Object visitEvent(ElementsGrammarParser.EventContext ctx) {
        return ElemTypes.EVENT;
    }

    @Override
    public Object visitOther(ElementsGrammarParser.OtherContext ctx) {
        if (ctx.VALUE() != null) {
            return ElemTypes.ATTRIBUTE;
        } else if (ctx.ASSESSMENT() != null) {
            return ElemTypes.ASSESSMENT;
        } else if (ctx.CONSTRAINT() != null) {
            return ElemTypes.CONSTRAINT;
        }
        return null;
    }

    public Map<String, ElemTypes> getTypes() {
        return types;
    }

    public Map<String, Double> getValues() {
        return values;
    }

    public Map<String, List<Integer>> getRecurrences() {
        return recurrences;
    }
}
