import grammars.ElementsGrammarLexer;
import grammars.ElementsGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class ElementsGrammarTester {

    public static void main(String[] args) throws IOException {
        File exampleFile = new File("src\\examples/elements.csv");
        CharStream charStream = CharStreams.fromPath(Paths.get(exampleFile.getPath()));
        Lexer lexer = new ElementsGrammarLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        ElementsGrammarParser parser = new ElementsGrammarParser(tokens);
        ElementsGrammarParser.CsvFileContext tree = parser.csvFile();
        System.out.println(tree.row(6).name().STRING());
        System.out.println("asd2.3".replaceAll("[^0-9|.]", ""));
    }
}
