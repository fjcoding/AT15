package org.fundacionjala.at15.pacman;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Game {

    Window window;
    Menu menu;
    Play play;
    Board board;

    static int mat[][];
    static JLabel matriz [][];

    public Game() {

        window = new Window();

        menu = new Menu();

        play = new Play();


        board = new Board();

        for (int i = 0; i < menu.getButtons().length; i++) {
            menu.getButtons()[i] = new JButton();
        }

        menu.introMenu(window);
        menu.menuEvent(window, play);

        window.getWindow().setVisible(true);
    }
}
