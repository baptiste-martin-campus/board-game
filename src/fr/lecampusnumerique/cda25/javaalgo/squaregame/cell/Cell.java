package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.exception.IncompatibleSymbolException;

/**
 * Interface Cell
 */
public interface Cell {

    /**
     * Détermine si une case est occupée
     */
    boolean isOccupied();

    /**
     * Occupe une case
     * @param symbol de type Symbol
     * @throws IncompatibleSymbolException si une erreur est trouvée
     */
    void occupy(Symbol symbol) throws IncompatibleSymbolException;

    /**
     * Renvoi la representation d'une cellule
     */
    Symbol getRepresentation();

    /**
     * Définit la représentation d'une cellule
     * @param representation de type Symbol
     */
    void setRepresentation(Symbol representation);
}
