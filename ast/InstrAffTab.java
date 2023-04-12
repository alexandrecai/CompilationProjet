package ast;

import visiteur.Visitor;

public class InstrAffTab extends Instr{

    private String ID;

    private String egal;

    private Exp exp;

    private int intValue;

    public InstrAffTab(String ID, String egal, Exp exp, int intValue) {
        this.ID = ID;
        this.egal = egal;
        this.exp = exp;
        this.intValue = intValue;
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

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
