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


    @Override
    public String getSymbol() {
        return null;
    }

    @Override
    public String setSymbol(String symbol) {
        return null;
    }

    @Override
    public boolean isOccupied() {
        return false;
    }

    @Override
    public void occupy(Symbol symbol) {

    }
}
