package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.symbols.Symbol;

public abstract class Player {

    private Symbol symbol;

    protected Symbol getSymbol(){
        return symbol;
    }

    protected void setSymbol(Symbol symbol){
        this.symbol = symbol;
    }

}
