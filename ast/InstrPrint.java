package ast;

import visiteur.Visitor;

public class InstrPrint extends Instr{

    private String print = "print";

    private String pg = "(";

    private String pd = ")";

    private Exp exp;

    private String pv = ";";

    public InstrPrint(String print, String pg, String pd, Exp exp, String pv) {
        this.print = print;
        this.pg = pg;
        this.pd = pd;
        this.exp = exp;
        this.pv = pv;
    }

    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
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

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
