package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Connect4Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.TicTacToeCell;

public class Connect4Board {
    private static final int ranger = 6;
    private static final int colonne = 7;
    private Connect4Cell[][] board;

    public Connect4Board(){
        board = new Connect4Cell[ranger][colonne];
        for (int i = 0; i < ranger; i++) {
            for (int j = 0; j < colonne; j++) {
                board[i][j] = new Connect4Cell();
            }
        }
    }
}
