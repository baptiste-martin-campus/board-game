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

    public void displayNbPlayerChoice(){
        System.out.println("Saisissez le type de partie:");
        System.out.println("0: COM VS COM");
        System.out.println("1: Joueur VS COM");
        System.out.println("2: Joueur VS Joueur");
    }

    public void displayRowChoice(){
        System.out.println("Saisissez le numéro de la ligne:");
    }

    public void displayColChoice(){
        System.out.println("Saisissez le numéro de la colonne:");
    }

    public void nextPlayer(){
        System.out.println("Au joueur suivant !");
    }
    public void displayWinner(String player){
        System.out.println("Félicitations " + player + " ! Tu as gagné ! \uD83D\uDC4F \uD83D\uDC4F \uD83D\uDC4F");
    }

    public void displayTied(){
        System.out.println("Game Over ! Aucun gagnant ! \uD83D\uDE31\n");
    }

    public void displayErrorPlayerChoice(){
        System.err.println("Coup invalide !");
    }

    public void displayErrorNbPlayerChoice(){
        System.err.println("Chiffre invalide !");
    }

    public void displayErrorChoiceIsString(){
        System.err.println("Vous devez saisir un chiffre");
    }

    public void displayErrorChoiceRange(){
        System.err.println("Vous devez saisir un chiffre entre 0 et 2");
    }

    public void displayErrorTryAgain(){
        System.err.println("Veuillez recommencer !");
    }

    public void displayErrorAgainAgain(){
        System.err.println("Bon tu abuses là, tu cherches la bagarre ? Tu veux jouer ou pas ?");
    }
}
