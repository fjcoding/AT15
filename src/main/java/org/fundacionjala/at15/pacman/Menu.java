package org.fundacionjala.at15.pacman;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;

public class Menu {
    private Panel menuPanel;
    private Background menuBackground;
    private String player;
    private Button playButton;
    private Button exitButton;
    private Window window;
    private Play play;

    public Menu(Window window, Play play) {
        this.window = window;
        this.play = play;
        menuPanel = new Panel();
        menuBackground = new Background("src/main/java/org/fundacionjala/at15/pacman/images/menuImage.jpg");
        playButton = new Button("Play", 1);
        exitButton = new Button("Exit", 2);
        introMenu();
        menuEvent();
    }

    public void introMenu() {
        menuPanel.add(menuBackground, 0);
        menuPanel.add(playButton, 0);
        menuPanel.add(exitButton, 0);
        window.add(menuPanel);
    }

    public void menuEvent() {

        playButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                player = JOptionPane.showInputDialog(window, "Player name", "Write here");
                while (player.compareTo("Write here") == 0 || player.compareTo("") == 0) {
                    player = JOptionPane.showInputDialog(window, "Write player name", "Write here");
                }
                play.runGame(window, player, menuPanel);
            }
        });

        exitButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getMenuPanel() {
        return menuPanel;
    }

    public JLabel getmenuBackground() {
        return menuBackground;
    }

    public Button getPlayButton() {
        return this.playButton;
    }

    public Button getExitButton() {
        return this.exitButton;
    }
}
