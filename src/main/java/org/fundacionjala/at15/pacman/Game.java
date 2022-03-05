package org.fundacionjala.at15.pacman;

import javax.swing.*;

public class Game {

    private Window window;
    private Menu menu;
    private Play play;

    public Game() {

        window = new Window();

        play = new Play();

        menu = new Menu(window, play);

        for (int ind = 0; ind < menu.getButtons().getButton().length; ind++) {
            menu.getButtons().getButton()[ind] = new JButton();
        }

        menu.introMenu();

        window.getWindow().setVisible(true);
    }
}