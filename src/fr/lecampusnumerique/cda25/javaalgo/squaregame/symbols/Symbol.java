package fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols;

/**
 * Interface Symbol
 */
public interface Symbol {

    /**
     * Méthode qui va renvoyer un symbole
     * @return Symbol
     */
    String getSymbol();

    /**
     * Méthode qui va définir un nouveau symbole
     * @param symbol de type Symbol
     */
    void setSymbol(String symbol);

    /**
     * Méthode qui détermine si une case est occupée
     * Les enfants de cette interface auront une valeur par défaut qui permettra de faire la comparaison
     * @return boolean
     */
    boolean isOccupied();

    /**
     * Méthode qui permet d'occuper une case
     * @param symbol de type Symbol
     */
    void occupy(Symbol symbol);

}
