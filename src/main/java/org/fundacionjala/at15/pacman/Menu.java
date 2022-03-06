package org.fundacionjala.at15.pacman;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;

public class Menu {
    private Panel menuPanel;
    private JLabel menuBackground;
    private ImageIcon imageMenuBackground;
    private String player;
    private Button playButton;
    private Button exitButton;

    public Menu() {
        menuPanel = new Panel();
        playButton = new Button("Play", 1);
        exitButton = new Button("Exit", 2);
    }

    public void introMenu(Window window) {
        menuBackground = new JLabel();
        menuBackground.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        imageMenuBackground = new ImageIcon("src/main/java/org/fundacionjala/at15/pacman/images/menuImage.jpg");
        imageMenuBackground = new ImageIcon(imageMenuBackground.getImage()
                .getScaledInstance(window.getWindow().getWidth(), window.getWindow().getHeight(), Image.SCALE_DEFAULT));
        menuBackground.setIcon(imageMenuBackground);
        menuBackground.setVisible(true);
        menuPanel.add(menuBackground, 0);

        menuPanel.add(playButton, 0);
        menuPanel.add(exitButton, 0);
        window.getWindow().add(menuPanel);

    }

    public void menuEvent(Window window, Play play) {

        playButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                player = JOptionPane.showInputDialog(window.getWindow(), "Player name", "Write here");
                while (player.compareTo("Write here") == 0 || player.compareTo("") == 0) {
                    player = JOptionPane.showInputDialog(window.getWindow(), "Write player name", "Write here");
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
