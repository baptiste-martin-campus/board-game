package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.GomokuSymbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.TicTacToeSymbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.exception.IncompatibleSymbolException;

/**
 * Cell du jeu Gomoku
 *
 * @see Cell
 */
public class GomokuCell implements Cell {

    private Symbol representation;

    /**
     * Détermine si une case est occupée
     */
    @Override
    public boolean isOccupied() {
        return getRepresentation() != GomokuSymbol.DEFAULT;
    }


    /**
     * Occupe une case
     *
     * @param symbol de type Symbol
     * @throws IncompatibleSymbolException si une erreur est trouvée
     */
    @Override
    public void occupy(Symbol symbol) throws IncompatibleSymbolException {
        if (symbol instanceof GomokuSymbol) {
            setRepresentation(symbol);
        } else {
            throw new IncompatibleSymbolException("Gomoku");
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
