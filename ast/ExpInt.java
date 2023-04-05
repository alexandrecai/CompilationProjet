package ast;

import visiteur.Visitor;

public class ExpInt extends Exp{
    private int value;
    public ExpInt(int n){
        this.value=n;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}