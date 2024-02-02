package fr.lecampusnumerique.cda25.javaalgo.squaregame.controller;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players.Player;

public interface Game extends Rule {

    void play();

    void start();

    void reset();

    void stop();

    Player[] getPlayers();

    void setPlayers(Player[] playerList);

    boolean isWinner();

    boolean isWinner(Cell[][] board, Player player);

    boolean isWinner(Cell[][] board, Player player);

    boolean isOver();

    Player switchPlayers();

    Player switchPlayers(Player player, Player player2, Player currentPlayer);
}
