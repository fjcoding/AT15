package org.fundacionjala.at15.pacman;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Buttons {
    private JPanel panelMenu;
    private JButton[] buttons = new JButton[2];
    private Window window;
    private String player;
    private final int buttonPosX = 200;
    private final int buttonPosY = 50;
    private final int buttonWeight = 200;
    private final int buttonHeight = 40;

    public Buttons(Window window, JPanel panelMenu) {
        this.window = window;
        this.panelMenu = panelMenu;
    }

    public void setButtons() {
        buttons[0].setText("Play");
        buttons[1].setText("Exit");
        for (int ind = 0; ind < buttons.length; ind++) {
            buttons[ind].setBounds(window.getWindow().getWidth() - (buttonPosX + buttonPosY), (ind + 1) * buttonPosY, buttonWeight, buttonHeight);
            buttons[ind].setVisible(true);
            buttons[ind].setBackground(Color.white);
            panelMenu.add(buttons[ind], 0);
        }
    }

    public void buttonsEvent(Play play) {

        buttons[0].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                player = JOptionPane.showInputDialog(window.getWindow(), "Player name", "Write here");
                while (player.compareTo("Write here") == 0 || player.compareTo("") == 0) {
                    player = JOptionPane.showInputDialog(window.getWindow(), "Write player name", "Write here");
                }
                play.runGame(window, player, panelMenu);
            }
        });

        buttons[1].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    public JButton[] getButton() {
        return buttons;
    }
}
