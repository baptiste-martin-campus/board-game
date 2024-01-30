package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Connect4Cell;

import java.util.InputMismatchException;

public class Connect4Board extends Board {
    private Connect4Cell[][] board;

    public Connect4Board(){
        super(7, 6);
        board = new Connect4Cell[getLargeur()][getLongueur()];
        for (int i = 0; i < getLargeur(); i++) {
            for (int j = 0; j < getLongueur(); j++) {
                board[i][j] = new Connect4Cell();
            }
        }
    }

    public boolean verifyCoordAbs(int coord) {
        return coord >= 0 && coord < getLargeur() ;
    }

    public boolean verifyCoordOrd(int coord){
        return coord >= 0 && coord < getLongueur();
    }
}
