package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols;

import java.util.Arrays;
import java.util.List;

public enum TicTacToeSymbol implements Symbol {

    DEFAULT(" "),
    X("X"),
    Y("Y"),
    O("O"),
    ;

    private String representation;

    TicTacToeSymbol(String representation) {
        this.representation = representation;
    }

    /**
     * Méthode qui va renvoyer une chaine de caractères qui représentera un symbole
     *
     * @return String
     */
    @Override
    public String getRepresentation() {
        return this.representation;
    }

    /**
     * Méthode qui va définir une chaine de caractères qui représentera un symbole
     *
     * @param symbol de type Symbol
     */
    @Override
    public void setRepresentation(String symbol) {
        this.representation = symbol;
    }

    /**
     * @return liste de symboles pour le joueur (différent de DEFAULT)
     */
    @Override
    public List<Symbol> getPlayerSymbols() {
        return Arrays.stream(TicTacToeSymbol.values())
                .filter(ticTacToeSymbol -> ticTacToeSymbol != DEFAULT)
                .map(ticTacToeSymbol -> (Symbol)ticTacToeSymbol)
                .toList();
    }
}
