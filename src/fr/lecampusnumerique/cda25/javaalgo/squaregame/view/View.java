package fr.lecampusnumerique.cda25.javaalgo.squaregame.view;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.controller.Menu;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.controller.TicTacToe;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.Cell;
import java.util.Arrays;

public class View {

    public void displayGameList(Menu[] menu){
        System.out.println("Quel jeu voulez-vous lancer ?");
        for (Menu el : menu) {
            System.out.println(el + ":" + Arrays.toString(menu));
        }

    }

    public void displayGame(int input){
        if (input == 0){
            System.out.println("Votre Game choisi est " + Menu.TIC_TAC_TOE);
        }else if (input == 1){
            System.out.println("Votre Game choisi est " + Menu.GOMOKU);
        }else if (input == 2){
            System.out.println("Votre Game choisi est " + Menu.CONNECT4);
        }else {
            System.out.println("Votre choix de jeu n'est pas sur la liste !");
        }
    }

    public void controlChoiceGame(){

    }

    //affichage du plateau
    public void displayBoard(Cell[][] board) {
        int nbLine = board.length + 1;
        String line = "-";
        System.out.println(line.repeat(nbLine));
        for (Cell[] cells : board) {
            for (Cell cell : cells) {
                System.out.println("| " + cell.getRepresentation() + " ");
            }
            System.out.println(line.repeat(nbLine));
        }
    }

    public void askPlayerIsHuman(){
        System.out.println("Etes-vous un joueur humain ? Si non, une IA vous remplacera");
    }

    public void askCoordinateX(){
        System.out.println("Entrez la coordonnée abscisse : ");
    }

    public void askCoordinateY(){
        System.out.println("Entrez la coordonnée ordonnée : ");
    }

    public void displayCoordinateError() {

        System.out.println("Saisie incorrecte !");
    }
}
