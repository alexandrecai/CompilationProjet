package ast;

import visiteur.Visitor;

import java.util.List;

public class ExpCall extends Exp{
    private String pg;

    private String pd;

    private List<Exp> lstExpr;

    private String id;

    public ExpCall(String pg, String pd, List<Exp> lstExpr, String id) {
        this.pg = pg;
        this.pd = pd;
        this.lstExpr = lstExpr;
        this.id = id;
    }

    public String getPg() {
        return pg;
    }

    public String getPd() {
        return pd;
    }

    public List<Exp> getLstExpr() {
        return lstExpr;
    }

    public String getId() {
        return id;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public void setLstExpr(List<Exp> lstExpr) {
        this.lstExpr = lstExpr;
    }

    public void setId(String id) {
        this.id = id;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
