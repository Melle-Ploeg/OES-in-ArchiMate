// Generated from C:/Users/melle/IdeaProjects/OES-in-ArchiMate/src/grammars/RelationsGrammar.g4 by ANTLR 4.13.1
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RelationsGrammarParser}.
 */
public interface RelationsGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RelationsGrammarParser#csvFile}.
	 * @param ctx the parse tree
	 */
	void enterCsvFile(RelationsGrammarParser.CsvFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationsGrammarParser#csvFile}.
	 * @param ctx the parse tree
	 */
	void exitCsvFile(RelationsGrammarParser.CsvFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationsGrammarParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(RelationsGrammarParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationsGrammarParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(RelationsGrammarParser.HdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationsGrammarParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(RelationsGrammarParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationsGrammarParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(RelationsGrammarParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationsGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(RelationsGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationsGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(RelationsGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationsGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(RelationsGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationsGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(RelationsGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationsGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RelationsGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationsGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RelationsGrammarParser.TypeContext ctx);
}