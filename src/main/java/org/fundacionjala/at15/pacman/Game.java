package org.fundacionjala.at15.pacman;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Game {

    Window window;
    Presentation presentation;
    Menu menu;
    Play play;
    Board board;

    static int mat[][];
    static JLabel matriz [][];

    public Game() {

        window = new Window();

        presentation = new Presentation(window);

        menu = new Menu();

        play = new Play();


        board = new Board();
        for (int i = 0; i < menu.getButtons().length; i++) {
            menu.getButtons()[i] = new JButton();
        }

        presentation.getStart().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                System.out.println("START");
                menu.introMenu(window, presentation);
                menu.eventoMenu(window, play);
            }
        });

        window.getWindow().add(presentation.getPanelPresentation());
        window.getWindow().setVisible(true);
    }
}
