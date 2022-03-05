package org.fundacionjala.at15.pacman;

public class Game {

    private Window window;
    private Menu menu;
    private Play play;

    public Game() {

        window = new Window();

        menu = new Menu();

        play = new Play();

        menu.introMenu(window);
        menu.menuEvent(window, play);

        window.getWindow().setVisible(true);
    }
}