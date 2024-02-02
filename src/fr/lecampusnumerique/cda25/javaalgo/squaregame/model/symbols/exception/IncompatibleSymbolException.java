package fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.exception;

public class IncompatibleSymbolException extends Exception {

    public IncompatibleSymbolException(String game_name) {
        super("The cell you are trying to occupy only accepts "+game_name+ " symbols!");
    }
}
