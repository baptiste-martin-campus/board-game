package fr.lecampusnumerique.cda25.javaalgo.squaregame;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.board.TicTacToeBoard;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.players.Player;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;

public class TicTacToe extends TicTacToeBoard implements Referee {

    @Override
    public boolean isOver() {
        return false;
    }

    public boolean lineWin(){
        return false;
    }

    public boolean colWin(){
        return false;
    }
    public boolean diaWin(){
        return false;
    }

    @Override
    public Symbol isWinner(Cell[][] tab, Player player) {
       return null;
    }
}
