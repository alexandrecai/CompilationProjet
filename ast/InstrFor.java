package ast;

import visiteur.Visitor;

import java.util.List;

public class InstrFor extends Instr{

    private Type type;

    private String ID;

    private List<Exp> lstExpr;

    private Calcu calcu;

    private Block block;

    public InstrFor(Type type, String ID, List<Exp> lstExpr, Calcu calcu, Block block) {
        this.type = type;
        this.ID = ID;
        this.lstExpr = lstExpr;
        this.calcu = calcu;
        this.block = block;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Exp> getLstExpr() {
        return lstExpr;
    }

    public void setLstExpr(List<Exp> lstExpr) {
        this.lstExpr = lstExpr;
    }

    public Calcu getCalcu() {
        return calcu;
    }

    public void setCalcu(Calcu calcu) {
        this.calcu = calcu;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
