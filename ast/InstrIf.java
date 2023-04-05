package ast;

import visiteur.Visitor;

public class InstrIf extends Instr{

    private String si = "if";

    private String sinon = "else";

    private String pg = "(";

    private String pd = ")";

    private Exp exp;

    private Block block;
    private Block block2;

    public InstrIf(String si, String sinon, String pg, String pd, Exp exp, Block block, Block block2) {
        this.si = si;
        this.sinon = sinon;
        this.pg = pg;
        this.pd = pd;
        this.exp = exp;
        this.block = block;
        this.block2 = block2;
    }

    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public String getSinon() {
        return sinon;
    }

    public void setSinon(String sinon) {
        this.sinon = sinon;
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

    public Block getBlock2() {
        return block2;
    }

    public void setBlock2(Block block2) {
        this.block2 = block2;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
