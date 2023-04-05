package ast;

import visiteur.Visitor;

public class Pv extends Node{

    public String pv = ";";

    public Pv(String pv) {
        this.pv = pv;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
