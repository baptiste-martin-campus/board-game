package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;

/**
 * Player du jeu Connect4
 * @see Player
 */
public class Connect4Player implements Player{

    public Symbol representation = null;
    @Override
    public void setRepresentation(Symbol representation) {
        this.representation = representation;
    }

    @Override
    public Symbol getRepresentation() {
        return representation;
    }
}
