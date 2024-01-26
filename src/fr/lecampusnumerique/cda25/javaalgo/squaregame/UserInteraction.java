package fr.lecampusnumerique.cda25.javaalgo.squaregame;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Connect4Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;

import java.util.Scanner;

public class UserInteraction {

    private Connect4Symbol symbolC4;

    public int getNbNPC(){
        Scanner scanner = new Scanner(System.in);
        int val = -1;
        do{
            try {
                val = Integer.parseInt(String.valueOf(scanner.nextInt()));
            } catch (NumberFormatException e) {
                System.out.println("Nombre invalide, veuillez recommencer");
                getNbNPC();
            }
        } while(val < 0 || val > 2);
        return scanner.nextInt();
    }

    public Symbol getSymbol(){
        Scanner scanner = new Scanner(System.in);
        symbolC4.setRepresentation(scanner.next());
        return scanner.nextInt();
    }
}
