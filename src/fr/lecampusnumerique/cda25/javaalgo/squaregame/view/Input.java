package fr.lecampusnumerique.cda25.javaalgo.squaregame.view;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public int getCoordinateX(){
        this.scanner = new Scanner(System.in);
        System.out.println("Entrer le coordonné x : ");
        return this.scanner.nextInt();
    }

    public int getCoordinateY(){
        this.scanner = new Scanner(System.in);
        System.out.println("Entrer le coordonné x : ");
        return this.scanner.nextInt();
    }

    public boolean isHumanPlayer(){
        this.scanner = new Scanner(System.in);
        String str = this.scanner.nextLine();
        String strUpper = str.toUpperCase();
        return strUpper.equals("OUI") || strUpper.equals("O") ;
    }

    int getGame(){

        return 0;
    }

}
