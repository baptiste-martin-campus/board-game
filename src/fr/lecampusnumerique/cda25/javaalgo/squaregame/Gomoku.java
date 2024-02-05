package fr.lecampusnumerique.cda25.javaalgo.squaregame;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.board.GomokuBoard;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.players.Player;

public class Gomoku extends GomokuBoard implements Referee {
    @Override
    public boolean isOver() {
        return false;
    }

    @Override
    public boolean isWinner(Cell[][] tab, Player player) {
        return false;
    }

}
