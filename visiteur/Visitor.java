package visiteur;

import ast.*;

public abstract class Visitor<T> {


    public T visit(Const con){
        return null;
    };
    public T visit(ExpBin expBin) throws Exception {
        expBin.getExpdroite().accept(this);
        expBin.getExpgauche().accept(this);
        return null;
    };
    public T visit(ExpCall expCall) throws Exception {
        for(Exp e:expCall.getLstExpr()){
            e.accept(this);
        }
        return null;
    };
    public T visit(ExpId expId) throws Exception {
        return null;
    };
    public T visit(ExpInt expInt){
        return null;
    };
    public T visit(ExpPar expPar) throws Exception {
        expPar.getExpr().accept(this);
        return null;
    };
    public T visit(ExpRead expRead){
        return null;
    };
    public T visit(ExpUn expUn) throws Exception {
        expUn.getExp().accept(this);
        return null;
    };
    public T visit(Function function) throws Exception {
        function.getBlock().getInstr().accept(this);
        return null;
    };
    public T visit(InstrDecl instrDecl) throws Exception{
        instrDecl.getExp().accept(this);
        instrDecl.getType().accept(this);
        return null;
    };
    public T visit(InstrIf instrIf) throws Exception {
        instrIf.getExp().accept(this);
        instrIf.getBlock().getInstr().accept(this);
        instrIf.getBlock2().getInstr().accept(this);
        return null;
    };
    public T visit(InstrList instrList) throws Exception {
        for (Instr i:instrList.getInstr()){
            i.accept(this);
        }
        return null;
    };
    public T visit(InstrPrint instrPrint) throws Exception {
        instrPrint.getExp().accept(this);
        return null;
    };
    public T visit(InstrReturn instrReturn) throws Exception {
        instrReturn.getExp().accept(this);
        return null;
    };
    public T visit(InstrWhile instrWhile) throws Exception {
        instrWhile.getBlock().getInstr().accept(this);
        instrWhile.getExp().accept(this);
        return null;
    };

    public T visit(Param param){
        return null;
    };
    public T visit(Program program) throws Exception {
        program.getBlock().accept(this);
        for (Function f:program.getListFunction()){
            f.accept(this);
        }
        return null;
    };
    public T visit(Pv pv){
        return null;
    };
    public T visit(Type type){
        return null;
    };

    public T visit(Block b) throws Exception{
        b.getInstr().accept(this);
        return null;
    };



    public T visit(CalcuAff calcuAff) throws Exception {
        calcuAff.getExp().accept(this);
        return null;
    }

    public T visit(CalcuIncr calcuIncr) throws Exception {
        return null;
    }

    public T visit(CalcuDecr calcuDecr) throws Exception {
        return null;
    }

    public T visit(InstrCalcu instrCalcu) throws Exception {
        instrCalcu.getCalcu().accept(this);
        return null;
    }

    public T visit(InstrFor instrFor) throws Exception {
        instrFor.getCalcu().accept(this);
        for(Exp e:instrFor.getLstExpr()){
            e.accept(this);
        }
        instrFor.getBlock().getInstr().accept(this);
        instrFor.getType().accept(this);
        return null;
    }

    public T visit(ExpTabValue expTabValue) {
        return null;
    }

    public T visit(InstrDeclTab instrDeclTab) {
        return null;
    }

    public T visit(InstrAffTab instrAffTab) throws Exception {
        return null;
    }
}
