package fr.lecampusnumerique.cda25.javaalgo.squaregame;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.Cell;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Symbol;

public enum View {

    /////Constantes et attribut/////

    ;

    private String prompt;


    /////Constructeur/////


    private View (String prompt){
        this.prompt=prompt;
    }


    /////Methodes/////

    /**
     * Affiche un message pour que l'utilisateur choisie le type de joueur pour la partie à venir
     */
    public void displayTypefOfPlayer(Symbol pionSymbol){
        System.out.println("Le joueur qui aura les "+pionSymbol.getRepresentation()+" sera un humain (oui/non)? \b(une ia jouera en cas de réponse négative) ");
    }

    //affichage du plateau
    public void displayBoard(Cell[][] board) {
        setLines(board);
        for (Cell[] cells : board) {
            for (Cell cell : cells) {
                System.out.println("| "+cell.getRepresentation()+" ");
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

<<<<<<< Updated upstream
    public void displayNbPlayerChoice(){
        System.out.println("Saisissez le type de partie:");
        System.out.println("0: Joueur VS Joueur");
        System.out.println("1: Joueur VS COM");
        System.out.println("2: COM VS COM");
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
=======
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
                System.out.println("COM VS COM");git branch
            } else if (nbPlayer == 1) {
                System.out.println("Joueur1 VS COM");
            } else {
                System.out.println("Joueur1 VS Joueur2");
            }
        }
>>>>>>> Stashed changes
    }
}
