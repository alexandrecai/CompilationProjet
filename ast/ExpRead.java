package ast;

import visiteur.Visitor;

public class ExpRead extends Exp{

    private String val;

    public ExpRead(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
