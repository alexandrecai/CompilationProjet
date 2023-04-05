package ast;

import visiteur.Visitor;

public class ExpPar extends Exp{

    private String pg;

    private String pd;

    private Exp expr;

    public ExpPar(String pg, String pd, Exp expr) {
        this.pg = pg;
        this.pd = pd;
        this.expr = expr;
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

    public Exp getExpr() {
        return expr;
    }

    public void setExpr(Exp expr) {
        this.expr = expr;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
