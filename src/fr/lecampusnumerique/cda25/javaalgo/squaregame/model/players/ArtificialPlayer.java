package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.TicTacToeSymbol;

import java.util.concurrent.ThreadLocalRandom;

public class ArtificialPlayer implements Player {

    private Symbol representation;

    public ArtificialPlayer(TicTacToeSymbol representation){
        this.representation = representation;
    }

    @Override
    public void setRepresentation(Symbol representation) {
        this.representation = representation;
    }

    @Override
    public Symbol getRepresentation() {
        return representation;
    }

    public int getRandom(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
