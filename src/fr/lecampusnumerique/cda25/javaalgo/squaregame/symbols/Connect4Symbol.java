package fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols;

public enum Connect4Symbol implements Symbol {

    DEFAULT(" "),
    R("R"),
    J("J"),
    ;

    private String representation;

    @Override
    public String getRepresentation() {
        return representation;
    }

    Connect4Symbol(String representation) {
        this.representation = representation;
    }


}
