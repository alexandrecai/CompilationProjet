package ast;

import visiteur.Visitor;

public abstract class Node {
    private Position pos;

    public String getPosition()
    {
        return "Ligne : "+ pos.getNumligne()+ "Col :" + pos.getPosligne();
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public abstract <T> T accept(Visitor<T> visitor) throws Exception;
}