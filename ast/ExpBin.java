package ast;

import visiteur.Visitor;

public class ExpBin extends Exp {
    private Exp expdroite;

    private Exp expgauche;
    private Op op;

    public ExpBin(Exp eg, Op o, Exp ed){
        this.op=o;
        this.expgauche=eg;
        this.expdroite=ed;
    }

    public Exp getExpdroite() {
        return expdroite;
    }

    public Exp getExpgauche() {
        return expgauche;
    }

    public Op getOp() {
        return op;
    }

    public void setExpdroite(Exp expdroite) {
        this.expdroite = expdroite;
    }

    public void setExpgauche(Exp expgauche) {
        this.expgauche = expgauche;
    }

    public void setOp(Op op) {
        this.op = op;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}


