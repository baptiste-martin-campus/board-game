package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.TicTacToeSymbol;

public class TicTacToePlayer extends Player {

    public void setTicTacToeSymbol(TicTacToeSymbol symbol){
        super.setSymbol(symbol);
    }

    public String getRepresentation(){
        return getSymbol().getRepresentation();
    }

}
