package ast;

import visiteur.Visitor;

import java.util.List;

public class InstrDeclTab extends Instr{

    private String id;

    private List<Integer> intList;

    public InstrDeclTab(String id, List<Integer> intList) {
        this.id = id;
        this.intList = intList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) throws Exception {
        return visitor.visit(this);
    }
}
