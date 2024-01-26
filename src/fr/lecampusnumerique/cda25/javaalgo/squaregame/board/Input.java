package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import java.util.Scanner;

public class Input {

    public int firstCoordonate(){
        Scanner first = new Scanner(System.in);
        System.out.println("Entrer le coordonné x : ");
        int x = first.nextInt();
        return x;
    }

    public int secondCoordonate(){
        Scanner second = new Scanner(System.in);
        System.out.println("Entrer le coordonné x : ");
        int y = second.nextInt();
        return y;
    }



}
