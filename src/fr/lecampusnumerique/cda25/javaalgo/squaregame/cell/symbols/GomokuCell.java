package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.symbols;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.symbols.exception.IncompatibleSymbolException;

public class GomokuCell extends Cell {

    @Override
    public String getRepresentation() {
        return "| " + getSymbol().getRepresentation() + " ";
    }

    @Override
    public boolean isOccupied() {
        return getSymbol() != GomokuSymbol.DEFAULT;
    }

    @Override
    public void occupy(Symbol symbol)  throws IncompatibleSymbolException {
        if(symbol instanceof TicTacToeSymbol){
            setSymbol(symbol);
        } else {
            throw new IncompatibleSymbolException("Gomoku");
        }
    }

    public GomokuCell() {
        super(GomokuSymbol.DEFAULT);
    }
}
