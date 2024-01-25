package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.TicTacToeCell;

public class TicTacToeBoard extends Board{
    private static final int SIZE = 3;
    private TicTacToeCell[][] board;

    public TicTacToeBoard(){
        board = new TicTacToeCell[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = new TicTacToeCell();
            }
        }
    }

}
