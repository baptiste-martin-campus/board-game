package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols;

import java.util.Arrays;
import java.util.List;

public enum GomokuSymbol implements Symbol{
    DEFAULT(" "),
    N("N"),
    B("B"),
    ;

    private String representation;

    GomokuSymbol(String representation) {
        this.representation = representation;
    }


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
    public List<Symbol> getPlayerSymbols(){
        return Arrays.stream(GomokuSymbol.values())
                .filter(gomokuSymbol -> gomokuSymbol != DEFAULT)
                .map(gomokuSymbol -> (Symbol)gomokuSymbol)
                .toList();
    }

}
