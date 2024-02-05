package fr.lecampusnumerique.cda25.javaalgo.squaregame.controller;

import fr.lecampusnumerique.cda25.javaalgo.squaregame.model.symbols.Symbol;

import java.util.Arrays;
import java.util.List;

public enum Menu {
    DEFAULT(0),
    TIC_TAC_TOE(1),
    GOMOKU(2),
    CONNECT4(3),
    ;

    Menu(int num) {

    }

    public List<Menu> getGameList() {
        return Arrays.stream(Menu.values())
                .filter(game -> game != DEFAULT)
                .toList();
    }
}
