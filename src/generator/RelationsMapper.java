package generator;

import grammars.RelationsGrammarBaseVisitor;
import grammars.RelationsGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelationsMapper extends RelationsGrammarBaseVisitor<Object> {
    private final Map<String, RelationsType> types;
    private final Map<String, List<String>> sourceTarget;
    private final Map<String, Double> values;
    private final Map<String, Operant> operants;


    public RelationsMapper() {
        types = new HashMap<>();
        sourceTarget = new HashMap<>();
        values = new HashMap<>();
        operants = new HashMap<>();
    }

    public void runMapper(ParseTree parseTree) {
        visit(parseTree);
    }

    @Override
    public Object visitRow(RelationsGrammarParser.RowContext ctx) {
        String ID = ctx.IDENTIFIER(0).getText();
        RelationsType type = (RelationsType) visit(ctx.type());
        types.put(ID, type);

        List<String> list = new ArrayList<>();
        list.add(ctx.IDENTIFIER(1).getText());
        list.add(ctx.IDENTIFIER(2).getText());
        sourceTarget.put(ID, list);

        if (type == RelationsType.INFLUENCES) {
            Double value = Double.parseDouble(ctx.name().getText().replaceAll("[^0-9|.]", ""));
            values.put(ID, value);
            operants.put(ID, parseOp(ctx.name().getText()));
        }
        return null;
    }

    @Override
    public Object visitType(RelationsGrammarParser.TypeContext ctx) {
        if (ctx.ASSOCIATIONRELATIONSHIP() != null) {
            return RelationsType.ASSOCIATION;
        } else if (ctx.INFLUENCERELATIONSHIP() != null) {
            return RelationsType.INFLUENCES;
        } else if (ctx.TRIGGERINGRELATIONSHIP() != null) {
            return RelationsType.TRIGGERING;
        }
        return null;
    }

    public Map<String, RelationsType> getTypes() {
        return types;
    }

    public Map<String, List<String>> getSourceTarget() {
        return sourceTarget;
    }

    public Map<String, Double> getValues() {
        return values;
    }

    public Map<String, Operant> getOperants() {
        return operants;
    }

    private Operant parseOp(String str) {
        if (str.contains("+")) {
            return Operant.PLUS;
        } else if (str.contains("-")) {
            return Operant.MINUS;
        } else if (str.contains("*")) {
            return Operant.MULT;
        } else if (str.contains("/")) {
            return Operant.DIV;
        }
        return null;
    }
}
