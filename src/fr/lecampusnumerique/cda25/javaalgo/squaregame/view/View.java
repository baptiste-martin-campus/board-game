package fr.lecampusnumerique.cda25.javaalgo.squaregame.view;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.controller.Menu;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.controller.TicTacToe;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players.Player;

import java.util.Arrays;

public class View {

    public void displayGameList(Menu[] menu) {
        System.out.println("Quel jeu voulez-vous lancer ?");
        for (Menu el : menu) {
            System.out.println(el + ":" + Arrays.toString(menu));
        }

    }

    public void displayGame(int input) {
        if (input == 0) {
            System.out.println("Game " + Menu.TIC_TAC_TOE);
        } else if (input == 1) {
            System.out.println("Game " + Menu.GOMOKU);
        } else if (input == 2) {
            System.out.println("Game " + Menu.CONNECT4);
        } else {
            System.out.println("Votre choix de jeu n'est pas sur la liste !");
        }
    }

    public void controlChoiceGame() {

    }

    //affichage du plateau
    public void displayBoard(Cell[][] board) {
        int nbLine = (board[0][0].getRepresentation().getRepresentation().length() + board.length) * board.length + 1;
        String line = "-";
        System.out.println(line.repeat(nbLine));
        for (Cell[] cells : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("| " + cells[j].getRepresentation().getRepresentation() + " ");
            }
            System.out.println("|");
            System.out.println(line.repeat(nbLine));
        }
    }

    public void callPlayer(Player player) {
        System.out.println("Joueur " + player.getRepresentation());
    }

    public void askPlayerIsHuman() {
        System.out.println("Etes-vous un joueur humain ? Si non, une IA vous remplacera");
    }

    public void askCoordinateX() {
        System.out.println("Entrez la coordonnée abscisse : ");
    }

    public void askCoordinateY() {
        System.out.println("Entrez la coordonnée ordonnée : ");
    }

    public void displayCoordinateError() {
        System.out.println("Ce n'est pas dans le plateau de jeu !");
    }

    public void displayCellOccupiedError() {
        System.out.println("Cette case est déjà occupée !");
    }

    public void displayNotANumberError() {
        System.out.println("Ce n'est pas un numéro !");
    }
}
