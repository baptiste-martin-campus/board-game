package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

public class GomokuPlayer extends Player{


    public void setGomokuSymbol(GomokuSymbol symbol){
        super.setSymbol(symbol);
    }

    public String getRepresentation(){
        return getSymbol().getRepresentation();
    }
}
