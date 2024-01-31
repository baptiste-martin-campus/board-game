package fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols;

import java.util.Arrays;
import java.util.List;

public enum Connect4Symbol implements Symbol {

    DEFAULT(" "),
    R("R"),
    J("J"),
    ;

    private String representation;

    public String getRepresentation() {
        return representation;
    }

    Connect4Symbol(String representation) {
        this.representation = representation;
    }

    public static List<Connect4Symbol> getPlayerConnect4Symbols(){
        return Arrays.stream(Connect4Symbol.values())
                .filter(connect4Symbol -> connect4Symbol != DEFAULT)
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
