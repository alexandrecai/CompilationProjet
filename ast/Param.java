package ast;

import visiteur.Visitor;

public class Param extends Node{

    private Type type;

    private String id;

    public Param(Type type, String id) {
        this.type = type;
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
