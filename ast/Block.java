package ast;

import visiteur.Visitor;

public class Block extends Instr {

    private Instr instr;

    public Block(Instr instr) {
        this.instr = instr;
    }

    public Instr getInstr() {
        return instr;
    }

    public void setInstr(Instr instr) {
        this.instr = instr;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }


}
