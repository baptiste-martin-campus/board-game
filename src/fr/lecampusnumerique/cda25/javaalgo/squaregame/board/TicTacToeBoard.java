package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.TicTacToeCell;

import java.util.InputMismatchException;
import java.util.Scanner;

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


    public String getMoveFromPlayer() {
        String result = "Hors coordonnées";
        Input input = new Input();
        try {
            int x;
            int y;
            do {
                x = input.firstCoordonate();
                y = input.secondCoordonate();
            }while ((x > SIZE || y > SIZE) && board[x][y].isOccupied());
            result = "" + x + y;
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

        return result;
    }

}
