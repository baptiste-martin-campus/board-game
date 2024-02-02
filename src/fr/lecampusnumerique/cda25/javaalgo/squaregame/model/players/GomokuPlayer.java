package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Symbol;

/**
 * Player du jeu Gomoku
 *
 * @see Player
 */
public class GomokuPlayer implements Player {

    public Symbol representation;

    @Override
    public Symbol getRepresentation() {
        return representation;
    }

    @Override
    public void setRepresentation(Symbol representation) {
        this.representation = representation;
    }
}
