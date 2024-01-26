package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Connect4Cell;

import java.util.InputMismatchException;

public class Connect4Board extends Board {
    private static final int RANGER = 6;
    private static final int COLUMN = 7;
    private Connect4Cell[][] board;

    public Connect4Board(){
        board = new Connect4Cell[RANGER][COLUMN];
        for (int i = 0; i < RANGER; i++) {
            for (int j = 0; j < COLUMN; j++) {
                board[i][j] = new Connect4Cell();
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
            }while ((x > RANGER || y > COLUMN) && board[x][y].isOccupied());
            result = "" + x + y;
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

        return result;
    }
}
