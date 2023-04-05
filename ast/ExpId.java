package ast;

import visiteur.Visitor;

public class ExpId extends Exp {
    private String value;
    public ExpId(String n){
        this.value=n;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
