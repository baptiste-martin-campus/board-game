package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.TicTacToeSymbol;

/**
 * Player du jeu TicTacToe
 *
 * @see Player
 */
public class TicTacToePlayer implements Player {

    public Symbol representation;

    public TicTacToePlayer(TicTacToeSymbol representation){
        this.representation = representation;
    }

    @Override
    public Symbol getRepresentation() {
        return representation;
    }

    /**
     * Méthode qui définit la representation d'un player
     *
     * @param representation de type Symbol
     */

    @Override
    public void setRepresentation(Symbol representation) {
        this.representation = representation;
    }
}
