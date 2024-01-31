package fr.lecampusnumerique.cda25.javaalgo.squaregame.cell;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.players.Player;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.GomokuSymbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.exception.IncompatibleSymbolException;

/**
 * Cell du jeu Gomoku
 * @see Cell
 */
public class GomokuCell implements Cell {

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
        return getRepresentation() != GomokuSymbol.DEFAULT;
    }

    @Override
    public void occupy(Symbol symbol)  throws IncompatibleSymbolException {
        if(symbol instanceof GomokuSymbol){
            setRepresentation(symbol);
        } else {
            throw new IncompatibleSymbolException("Gomoku");
        }
    }

    public GomokuCell() {
        super(GomokuSymbol.DEFAULT);
    }
}
