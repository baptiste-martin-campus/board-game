package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.GomokuCell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.TicTacToeCell;

import java.util.InputMismatchException;

public class GomokuBoard extends Board{
    private static final int LIGNE_HORIZONTALLE = 19;
    private static final int LIGNE_VERTICALE = 19;
    private GomokuCell[][] board;

    public GomokuBoard(){
        board = new GomokuCell[LIGNE_HORIZONTALLE][LIGNE_VERTICALE];
        for (int i = 0; i < LIGNE_HORIZONTALLE; i++) {
            for (int j = 0; j < LIGNE_VERTICALE; j++) {
                board[i][j] = new GomokuCell();
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
            }while ((x > LIGNE_HORIZONTALLE || y > LIGNE_VERTICALE) && board[x][y].isOccupied());
            result = "" + x + y;
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

        return result;
    }
}
