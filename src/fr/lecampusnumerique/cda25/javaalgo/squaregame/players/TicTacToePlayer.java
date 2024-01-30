package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;

public class TicTacToePlayer implements Player {

    public Symbol representation = null;
    @Override
    public Symbol getRepresentation() {
        return representation;
    }

    @Override
    public void setRepresentation(Symbol representation) {
        this.representation = representation;
    }
}
