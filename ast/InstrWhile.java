package ast;

import visiteur.Visitor;

import java.util.List;

public class InstrWhile extends Instr {

    private String tantque = "while";

    private String pg = "(";

    private String pd = ")";

    private Exp exp;

    private Block block;

    public InstrWhile(String tantque, String pg, String pd, Exp exp, Block block) {
        this.tantque = tantque;
        this.pg = pg;
        this.pd = pd;
        this.exp = exp;
        this.block = block;
    }

    public String getTantque() {
        return tantque;
    }

    public void setTantque(String tantque) {
        this.tantque = tantque;
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

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
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
