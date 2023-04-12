// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link julParser}.
 */
public interface julListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link julParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(julParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link julParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(julParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expUn}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpUn(julParser.ExpUnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expUn}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpUn(julParser.ExpUnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expTabValue}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpTabValue(julParser.ExpTabValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expTabValue}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpTabValue(julParser.ExpTabValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expBin}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpBin(julParser.ExpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expBin}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpBin(julParser.ExpBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expConst}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpConst(julParser.ExpConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expConst}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpConst(julParser.ExpConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expInt}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpInt(julParser.ExpIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expInt}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpInt(julParser.ExpIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpPar(julParser.ExpParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpPar(julParser.ExpParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expCall}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpCall(julParser.ExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCall}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpCall(julParser.ExpCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expId}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpId(julParser.ExpIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expId}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpId(julParser.ExpIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expRead}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpRead(julParser.ExpReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expRead}
	 * labeled alternative in {@link julParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpRead(julParser.ExpReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link julParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(julParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link julParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(julParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link julParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(julParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link julParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(julParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcuIncr}
	 * labeled alternative in {@link julParser#calcu}.
	 * @param ctx the parse tree
	 */
	void enterCalcuIncr(julParser.CalcuIncrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcuIncr}
	 * labeled alternative in {@link julParser#calcu}.
	 * @param ctx the parse tree
	 */
	void exitCalcuIncr(julParser.CalcuIncrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcuDecr}
	 * labeled alternative in {@link julParser#calcu}.
	 * @param ctx the parse tree
	 */
	void enterCalcuDecr(julParser.CalcuDecrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcuDecr}
	 * labeled alternative in {@link julParser#calcu}.
	 * @param ctx the parse tree
	 */
	void exitCalcuDecr(julParser.CalcuDecrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcuAff}
	 * labeled alternative in {@link julParser#calcu}.
	 * @param ctx the parse tree
	 */
	void enterCalcuAff(julParser.CalcuAffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcuAff}
	 * labeled alternative in {@link julParser#calcu}.
	 * @param ctx the parse tree
	 */
	void exitCalcuAff(julParser.CalcuAffContext ctx);
	/**
	 * Enter a parse tree produced by {@link julParser#pv}.
	 * @param ctx the parse tree
	 */
	void enterPv(julParser.PvContext ctx);
	/**
	 * Exit a parse tree produced by {@link julParser#pv}.
	 * @param ctx the parse tree
	 */
	void exitPv(julParser.PvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instReturn}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstReturn(julParser.InstReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instReturn}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstReturn(julParser.InstReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrAffTab}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstrAffTab(julParser.InstrAffTabContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrAffTab}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstrAffTab(julParser.InstrAffTabContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instCalcu}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstCalcu(julParser.InstCalcuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instCalcu}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstCalcu(julParser.InstCalcuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instDecl}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstDecl(julParser.InstDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instDecl}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstDecl(julParser.InstDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instPrint}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstPrint(julParser.InstPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instPrint}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstPrint(julParser.InstPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instIf}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstIf(julParser.InstIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instIf}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstIf(julParser.InstIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instWhile}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstWhile(julParser.InstWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instWhile}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstWhile(julParser.InstWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instFor}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstFor(julParser.InstForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instFor}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstFor(julParser.InstForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instList}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstList(julParser.InstListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instList}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstList(julParser.InstListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instDeclTab}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInstDeclTab(julParser.InstDeclTabContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instDeclTab}
	 * labeled alternative in {@link julParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInstDeclTab(julParser.InstDeclTabContext ctx);
	/**
	 * Enter a parse tree produced by {@link julParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(julParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link julParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(julParser.ProgramContext ctx);
}