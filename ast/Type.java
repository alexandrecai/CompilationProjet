package ast;

import visiteur.Visitor;

public class Type extends Node{

    private String type;

    public Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
