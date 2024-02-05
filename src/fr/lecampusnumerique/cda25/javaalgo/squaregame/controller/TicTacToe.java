package fr.lecampusnumerique.cda25.javaalgo.squaregame.controller;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.board.TicTacToeBoard;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players.ArtificialPlayer;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players.Player;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players.TicTacToePlayer;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.TicTacToeSymbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.exception.IncompatibleSymbolException;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.view.Input;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.view.View;

public class TicTacToe implements Game {

    View view = new View();
    Input userInter = new Input();
    TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(3, 3);
    Player player1;
    Player player2;
    Player currentPlayer;
    int compteur = 0;

    /**
     *
     */
    @Override
    public void start() {
    }

    @Override
    //le jeu se joue
    public void play() {
        // tant que le jeu n'est pas fini, il continue
        setPlayers();
        while (!isOver()) {
            setOwner(getMoveFromPlayer(currentPlayer), currentPlayer);
            compteur++;
            view.displayBoard(ticTacToeBoard.getBoard());
            this.currentPlayer = switchPlayers();
        }
    }


    @Override
    public void reset() {

    }

    /**
     *
     */
    @Override
    public void stop() {

    }

    /**
     * @return array of players
     */
    @Override
    public Player[] getPlayers() {
        return new Player[0];
    }

    /**
     * list of players
     */
    @Override
    public void setPlayers() {
        // initialisation des players
        this.player1 = new TicTacToePlayer(TicTacToeSymbol.X);
        this.player2 = new TicTacToePlayer(TicTacToeSymbol.O);
        this.currentPlayer = player1;
        view.callPlayer(this.currentPlayer);
        view.askPlayerIsHuman();
        if (!userInter.isHumanPlayer()) {
            this.player1 = new ArtificialPlayer(TicTacToeSymbol.X);
        }

        this.currentPlayer = switchPlayers();
        view.callPlayer(this.currentPlayer);
        view.askPlayerIsHuman();
        if (!userInter.isHumanPlayer()) {
            this.player2 = new ArtificialPlayer(TicTacToeSymbol.O);
        }

        this.currentPlayer = switchPlayers();
    }

    /**
     * Player1 représente le 1er joueur
     * player2 représente le second joueur
     * currentPlayer représente le joueur actuel
     *
     * @return un joueur dont c'est le tour de jouer
     */
    @Override
    public Player switchPlayers() {
        return this.currentPlayer != this.player1 ? this.player1 : this.player2;
    }

    //demande et récupère les coordonnées x et y d'une cellule donnée par le joueur
    public int[] getMoveFromPlayer(Player currentPlayer) {
        boolean error = false;
        int x = -1;
        int y = -1;
        while (!error) {
            if (currentPlayer instanceof TicTacToePlayer) {

                try {
                    view.askCoordinateX();
                    x = userInter.getCoordinateX();
                } catch (Exception e) {
                    error = true;
                }

                try {
                    view.askCoordinateY();
                    y = userInter.getCoordinateY();
                } catch (Exception e) {
                    error = true;
                }

            } else {
                try {
                    ArtificialPlayer ap = (ArtificialPlayer) currentPlayer;
                    x = ap.getRandom(0, this.ticTacToeBoard.getLargeur());
                    y = ap.getRandom(0, this.ticTacToeBoard.getLongueur());
                } catch (Exception e) {
                    error = true;
                }
            }
            if (x >= 0 && x <= this.ticTacToeBoard.getLargeur() && y >= 0 && y <= this.ticTacToeBoard.getLongueur()) {
                if (this.ticTacToeBoard.getBoard()[x][y].isOccupied()) {
                    if (isNumeric(Integer.toString(y)) && isNumeric(Integer.toString(x))) {
                        return new int[]{x, y};
                    } else {
                        view.displayNotANumberError();
                    }
                } else {
                    view.displayCellOccupiedError();
                }
            } else {
                view.displayCoordinateError();
            }
        }
        return getMoveFromPlayer(currentPlayer);
    }

    private void setOwner(int[] moveFromPlayer, Player currentPlayer) {
        try {
            this.ticTacToeBoard.getBoard()[moveFromPlayer[0]][moveFromPlayer[1]].occupy(currentPlayer.getRepresentation());
        } catch (IncompatibleSymbolException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isWinner() {
        Symbol playerSymbol = this.currentPlayer.getRepresentation();
        Cell[][] board = this.ticTacToeBoard.getBoard();
        boolean gagnant = false;
        // Vérification des lignes
        for (int i = 0; i < ticTacToeBoard.getLongueur(); i++) {
            if (board[i][0].getRepresentation().equals(playerSymbol) && board[i][1].getRepresentation().equals(playerSymbol) && board[i][2].getRepresentation().equals(playerSymbol)) {
                gagnant = true; // Le joueur a gagné sur une ligne
                break;
            }
        }

        // Vérification des colonnes
        for (int j = 0; j < ticTacToeBoard.getLargeur(); j++) {
            if (board[0][j].getRepresentation().equals(playerSymbol) && board[1][j].getRepresentation().equals(playerSymbol) && board[2][j].getRepresentation().equals(playerSymbol)) {
                gagnant = true; // Le joueur a gagné sur une colonne
                break;
            }
        }

        // Vérification de la diagonale principale
        if (board[0][0].getRepresentation().equals(playerSymbol) && board[1][1].getRepresentation().equals(playerSymbol) && board[2][2].getRepresentation().equals(playerSymbol)) {
            gagnant = true; // Le joueur a gagné sur la diagonale principale
        }

        // Vérification de la diagonale inverse
        if (board[0][2].getRepresentation().equals(playerSymbol) && board[1][1].getRepresentation().equals(playerSymbol) && board[2][0].getRepresentation().equals(playerSymbol)) {
            gagnant = true; // Le joueur a gagné sur la diagonale inverse
        }


        return gagnant;// condition de victoire
    }

    //vérifie si le plateau est plein
    public boolean isBoardFull() {
        return this.ticTacToeBoard.getLargeur() * this.ticTacToeBoard.getLongueur() == compteur;
    }

    //vérifie si la partie est finie
    @Override
    public boolean isOver() {
        if (isWinner()) {
            view.displayWinner(this.currentPlayer);
            return isWinner();
        } else if (isBoardFull()) {
            view.displayTied();
            return isBoardFull();
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}