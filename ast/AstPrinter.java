package ast;

import visiteur.Visitor;

public class AstPrinter extends Visitor<String> {

    int tabActuel = 0;

    private String Indent() {
        return ("    ".repeat(tabActuel));
    }


    @Override
    public String visit(Const con) {
        return String.valueOf(con.isValue());
    }


    @Override
    public String visit(ExpBin expBin) throws Exception {
        return String.valueOf(expBin.getExpgauche().accept(this)) + expBin.getOp() + expBin.getExpdroite().accept(this);
    }

    @Override
    public String visit(ExpCall expCall) {
        String res = expCall.getPg();
        res +=(expCall.getLstExpr().get(0));
        for (int i =1; i<=expCall.getLstExpr().size();i++){
            res +=(", ");
            res +=(expCall.getLstExpr().get(i));
        }
        res += (expCall.getPd());
        return res;
    }

    @Override
    public String visit(ExpId expId) {
        return String.valueOf(expId.getValue());
    }

    @Override
    public String visit(ExpInt expInt) {
        return String.valueOf(expInt.getValue());
    }

    @Override
    public String visit(ExpPar expPar) throws Exception {
        return "(" + expPar.getExpr().accept(this) + ")";
    }

    @Override
    public String visit(ExpRead expRead) {
        return expRead.getVal();
    }

    @Override
    public String visit(ExpUn expUn) throws Exception {
        return expUn.getOp() + expUn.getExp().accept(this);
    }

    @Override
    public String visit(Function function) throws Exception {
        StringBuilder res = new StringBuilder(function.getType().accept(this) + " "+ function.getId() + function.getPg());
        tabActuel++;
        for(Param p:function.getParams()){
            res.append(p.accept(this));
        }
        res.append(function.getPd()).append("{\n").append(function.getBlock().getInstr().accept(this)).append("}\n");
        tabActuel--;
        return res.toString();
    }


    @Override
    public String visit(InstrAff instrAff) throws Exception {
        return instrAff.getID() + instrAff.getEgal() + instrAff.getExp().accept(this)+ instrAff.getPv();
    }

    @Override
    public String visit(InstrDecl instrDecl) throws Exception {
        return instrDecl.getType().accept(this) + " " +  instrDecl.getID() + instrDecl.getEgal() + instrDecl.getExp().accept(this) + instrDecl.getPv() ;
    }

    @Override
    public String visit(InstrIf instrIf) throws Exception {
        String res = instrIf.getSi() + instrIf.getPg() + instrIf.getExp().accept(this) + instrIf.getPd() + "{\n";
        tabActuel++;
        res += instrIf.getBlock().getInstr().accept(this);
        tabActuel--;
        res += Indent() + "}\n" + Indent() + instrIf.getSinon() + "{\n";
        tabActuel++;
        res += instrIf.getBlock2().getInstr().accept(this);
        tabActuel--;
        res+= Indent() + "}";
        return res;
    }

    @Override
    public String visit(InstrList instrList) throws Exception {
        String res = "";
        for (Instr i:instrList.getInstr()){
            res += Indent() + (i.accept(this)) + "\n";
        }
        return res;
    }

    @Override
    public String visit(InstrPrint instrPrint) throws Exception {
        return instrPrint.getPrint() + instrPrint.getPg()  + instrPrint.getExp().accept(this) + instrPrint.getPd() + instrPrint.getPv();
    }

    @Override
    public String visit(InstrReturn instrReturn) throws Exception {
        return "return " + instrReturn.getExp().accept(this) + instrReturn.getPv().getPv();
    }

    @Override
    public String visit(InstrWhile instrWhile) throws Exception {
        String res = "while" + instrWhile.getPg() + instrWhile.getExp().accept(this) + instrWhile.getPd() + "{\n";
        tabActuel++;
        res += instrWhile.getBlock().getInstr().accept(this);
        tabActuel--;
        res += Indent() + "}";
        return res;
    }


    @Override
    public String visit(Param param) {
        return param.getType().accept(this) + " " + param.getId();
    }

    @Override
    public String visit(Program program) throws Exception {
        StringBuilder res = new StringBuilder();
        for (Function fun: program.getListFunction()){
            res.append(fun.accept(this));
        }
        res.append(program.getBlock().getInstr().accept(this)).append("\n");
        /*
        for (Instr ins: program.getListInstr()){
            res.append(ins.accept(this)).append("\n");
        }
        */
        return res.toString();
    }

    @Override
    public String visit(Pv pv) {
        return ";";
    }

    @Override
    public String visit(Type type) {
        return type.getType();
    }

    @Override
    public String visit(InstrIncr instrIncr) {
        return instrIncr.getID()+instrIncr.getOp()+instrIncr.getPv();
    }

    @Override
    public String visit(InstrDecr instrDecr) {
        return instrDecr.getID()+instrDecr.getOp()+instrDecr.getPv();
    }
}
