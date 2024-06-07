import grammars.RelationsGrammarLexer;
import grammars.RelationsGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class RelationsGrammarTester {

    public static void main(String[] args) throws IOException {
        File exampleFile = new File("src\\examples/relations.csv");
        CharStream charStream = CharStreams.fromPath(Paths.get(exampleFile.getPath()));
        Lexer lexer = new RelationsGrammarLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        RelationsGrammarParser parser = new RelationsGrammarParser(tokens);
        RelationsGrammarParser.CsvFileContext tree = parser.csvFile();
        System.out.println(tree.row(6).IDENTIFIER(1).toStringTree());
    }
}
