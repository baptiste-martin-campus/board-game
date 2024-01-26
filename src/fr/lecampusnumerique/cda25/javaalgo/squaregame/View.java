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

    public void displayNbPlayerChoice(int nbPlayer){
        System.out.println("Choisissez le nombre de joueurs");
        boolean isValid = false;
        try {
            Integer.parseInt(String.valueOf(nbPlayer));
            isValid = true;
        } catch (NumberFormatException e) {
            System.out.println("Nombre invalide, veuillez recommencer");
        }
        if (isValid && nbPlayer >= 0 && nbPlayer <= 2) {
            if (nbPlayer == 0) {
                System.out.println("COM VS COM");
            } else if (nbPlayer == 1) {
                System.out.println("Joueur1 VS COM");
            } else {
                System.out.println("Joueur1 VS Joueur2");
            }
        }
    }
}
