package ast;

import visiteur.Visitor;

public class CalcuDecr extends Calcu{

    private String ID;

    private String op;


    public CalcuDecr(String ID, String op) {
        this.ID = ID;
        this.op = op;
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


    @Override
    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
