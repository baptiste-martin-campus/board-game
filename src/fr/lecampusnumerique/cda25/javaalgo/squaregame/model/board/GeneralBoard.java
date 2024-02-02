package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.Cell;

public abstract class GeneralBoard {

    private int longueur;
    private int largeur;
    private Cell[][] board;

    public GeneralBoard(int largeur, int longueur){
        this.largeur = largeur;
        this.longueur = longueur;
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

}
