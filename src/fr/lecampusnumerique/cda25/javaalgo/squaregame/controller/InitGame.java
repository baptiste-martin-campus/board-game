package fr.lecampusnumerique.cda25.javaalgo.squaregame.controller;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.view.Input;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.view.View;

public class InitGame {
    //private TicTacToe ticTacToe;

    private Game game;

    public void gameChoice(){
        Input input = new Input();
        View view = new View();
        int test = input.getGame();
        switch (test){
            case 0 :
                view.displayGame(0);
                this.game = new TicTacToe();
                this.game.play();
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

    }
}
