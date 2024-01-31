package fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols;

import java.util.Arrays;
import java.util.List;

public enum GomokuSymbol implements Symbol{
    DEFAULT(" "),
    N("N"),
    B("B"),
    ;

    private String representation;

    public String getRepresentation() {
        return representation;
    }

    GomokuSymbol(String representation) {
        this.representation = representation;
    }

    public static List<GomokuSymbol> getPlayerGomokuSymbols(){
        return Arrays.stream(GomokuSymbol.values())
                .filter(gomokuSymbol -> gomokuSymbol != DEFAULT)
                .toList();
    }

    @Override
    public String getSymbol() {
        return null;
    }

    @Override
    public void setSymbol(String symbol) {
        this.representation = symbol;
    }

    @Override
    public boolean isOccupied() {
        return false;
    }

    @Override
    public void occupy(Symbol symbol) {

    }
}
