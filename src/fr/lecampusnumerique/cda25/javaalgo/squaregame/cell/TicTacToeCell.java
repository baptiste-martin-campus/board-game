package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.TicTacToeSymbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.exception.IncompatibleSymbolException;

public class TicTacToeCell extends Cell {
    @Override
    public String getRepresentation() {
        return getSymbol().getRepresentation();
    }

    @Override
    public boolean isOccupied() {
        return getSymbol() != TicTacToeSymbol.DEFAULT;
    }

    @Override
    public void occupy(Symbol symbol) throws IncompatibleSymbolException {
        if (symbol instanceof TicTacToeSymbol) {
            setSymbol(symbol);
        } else {
            throw new IncompatibleSymbolException("TicTacToe");
        }
    }

    public TicTacToeCell() {
        super(TicTacToeSymbol.DEFAULT);
    }
}
