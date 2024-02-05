package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols;

import java.util.Arrays;
import java.util.List;

public enum GomokuSymbol implements Symbol{
    DEFAULT(" "),
    N("N"),
    B("B"),
    ;

    private Symbol representation;

    GomokuSymbol(String representation) {
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

    public List<Symbol> getPlayerSymbols(){
        return Arrays.stream(GomokuSymbol.values())
                .filter(gomokuSymbol -> gomokuSymbol != DEFAULT)
                .map(gomokuSymbol -> (Symbol)gomokuSymbol)
                .toList();
    }

}
