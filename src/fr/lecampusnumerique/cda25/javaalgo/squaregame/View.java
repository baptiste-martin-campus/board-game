package fr.lecampusnumerique.cda25.javaalgo.squaregame;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Cell;

public class View {

    //affichage du plateau
    public void displayBoard(Cell[][] board) {
        setLines(board);
        for (Cell[] cells : board) {
            for (Cell cell : cells) {
                System.out.println(cell.getRepresentation());
            }
            setLines(board);
        }
    }

    //ligne graphique pour le plateau
    public void setLines(Cell[][] board) {
        int nbLine = board[0][0].getRepresentation().length() * board.length + 1;
        String line = "-";
        System.out.println(line.repeat(nbLine));
    }

    public void displayTypeOfPlayer(){
        System.out.println("Choisissez le nombre de joueurs:");
        System.out.println("0: COM VS COM");
        System.out.println("1: Joueur VS COM");
        System.out.println("2: Joueur VS Joueur");
    }

    public void displayRowChoice(){
        System.out.println("Choisissez le numéro de la ligne:");
    }

    public void displayColChoice(){
        System.out.println("Choisissez le numéro de la colonne:");
    }

    public void nextPlayer(){
        System.out.println("Au joueur suivant !");
    }
    public void displayWinner(String player){
        System.out.println("Félicitations " + player + " ! Tu as gagné ! \uD83D\uDC4F \uD83D\uDC4F \uD83D\uDC4F");
    }

    public void displayTied(){
        System.out.println("Game Over ! vous êtes nuls ...");
    }

    public void displayErrorPlayerChoice(){
        System.err.println("Coup invalide ! Veuillez recommencer !");
    }

    public void displayErrorNbPlayerChoice(){
        System.err.println("Nombre invalide ! Veuillez recommencer !");
    }
}
