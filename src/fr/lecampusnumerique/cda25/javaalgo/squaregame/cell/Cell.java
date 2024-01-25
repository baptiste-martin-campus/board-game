package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.exception.IncompatibleSymbolException;

public abstract class Cell {

    private Symbol symbol;

    protected Symbol getSymbol() {
        return symbol;
    }

    protected void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract String getRepresentation();

    public abstract boolean isOccupied();

    protected Cell(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract void occupy(Symbol symbol) throws IncompatibleSymbolException;
}
