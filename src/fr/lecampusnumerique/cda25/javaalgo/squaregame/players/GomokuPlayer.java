package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.GomokuSymbol;

public class GomokuPlayer extends Player{


    public void setGomokuSymbol(GomokuSymbol symbol){
        super.setSymbol(symbol);
    }

    public String getRepresentation(){
        return getSymbol().getRepresentation();
    }
}
