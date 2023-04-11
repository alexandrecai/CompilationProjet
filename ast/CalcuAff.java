package ast;

import visiteur.Visitor;

public class CalcuAff extends Calcu{

    private String ID;

    private String egal;

    private Exp exp;

    public CalcuAff(String ID, String egal, Exp exp) {
        this.ID = ID;
        this.egal = egal;
        this.exp = exp;
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

    @Override
    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
