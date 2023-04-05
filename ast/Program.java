package ast;

import visiteur.Visitor;

import java.util.List;

public class Program extends Node{

    private Block block;

    private List<Function> listFunction;

    public Program(Block block, List<Function> listFunction) {
        this.block = block;
        this.listFunction = listFunction;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public List<Function> getListFunction() {
        return listFunction;
    }

    public void setListFunction(List<Function> listFunction) {
        this.listFunction = listFunction;
    }
}
