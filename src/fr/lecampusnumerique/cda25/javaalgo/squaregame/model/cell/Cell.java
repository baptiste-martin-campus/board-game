package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.exception.IncompatibleSymbolException;

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
     * Définit la representation d'une cellule
     */
    void setRepresentation(Symbol symbol);

}
