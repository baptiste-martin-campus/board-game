package fr.lecampusnumerique.cda25.javaalgo.squaregame.controller;

import java.util.Scanner;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.players.Player;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.view.View;

public class TicTacToe implements Game{

    View view = new View();

    /**
     *
     */
    @Override
    public void start() {

    }

    @Override
    //le jeu se joue
    public void play() {
        //this.board = new TicTacToeBoard();

        Player currentPlayer = this.player;

        while (!isOver()) {
            setOwner(getMoveFromPlayer(currentPlayer), currentPlayer);
            view.displayBoard();
            currentPlayer = switchPlayer(this.player, this.player2, currentPlayer);
        }

    }

    /**
     *
     */
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
     * @return
     */
    @Override
    public Player[] getPlayers() {
        return new Player[0];
    }

    /**
     * @param playerList
     */
    @Override
    public void setPlayers(Player[] playerList) {

    }

    /**
     * @return
     */
    @Override
    public boolean isWinner(Cell[][] board, Player player) {
        Symbol playerSymbol = player.getRepresentation();
        boolean gagnant = false;
        // Vérification des lignes
        for (int i = 0; i < 3; i++) {
            if (board[i][0].getRepresentation().equals(playerSymbol) && board[i][1].getRepresentation().equals(playerSymbol) && board[i][2].getRepresentation().equals(playerSymbol)) {
                gagnant = true; // Le joueur a gagné sur une ligne
                break;
            }
        }

        // Vérification des colonnes
        for (int j = 0; j < 3; j++) {
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

        if (gagnant) {
            return true;
        }

        return false; // Aucune condition de victoire n'est satisfaite.
    }

    //vérifie si la partie est finie
    @Override
    public boolean isOver() {
        return isWinner(board, player) || isWinner(board, player2) || isBoardFull(board);
    }

    //demande et récupère les coordonnées x et y d'une cellule donnée par le joueur
    public int[] getMoveFromPlayer(Player currentPlayer) {
        boolean error = false;
        int x = -1;
        int y = -1;
        Scanner demande;
        while (!error) {
            if (currentPlayer instanceof HumanPlayer) {

                try {
                    demande = userInter.ask();
                    x = demande.nextInt();
                } catch (Exception e) {
                    error = true;
                }

                try {
                    demande = userInter.ask();
                    y = demande.nextInt();
                } catch (Exception e) {
                    error = true;
                }

            } else {
                try{
                    ArtificialPlayer ap = (ArtificialPlayer) currentPlayer;
                    x = ap.getRandom(0, size);
                    y = ap.getRandom(0, size);
                } catch(Exception e) {
                    error = true;
                }
            }
            if (x >= 0 && x <= size && y >= 0 && y <= size && board[x][y].isEmpty() && isNumeric(Integer.toString(y)) && isNumeric(Integer.toString(x))) {
                return new int[]{x, y};
            }else{
            }
        }
        return getMoveFromPlayer(currentPlayer);
    }

    @Override
    public Player switchPlayers(Player player, Player player2, Player currentPlayer) {
        return (currentPlayer == player) ? player2 : player;
    }


    //vérifie si le plateau est plein
    public boolean isBoardFull(Cell[][] board) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j].getRepresentation().equals(cell.getRepresentation())) {
                    return false;
                }
            }
        }
        return true;
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