package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Connect4Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.exception.IncompatibleSymbolException;

/**
 * Cell du jeu Connect4
 * @see Cell
 */
public class Connect4Cell implements Cell {

    private Symbol representation;


    /**
     * Détermine si une case est occupée
     */
    @Override
    public boolean isOccupied() {
        return getRepresentation() != Connect4Symbol.DEFAULT;
    }


    /**
     * Occupe une case
     *
     * @param symbol de type Symbol
     * @throws IncompatibleSymbolException si une erreur est trouvée
     */
    @Override
    public void occupy(Symbol symbol) throws IncompatibleSymbolException {
        if (symbol instanceof Connect4Symbol) {
            setRepresentation(symbol);
        } else {
            throw new IncompatibleSymbolException("Connect4");
        }
    }

    /**
     * Renvoi la representation d'une cellule
     */
    @Override
    public Symbol getRepresentation() {
        return representation;
    }

    /**
     * Définit la representation d'une cellule
     *
     * @param symbol
     */
    @Override
    public void setRepresentation(Symbol symbol) {
        this.representation = symbol;
    }
}
