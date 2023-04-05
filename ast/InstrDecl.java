package ast;

import visiteur.Visitor;

public class InstrDecl extends Instr{

    private Type type;

    private String ID;

    private String egal = "=";

    private String pv = ";";

    private Exp exp;

    public InstrDecl(Type type, String ID, String egal, String pv, Exp exp) {
        this.type = type;
        this.ID = ID;
        this.egal = egal;
        this.pv = pv;
        this.exp = exp;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
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
