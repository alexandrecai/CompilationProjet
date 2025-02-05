package ast;
import parser.julBaseVisitor;
import parser.julParser;

import java.util.ArrayList;
import java.util.List;

import static ast.Position.getPos;

public class AstBuild extends julBaseVisitor<Node>{

    @Override
    public Node visitExpInt(julParser.ExpIntContext ctx){
        int n = Integer.parseInt(ctx.INT().getText());
        ExpInt exp = new ExpInt(n);
        exp.setPos(getPos(ctx));
        return exp;
    }

    @Override
    public Node visitExpConst(julParser.ExpConstContext ctx) {
        boolean n = Boolean.parseBoolean( ctx.Const().getText());
        Const exp = new Const(n);
        exp.setPos(getPos(ctx));
        return exp;
    }

    @Override
    public Node visitExpId(julParser.ExpIdContext ctx) {
        String n = ctx.ID().getText();
        ExpId exp = new ExpId(n);
        exp.setPos(getPos(ctx));
        return exp;

    }

    @Override
    public Node visitExpBin(julParser.ExpBinContext ctx) {
        Exp eg = (Exp)ctx.exp(0).accept(this);
        String strOp = ctx.Op().getText();
        Exp ed = (Exp)ctx.exp(1).accept(this);
        Op op=switch(strOp){
            case "-" -> Op.MOINS;
            case "+" -> Op.PLUS;
            case "*" -> Op.PRODUIT;
            case "not" -> Op.NEG;
            case "abs" -> Op.VALEURABSOLUE;
            case "<" -> Op.INF;
            case ">" -> Op.SUP;
            case "&&" -> Op.ET;
            case "||" -> Op.OU;
            case "/" -> Op.DIV;
            case "==" -> Op.EGALEGAL;
            default -> throw new IllegalStateException("Opérateur inconnu ou non implémenté");
        };
        ExpBin exp = new ExpBin(eg, op, ed);
        exp.setPos(getPos(ctx));
        return exp;
    }

    @Override
    public Node visitExpPar(julParser.ExpParContext ctx) {
        Exp n = (Exp) ctx.exp().accept(this);
        ExpPar exp = new ExpPar("(", ")", n);
        exp.setPos(getPos(ctx));
        return exp;
    }

    @Override
    public Node visitExpUn(julParser.ExpUnContext ctx) {
        Exp e = (Exp)ctx.exp().accept(this);
        String strOp = ctx.Op().getText();
        Op op=switch(strOp){
            case "-" -> Op.MOINS;
            case "+" -> Op.PLUS;
            case "*" -> Op.PRODUIT;
            case "not" -> Op.NEG;
            case "abs" -> Op.VALEURABSOLUE;
            case "<" -> Op.INF;
            case ">" -> Op.SUP;
            case "&&" -> Op.ET;
            case "||" -> Op.OU;
            case "/" -> Op.DIV;
            case "==" -> Op.EGALEGAL;
            default -> throw new IllegalStateException("Opérateur inconnu ou non implémenté");
        };
        ExpUn exp = new ExpUn(e, op);
        exp.setPos(getPos(ctx));
        return exp;
    }


    @Override
    public Node visitExpCall(julParser.ExpCallContext ctx) {
        String n = ctx.ID().getText();
        List<Exp> lstExpre = new ArrayList<>();
        for(int i=0; i<ctx.exp().size(); i++)
            lstExpre.add((Exp)ctx.exp(i).accept(this));
        ExpCall exp = new ExpCall("(", ")", lstExpre, n);
        exp.setPos(getPos(ctx));
        return exp;
    }

    @Override
    public Node visitInstReturn(julParser.InstReturnContext ctx) {
        Exp n = (Exp) ctx.exp().accept(this);
        Pv pv = new Pv(";");
        InstrReturn instrReturn = new InstrReturn("return", pv, n);
        instrReturn.setPos(getPos(ctx));
        return instrReturn;
    }

    @Override
    public Node visitInstPrint(julParser.InstPrintContext ctx) {
        Exp n = (Exp) ctx.exp().accept(this);
        InstrPrint instrPrint = new InstrPrint("return", "(", ")", n, ";");
        instrPrint.setPos(getPos(ctx));
        return instrPrint;
    }

    @Override
    public Node visitInstDecl(julParser.InstDeclContext ctx) {
        Exp n = (Exp) ctx.exp().accept(this);
        Type type = (Type) ctx.type().accept(this);
        String id = ctx.ID().getText();
        InstrDecl instrDecl = new InstrDecl(type, id, "=", ";", n);
        instrDecl.setPos(getPos(ctx));
        return instrDecl;
    }

    @Override
    public Node visitInstIf(julParser.InstIfContext ctx) {
        Exp n = (Exp) ctx.exp().accept(this);

        List<Instr> listInstr = new ArrayList<>();
        for(int i=0; i<ctx.inst().size(); i++)
            listInstr.add((Instr) ctx.inst(i).accept(this));

        Block b1 = new Block((Instr) ctx.inst().get(0).accept(this));
        Block b2 = new Block((Instr) ctx.inst().get(1).accept(this));

        InstrIf instrIf = new InstrIf("if", "else", "(", ")", n, b1, b2);
        instrIf.setPos(getPos(ctx));
        return instrIf;
    }

    @Override
    public Node visitInstWhile(julParser.InstWhileContext ctx) {
        Exp n = (Exp) ctx.exp().accept(this);

        Block block = new Block((Instr) ctx.inst().accept(this));

        InstrWhile instrWhile = new InstrWhile("while", "(", ")", n, block);
        instrWhile.setPos(getPos(ctx));
        return instrWhile;
    }

    @Override
    public Node visitType(julParser.TypeContext ctx) {
        String type = ctx.getText();
        Type t = switch(type) {
            case "bool" -> new Type("bool");
            case "int" -> new Type("int");
            case "tab" -> new Type("tab");
            default -> throw new IllegalStateException("error");
        };

        return t;

    }

    @Override
    public Node visitPv(julParser.PvContext ctx) {
        Pv pv = new Pv(";");
        return pv;
    }

    @Override
    public Node visitParam(julParser.ParamContext ctx) {
        Type type = (Type) ctx.type().accept(this);
        String id = ctx.ID().getText();
        return new Param(type, id);
    }

    @Override
    public Node visitFunction(julParser.FunctionContext ctx) {
        Type type = (Type) ctx.type().accept(this);
        String id = ctx.ID().getText();
        Block block = new Block((Instr) ctx.inst().accept(this));
        List<Param> listParam = new ArrayList<>();
        for(julParser.ParamContext e : ctx.param()) {
            listParam.add((Param) e.accept(this));
        }
        return new Function(type, id, "(", ")", listParam, block);
    }

    @Override
    public Node visitInstList(julParser.InstListContext ctx) {
        List<Instr> listInstr = new ArrayList<>();
        for(int i = 0; i<ctx.inst().size(); i++) {
            listInstr.add((Instr) ctx.inst(i).accept(this));
        }
        InstrList instr = new InstrList("{", "}",  listInstr);
        instr.setPos(getPos(ctx));
        return instr;
    }

    @Override
    public Node visitProgram(julParser.ProgramContext ctx) {
        List<Instr> listInstr = new ArrayList<>();
        for(int i = 0; i<ctx.inst().size(); i++) {
            listInstr.add((Instr) ctx.inst(i).accept(this));
        }
        InstrList il = new InstrList("", "", listInstr);
        Block block = new Block(il);

        List<Function> listFunc = new ArrayList<>();
        for(int i = 0; i<ctx.function().size(); i++) {
            listFunc.add((Function) ctx.function(i).accept(this));
        }
        Program prog = new Program(block, listFunc);
        prog.setPos(getPos(ctx));
        return prog;
    }

    @Override
    public Node visitExpRead(julParser.ExpReadContext ctx) {
        ExpRead exp = new ExpRead("read()");
        exp.setPos(getPos(ctx));
        return exp;
    }

    @Override
    public Node visitCalcuIncr(julParser.CalcuIncrContext ctx) {
        String id = ctx.ID().getText();
        CalcuIncr ci = new CalcuIncr(id,"++");
        ci.setPos(getPos(ctx));
        return ci;
    }

    @Override
    public Node visitCalcuDecr(julParser.CalcuDecrContext ctx) {
        String id = ctx.ID().getText();
        CalcuDecr cd = new CalcuDecr(id,"--");
        cd.setPos(getPos(ctx));
        return cd;
    }

    @Override
    public Node visitCalcuAff(julParser.CalcuAffContext ctx) {
        Exp n = (Exp) ctx.exp().accept(this);
        String id = ctx.ID().getText();
        CalcuAff calcuAff = new CalcuAff(id, "=", n);
        calcuAff.setPos(getPos(ctx));
        return calcuAff;
    }

    @Override
    public Node visitInstCalcu(julParser.InstCalcuContext ctx) {
        Calcu c = (Calcu) ctx.calcu().accept(this);
        InstrCalcu instrCalcu = new InstrCalcu(c,";");
        instrCalcu.setPos(getPos(ctx));
        return instrCalcu;
    }

    @Override
    public Node visitInstFor(julParser.InstForContext ctx) {
        Type type = (Type) ctx.type().accept(this);
        String id = ctx.ID().getText();
        List<Exp> lstExpre = new ArrayList<>();
        for(int i=0; i<ctx.exp().size(); i++)
            lstExpre.add((Exp)ctx.exp(i).accept(this));
        Calcu calcu = (Calcu) ctx.calcu().accept(this);
        Block block = new Block((Instr) ctx.inst().accept(this));
        InstrFor instrFor = new InstrFor(type,id,lstExpre,calcu,block);
        instrFor.setPos(getPos(ctx));
        return instrFor;
    }

    @Override
    public Node visitExpTabValue(julParser.ExpTabValueContext ctx) {
        String id = ctx.ID().getText();
        int n = Integer.parseInt(ctx.INT().getText());
        ExpTabValue expTabValue = new ExpTabValue(id,n);
        expTabValue.setPos(getPos(ctx));
        return expTabValue;
    }

    @Override
    public Node visitInstDeclTab(julParser.InstDeclTabContext ctx) {
        String id = ctx.ID().getText();
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i<ctx.INT().size(); i++){
            listInt.add(Integer.parseInt(ctx.INT().get(i).toString()));
        }
        InstrDeclTab instrDeclTab = new InstrDeclTab(id,listInt);
        instrDeclTab.setPos(getPos(ctx));
        return instrDeclTab;
    }

    @Override
    public Node visitInstrAffTab(julParser.InstrAffTabContext ctx) {
        Exp n = (Exp) ctx.exp().accept(this);
        String id = ctx.ID().getText();
        int indice = Integer.parseInt(ctx.INT().getText());
        InstrAffTab instrAffTab = new InstrAffTab(id,"=",n,indice);
        instrAffTab.setPos(getPos(ctx));
        return instrAffTab;
    }
}