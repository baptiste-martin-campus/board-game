package fr.lecampusnumerique.cda25.javaalgo.squaregame.controller;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.view.Input;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.view.View;

public class InitGame {
    //private TicTacToe ticTacToe;

    private Game game;
    public InitGame(){
        Input input = new Input();
        View view = new View();
        switch (input.getGame()){
            case 0 :
                view.displayGame(input.getGame());
                this.game = new TicTacToe();
                break;
            /*case 1 :
                view.displayGame(input.getGame());
                this.game = new Gmoku();
                ticTacToe.play();
                break;
            case 2 :
                view.displayGame(input.getGame());
                this.game = new Connect4();
                ticTacToe.play();
                break;*/
            default:
                this.game = new TicTacToe();


        }
        this.game.start();

    }
}
