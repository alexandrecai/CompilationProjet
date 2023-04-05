package ast;

import visiteur.Visitor;

public class InstrDecr extends Instr{

    private String ID;

    private String op;

    private String pv = ";";

    public InstrDecr(String ID, String op, String pv) {
        this.ID = ID;
        this.op = op;
        this.pv = pv;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }
}
