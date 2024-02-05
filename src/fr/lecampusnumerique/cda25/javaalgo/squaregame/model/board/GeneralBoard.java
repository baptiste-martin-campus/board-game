package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.Cell;

public abstract class GeneralBoard {

    private int longueur;
    private int largeur;
    protected Cell[][] board;

    public GeneralBoard(int largeur, int longueur){
        this.largeur = largeur;
        this.longueur = longueur;
        this.board = new Cell[largeur][longueur];
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public Cell[][] getBoard(){
        return board;
    }

    public void setBoard(Cell[][] board){
        this.board = board;
    }

}
