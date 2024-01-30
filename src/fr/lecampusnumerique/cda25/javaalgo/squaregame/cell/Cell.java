package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.exception.IncompatibleSymbolException;

public interface Cell {

    boolean isOccupied();

    void occupy(Symbol symbol) throws IncompatibleSymbolException;

    Symbol getRepresentation();
    void setRepresentation(Symbol representation);
}
