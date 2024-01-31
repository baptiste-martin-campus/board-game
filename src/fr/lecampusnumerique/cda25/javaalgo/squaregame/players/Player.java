package fr.lecampusnumerique.cda25.javaalgo.squaregame.players;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;

/**
 * Interface Player
 */
public interface Player {

    /**
     * Méthode qui récupère une representation d'un player
     */
    Symbol getRepresentation();

    /**
     * Méthode qui définit la representation d'un player
     * @param representation de type Symbol
     */
    void setRepresentation(Symbol representation);

}
