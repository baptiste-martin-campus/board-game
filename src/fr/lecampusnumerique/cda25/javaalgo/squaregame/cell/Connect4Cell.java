package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Connect4Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.exception.IncompatibleSymbolException;

public class Connect4Cell extends Cell {

    @Override
    public Symbol getRepresentation() {
        return getSymbol().getRepresentation();
    }

    @Override
    public boolean isOccupied() {
        return getSymbol() != Connect4Symbol.DEFAULT;
    }

    @Override
    public void occupy(Symbol symbol)  throws IncompatibleSymbolException {
        if(symbol instanceof Connect4Symbol){
            setSymbol(symbol);
        } else {
            throw new IncompatibleSymbolException("Connect4");
        }
    }

    public Connect4Cell() {
        super(Connect4Symbol.DEFAULT);
    }

}
