package ast;

import visiteur.Visitor;

public class ExpUn extends Exp {
    private Exp exp;

    private Op op;
    public ExpUn(Exp e, Op o){
        this.op=o;
        this.exp=e;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public Op getOp() {
        return op;
    }

    public void setOp(Op op) {
        this.op = op;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
