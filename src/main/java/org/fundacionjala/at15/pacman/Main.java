package org.fundacionjala.at15.pacman;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        Menu menu = new Menu();
        Play play = new Play();
        menu.introMenu(window);
        menu.menuEvent(window, play);
        window.getWindow().setVisible(true);
    }
}
