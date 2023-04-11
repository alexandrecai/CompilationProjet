package ast;

import visiteur.Visitor;

public class InstrCalcu extends Instr{

    private Calcu calcu;

    private String pv;

    public InstrCalcu(Calcu calcu, String pv) {
        this.calcu = calcu;
        this.pv = pv;
    }

    public Calcu getCalcu() {
        return calcu;
    }

    public void setCalcu(Calcu calcu) {
        this.calcu = calcu;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
