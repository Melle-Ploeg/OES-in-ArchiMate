// Generated from C:/Users/melle/IdeaProjects/OES-in-ArchiMate/src/grammars/RelationsGrammar.g4 by ANTLR 4.13.1
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RelationsGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RelationsGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RelationsGrammarParser#csvFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsvFile(RelationsGrammarParser.CsvFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationsGrammarParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(RelationsGrammarParser.HdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationsGrammarParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(RelationsGrammarParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationsGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(RelationsGrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationsGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(RelationsGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationsGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RelationsGrammarParser.TypeContext ctx);
}