package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.symbols.Connect4Symbol;

public class Connect4Player extends Player{


    public void setConnect4Symbol(Connect4Symbol symbol){
        super.setSymbol(symbol);
    }

    public String getRepresentation(){
        return getSymbol().getRepresentation();
    }
}
