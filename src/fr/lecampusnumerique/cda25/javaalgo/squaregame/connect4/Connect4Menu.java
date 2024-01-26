package fr.lecampusnumerique.cda25.javaalgo.squaregame.connect4;
import java.util.ArrayList;

import javax.swing.text.View;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.board.Connect4Board;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.players.Connect4Player;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.players.Player;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Connect4Symbol;

public class Connect4Menu {
    //Initialise une partie de Gomoku

    /////Attributs et accesseurs/////


    private Connect4Board board;

    public Connect4Board getBoard(){
        return board;
    }

    private ArrayList<Connect4Player> players;

    public ArrayList<Connect4Player> getPlayers(){
        return players;
    }

    /////Constructeurs/////
    public Connect4Menu(){
        board = new Connect4Board();
        players=playersInitialisation();
    }


    /////Methodes/////

    /**Initialise les joueurs de la partie à venir selon le choix de l'utilisateur.
     * @return ArrayList<Connect4Player> 
     */
    private ArrayList<Connect4Player> playersInitialisation(){        
        View.displayChooseNPCNumber();
        int nbPNJ = InteractionUtilisateur.getPNJNumber();
        for (int i = nbPNJ; i < 2; i++) {
            Connect4Player player=new Connect4Player();
            do {
                player.setSymbol(InteractionUtilisateur.getPlayerConnect4Symbols());
            } while (player.getSymbol()==Connect4Symbol.DEFAULT);
            players.add(player);
        }
        for (int i = nbPNJ; i > 0; i--) {
            Connect4ArtificialPlayer player=(new Connect4ArtificialPlayer());
            player.setSymbol();
            players.add(player);
        }
    }


}
