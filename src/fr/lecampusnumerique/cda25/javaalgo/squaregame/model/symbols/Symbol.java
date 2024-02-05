package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols;

import java.util.List;

/**
 * Interface Symbol
 */
public interface Symbol {

    /**
     * Méthode qui va renvoyer une chaine de caractères qui représentera un symbole
     *
     * @return char
     */
    String getRepresentation();

    /**
     * Méthode qui va définir une chaine de caractères qui représentera un symbole
     */
    void setRepresentation(String symbol);

    /**
     * @return liste de symboles pour le joueur
     * */
    List<Symbol> getPlayerSymbols();
}
