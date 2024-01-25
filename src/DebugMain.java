import fr.lecampusnumerique.cda25.javaalgo.squaregame.cell.*;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.Connect4Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.TicTacToeSymbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.symbols.exception.IncompatibleSymbolException;

public class DebugMain {
    public static void main(String[] args) {
        Cell cell = new TicTacToeCell();
        System.out.println(cell.getRepresentation());
        try {
            cell.occupy(TicTacToeSymbol.X);
        } catch (IncompatibleSymbolException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(cell.getRepresentation());
        try {
            cell.occupy(Connect4Symbol.J);
        } catch (IncompatibleSymbolException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(cell.getRepresentation());
    }
}
