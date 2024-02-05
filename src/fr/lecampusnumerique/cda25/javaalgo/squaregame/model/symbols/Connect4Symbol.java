package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols;

import java.util.Arrays;
import java.util.List;

public enum Connect4Symbol implements Symbol {

    DEFAULT(" "),
    R("R"),
    J("J"),
    ;

    private Symbol representation;

    Connect4Symbol(String representation) {
    }

    public char getRepresentation() {
        return representation.getRepresentation();
    }

    /**
     * Méthode qui va définir une chaine de caractères qui représentera un symbole
     *
     * @param symbol de type Symbol
     */
    @Override
    public void setRepresentation(Symbol symbol) {
        this.representation = symbol;
    }

    /**
     * @return liste de symboles pour le joueur
     */
    @Override
    public List<Symbol> getPlayerSymbols(){
        return Arrays.stream(Connect4Symbol.values())
                .filter(connect4Symbol -> connect4Symbol != DEFAULT)
                .map(connect4Symbol -> (Symbol)connect4Symbol)
                .toList();
    }

}
