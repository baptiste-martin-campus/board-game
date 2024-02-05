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

    public boolean isHumanPlayer(){
        this.scanner = new Scanner(System.in);
        String str = this.scanner.nextLine();
        String strUpper = str.toUpperCase();
        return strUpper.equals("OUI") || strUpper.equals("O") ;
    }

    int getGame(){
        int entier;
        do {
            this.scanner = new Scanner(System.in);
            entier = this.scanner.nextInt();
        }while (entier < 3);
        return entier;
    }


}
