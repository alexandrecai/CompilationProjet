package ast;

import visiteur.Visitor;

import java.util.List;

public class InstrList extends Instr{

    private String bg = "{";

    private String bd = "}";

    private List<Instr> instr;

    public InstrList(String bg, String bd, List<Instr> instr) {
        this.bg = bg;
        this.bd = bd;
        this.instr = instr;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public List<Instr> getInstr() {
        return instr;
    }

    public void setInstr(List<Instr> instr) {
        this.instr = instr;
    }

    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
