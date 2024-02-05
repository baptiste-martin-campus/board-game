package fr.lecampusnumerique.cda25.javaalgo.squaregame.controller;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.board.Board;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players.Player;

public interface Rule {

    boolean isWinner();

    boolean isOver();

    Player switchPlayers(Player player, Player player2, Player currentPlayer);

    boolean isBoardFull();
}
