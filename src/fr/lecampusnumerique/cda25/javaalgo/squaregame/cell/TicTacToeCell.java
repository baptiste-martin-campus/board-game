package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.players.Player;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.TicTacToeSymbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.exception.IncompatibleSymbolException;

/**
 * Cell du jeu TicTacToe
 * @see Cell
 */
public class TicTacToeCell implements Cell {

    Symbol representation;

    @Override
    public Symbol getRepresentation() {
        return representation;
    }

    @Override
    public void setRepresentation(Symbol representation) {
        this.representation = representation;
    }

    @Override
    public boolean isOccupied() {
        return getRepresentation() != TicTacToeSymbol.DEFAULT;
    }

    @Override
    public void occupy(Symbol symbol) throws IncompatibleSymbolException {
        if (symbol instanceof TicTacToeSymbol) {
            setRepresentation(symbol);
        } else {
            throw new IncompatibleSymbolException("TicTacToe");
        }
    }

    public TicTacToeCell() {
        super(TicTacToeSymbol.DEFAULT);
    }
}
