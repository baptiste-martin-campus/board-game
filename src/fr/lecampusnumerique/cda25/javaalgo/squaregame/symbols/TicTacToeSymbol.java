package fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols;

import java.util.Arrays;
import java.util.List;

public enum TicTacToeSymbol implements Symbol {

    DEFAULT(" "),
    X("X"),
    Y("Y"),
    O("O"),
    ;

    private String representation;

    /**
     * Méthode qui va renvoyer la representation d'un symbole
     * @return Array
     */
    public String getRepresentation() {
        return representation;
    }

    TicTacToeSymbol(String representation) {
        this.representation = representation;
    }

    /**
     * Méthode qui va renvoyer une liste des symboles
     * @return Array
     */
    public static List<TicTacToeSymbol> getPlayerTicTacToeSymbols(){
        return Arrays.stream(TicTacToeSymbol.values())
                .filter(ticTacToeSymbol -> ticTacToeSymbol != DEFAULT)
                .toList();
    }

    /**
     * Méthode qui va renvoyer un symbole
     * @see Symbol
     */
    @Override
    public String getSymbol() {
        return representation;
    }

    /**
     * Méthode qui va définir un symbole
     * @see Symbol
     */
    @Override
    public void setSymbol(String symbol) {
        this.representation = symbol;
    }

    /**
     * Méthode qui détermine si une case est occupée
     * @see Symbol
     * @return boolean
     */
    @Override
    public boolean isOccupied() {
        return false;
    }

    /**
     * Méthode qui permet d'occuper une case
     * @param symbol de type Symbol
     * @see Symbol
     */
    @Override
    public void occupy(Symbol symbol) {

    }
}
