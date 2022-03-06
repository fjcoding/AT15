package org.fundacionjala.at15.pacman;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;

public class Menu {

    private JPanel panelMenu;
    private JLabel menuBackground;
    private ImageIcon imageMenuBackground;
    private String player;
    private Button playButton;
    private Button exitButton;

    public Menu() {
        playButton = new Button("Play", 1);
        exitButton = new Button("Exit", 2);
    }

    public void introMenu(Window window) {

        panelMenu = new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        panelMenu.setVisible(true);

        menuBackground = new JLabel();
        menuBackground.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        imageMenuBackground = new ImageIcon("src/main/java/org/fundacionjala/at15/pacman/images/menuImage.jpg");
        imageMenuBackground = new ImageIcon(imageMenuBackground.getImage()
                .getScaledInstance(window.getWindow().getWidth(), window.getWindow().getHeight(), Image.SCALE_DEFAULT));
        menuBackground.setIcon(imageMenuBackground);
        menuBackground.setVisible(true);
        panelMenu.add(menuBackground, 0);

        panelMenu.add(playButton, 0);
        panelMenu.add(exitButton, 0);
        window.getWindow().add(panelMenu);

    }

    public void menuEvent(Window window, Play play) {

        playButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                player = JOptionPane.showInputDialog(window.getWindow(), "Player name", "Write here");
                while (player.compareTo("Write here") == 0 || player.compareTo("") == 0) {
                    player = JOptionPane.showInputDialog(window.getWindow(), "Write player name", "Write here");
                }
                play.runGame(window, player, panelMenu);
            }
        });

        exitButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getPanelMenu() {
        return panelMenu;
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
