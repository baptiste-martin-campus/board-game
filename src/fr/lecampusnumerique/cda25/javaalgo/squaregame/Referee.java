package fr.lecampusnumerique.cda25.javaalgo.squaregame;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.players.Player;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;

public interface Referee {
    boolean isOver();
    Symbol isWinner(Cell[][] tab, Player player);



}
