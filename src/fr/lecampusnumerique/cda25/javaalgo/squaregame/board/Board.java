package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.TicTacToeCell;

public abstract class Board {

    private int longueur;
    private int largeur;
    private Cell[][] board;

    public Board(int largeur, int longueur){
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public abstract boolean verifyCoordAbs(int coord);

    public abstract boolean verifyCoordOrd(int coord);

    public abstract boolean isFull();

}
