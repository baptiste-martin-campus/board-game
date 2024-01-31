package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.TicTacToeSymbol;

import java.util.concurrent.ThreadLocalRandom;

public class ArtificialPlayer implements Player {

    public Symbol representation = null;

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
