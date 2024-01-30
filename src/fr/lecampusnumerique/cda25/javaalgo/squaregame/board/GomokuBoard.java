package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.GomokuCell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.TicTacToeCell;

import java.util.InputMismatchException;

public class GomokuBoard extends Board{

    private GomokuCell[][] board;

    public GomokuBoard(){
        super(19, 19);
        board = new GomokuCell[getLargeur()][getLongueur()];
        for (int i = 0; i < getLargeur(); i++) {
            for (int j = 0; j < getLongueur(); j++) {
                board[i][j] = new GomokuCell();
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
