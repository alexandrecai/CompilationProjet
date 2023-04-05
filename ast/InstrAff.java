package ast;

import visiteur.Visitor;

public class InstrAff extends Instr{

    private String ID;

    private String egal;

    private Exp exp;

    private String pv;

    public InstrAff(String ID, String egal, Exp exp, String pv) {
        this.ID = ID;
        this.egal = egal;
        this.exp = exp;
        this.pv = pv;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEgal() {
        return egal;
    }

    public void setEgal(String egal) {
        this.egal = egal;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
