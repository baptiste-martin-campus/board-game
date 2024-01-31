package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Connect4Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.exception.IncompatibleSymbolException;

/**
 * Cell du jeu Connect4
 * @see Cell
 */
public class Connect4Cell implements Cell {

    Symbol representation;

    @Override
    public boolean isOccupied() {
        return getRepresentation() != Connect4Symbol.DEFAULT;
    }

    @Override
    public void occupy(Symbol symbol) throws IncompatibleSymbolException {
        if(symbol instanceof Connect4Symbol){
            setRepresentation(symbol);
        } else {
            throw new IncompatibleSymbolException("Connect4");
        }
    }

    @Override
    public Symbol getRepresentation() {
        return null;
    }

    @Override
    public void setRepresentation(Symbol representation) {
        this.representation = representation;
    }

}
