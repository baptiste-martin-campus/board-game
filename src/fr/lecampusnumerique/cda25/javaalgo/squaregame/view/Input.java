package fr.lecampusnumerique.cda25.javaalgo.squaregame.view;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.controller.Menu;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    View view = new View();

    public int getCoordinateX(){
        this.scanner = new Scanner(System.in);
        view.askCoordinateX();
        return this.scanner.nextInt();
    }

    public int getCoordinateY(){
        this.scanner = new Scanner(System.in);
        view.askCoordinateY();
        return this.scanner.nextInt();
    }

    /**
     *Verifie si le player est humain ou IA
     * @return un boolean
     */
    public boolean isHumanPlayer(){
        this.scanner = new Scanner(System.in);
        String str = this.scanner.nextLine();
        String strUpper = str.toUpperCase();
        return strUpper.equals("OUI") || strUpper.equals("O") ;
    }

    /**
     *
     *Chaque entier retourner sera affecter à un jeu
     * @return un entier entre 0 et 2
     */
    public int getGame(){
        int entier;
        do {
            this.scanner = new Scanner(System.in);
            entier = this.scanner.nextInt();
        }while (entier < 3);
        return entier;
    }


}
