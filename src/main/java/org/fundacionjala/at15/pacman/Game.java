package org.fundacionjala.at15.pacman;

import javax.swing.*;

public class Game {

    private Window window;
    private Menu menu;
    private Play play;

    public Game() {

        window = new Window();

        menu = new Menu();

        play = new Play();

        for (int ind = 0; ind < menu.getButtons().length; ind++) {
            menu.getButtons()[ind] = new JButton();
        }

        menu.introMenu(window);
        menu.menuEvent(window, play);

        window.getWindow().setVisible(true);
    }
}
