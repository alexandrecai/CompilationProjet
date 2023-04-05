package ast;

import visiteur.Visitor;

public class InstrReturn extends Instr{

    private String toreturn;

    private Pv pv;

    private Exp exp;

    public InstrReturn(String toreturn, Pv pv, Exp exp) {
        this.toreturn = toreturn;
        this.pv = pv;
        this.exp = exp;
    }

    public String getToreturn() {
        return toreturn;
    }

    public void setToreturn(String toreturn) {
        this.toreturn = toreturn;
    }

    public Pv getPv() {
        return pv;
    }

    public void setPv(Pv pv) {
        this.pv = pv;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
