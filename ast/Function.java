package ast;

import visiteur.Visitor;

import java.util.List;

public class Function extends Node{

    private Type type;

    private String id;

    private String pg = "(";
    private String pd = ")";

    private List<Param> params;


    private Block block;

    public Function(Type type, String id, String pg, String pd, List<Param> params, Block block) {
        this.type = type;
        this.id = id;
        this.pg = pg;
        this.pd = pd;
        this.params = params;
        this.block = block;
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

    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public List<Param> getParams() {
        return params;
    }

    public void setParams(List<Param> params) {
        this.params = params;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
