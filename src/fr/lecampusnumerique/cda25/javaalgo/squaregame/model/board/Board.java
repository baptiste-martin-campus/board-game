package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.Cell;

public interface Board {

    int getLargeur();

    int getLongueur();

    void setLargeur(int largeur);

    void setLongueur(int longueur);

    Cell[][] getBoard();

    void setBoard(Cell[][] board);

}
