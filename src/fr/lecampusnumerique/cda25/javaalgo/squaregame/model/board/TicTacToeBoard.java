package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.TicTacToeCell;

public class TicTacToeBoard extends GeneralBoard {

    public TicTacToeBoard(int largeur, int longueur) {
        super(largeur, longueur);

        for (int i=0; i<largeur; i++){
            for (int j=0; j<longueur; j++){
                board[i][j] = new TicTacToeCell();
            }
        }
    }
}
