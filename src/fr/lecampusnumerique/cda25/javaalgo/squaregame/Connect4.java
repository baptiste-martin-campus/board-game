package fr.lecampusnumerique.cda25.javaalgo.squaregame;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.players.Player;

public class Connect4 extends BoardGame implements Referee {
    @Override
    public boolean isOver() {
        return false;
    }

    @Override
    public boolean isWinner(Cell[][] tab, Player player) {
        return false;
    }
}
