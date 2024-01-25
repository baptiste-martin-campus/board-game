package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.symbols;

import java.util.Arrays;
import java.util.List;

public enum GomokuSymbol implements Symbol{
    DEFAULT(" "),
    N("N"),
    B("B"),
    ;

    private String representation;

    @Override
    public String getRepresentation() {
        return representation;
    }

    GomokuSymbol(String representation) {
        this.representation = representation;
    }

    public static List<GomokuSymbol> getPlayerTicTacToeSymbols(){
        return Arrays.stream(GomokuSymbol.values())
                .filter(gomokuSymbol -> gomokuSymbol != DEFAULT)
                .toList();
    }

}
