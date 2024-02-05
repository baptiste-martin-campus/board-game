package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.Referee;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.TicTacToeCell;

public class TicTacToeBoard  extends Board {
    private TicTacToeCell[][] board;

    public TicTacToeBoard() {
        super(3, 3);
        board = new TicTacToeCell[getLargeur()][getLongueur()];
        for (int i = 0; i < getLargeur(); i++) {
            for (int j = 0; j < getLongueur(); j++) {
                board[i][j] = new TicTacToeCell();
            }
        }
    }

    public boolean verifyCoordAbs(int coord) {
        return coord >= 0 && coord < getLargeur();
    }

    public boolean verifyCoordOrd(int coord) {
        return coord >= 0 && coord < getLongueur();
    }

    @Override
    public boolean isFull() {
        return false;
    }
}


