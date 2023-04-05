package ast;

public class TypePrim extends Type{

    public final Prim prim;
    public String id;

    public enum Prim{
        INT{
            public String toString() {
                return "int";
            }
        },
        BOOL{
            public String toString() {
                return "bool";
            }
        },
        STAT{
            public String toString() {
                return "statement";
            }
        },
        IND{
            public String toString() {
                return "indefini";
            }
        }
    }


    public Prim getPrim() {
        return prim;
    }

    public TypePrim(Prim p) {
        super(p.name());
        this.prim = p;
        this.id = prim.toString();
    }
}
