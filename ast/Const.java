package ast;

import visiteur.Visitor;

public class Const extends Exp{
    private boolean value;

    public Const(boolean n){
        this.value=n;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }


}
