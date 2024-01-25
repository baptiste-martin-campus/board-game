package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.TicTacToeSymbol;

import java.util.concurrent.ThreadLocalRandom;

public class ArtificialPlayer extends Player {

    public int getRandom(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public void setTicTacToeSymbol(TicTacToeSymbol symbol){
        super.setSymbol(symbol);
    }

    public String getRepresentation(){
        return getSymbol().getRepresentation();
    }
}
