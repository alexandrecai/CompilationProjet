// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link julParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface julVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link julParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(julParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expUn}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpUn(julParser.ExpUnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expBin}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBin(julParser.ExpBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expConst}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpConst(julParser.ExpConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expInt}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInt(julParser.ExpIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPar(julParser.ExpParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCall}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCall(julParser.ExpCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expId}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpId(julParser.ExpIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expRead}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRead(julParser.ExpReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link julParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(julParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link julParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(julParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcuIncr}
	 * labeled alternative in {@link julParser#calcu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcuIncr(julParser.CalcuIncrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcuDecr}
	 * labeled alternative in {@link julParser#calcu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcuDecr(julParser.CalcuDecrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcuAff}
	 * labeled alternative in {@link julParser#calcu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcuAff(julParser.CalcuAffContext ctx);
	/**
	 * Visit a parse tree produced by {@link julParser#pv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPv(julParser.PvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instReturn}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstReturn(julParser.InstReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instCalcu}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstCalcu(julParser.InstCalcuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instDecl}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstDecl(julParser.InstDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instPrint}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstPrint(julParser.InstPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instIf}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstIf(julParser.InstIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instWhile}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstWhile(julParser.InstWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instFor}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstFor(julParser.InstForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instList}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstList(julParser.InstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link julParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(julParser.ProgramContext ctx);
}