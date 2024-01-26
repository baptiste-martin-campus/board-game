package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import java.util.Scanner;

public class Input {

    public int coordonateAbs(){
        Scanner first = new Scanner(System.in);
        System.out.println("Entrer le coordonné x : ");
        return first.nextInt();
    }

    public int coordonateOrd(){
        Scanner second = new Scanner(System.in);
        System.out.println("Entrer le coordonné x : ");
        return second.nextInt();
    }


    public String getChoicePlayer(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Choix player : ");
        return choice.nextLine();
    }

    public String getChoiceGame(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Choix game : ");
        return choice.nextLine();
    }



}
