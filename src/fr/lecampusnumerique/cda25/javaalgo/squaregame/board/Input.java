package fr.lecampusnumerique.cda25.javaalgo.squaregame.board;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.View;

import java.util.Scanner;

public class Input {
    private View view;
    public Input(){
        view = new View();
    }

    public int coordonateAbs(){
        Scanner first = new Scanner(System.in);
        view.displayRowChoice();
        return first.nextInt();
    }

    public int coordonateOrd(){
        Scanner second = new Scanner(System.in);
        view.displayColChoice();
        return second.nextInt();
    }



    public boolean isHumanPlayer(){
        boolean res = false;
        Scanner choice = new Scanner(System.in);
        view.displayTypeOfPlayer();
        String str = choice.nextLine();
        String strUpper = str.toUpperCase();
        if (strUpper.equals("OUI") ||  strUpper.equals("O")){
            res = true;
        }
        return res;
    }






}
