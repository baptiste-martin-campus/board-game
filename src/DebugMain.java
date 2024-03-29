import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.cell.*;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Connect4Symbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.TicTacToeSymbol;
import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.exception.IncompatibleSymbolException;

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
