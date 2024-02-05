package fr.lecampusnumerique.cda25.javaalgo.squaregame.controller;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players.Player;

public interface Game extends Rule {

    void play();

    void start();

    void reset();

    void stop();

    Player[] getPlayers();

    void setPlayers();

    boolean isOver();

    @Override
    Player switchPlayers();

    boolean isBoardFull();

}
