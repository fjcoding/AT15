package org.fundacionjala.at15.pacman;

public class Main {
    public static void main(String[] args) {
        Window window = new Window("PACMAN");
        Play play = new Play();
        new Menu(window, play);
        window.setVisible(true);
    }
}
