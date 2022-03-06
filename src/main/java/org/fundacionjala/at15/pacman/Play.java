package org.fundacionjala.at15.pacman;

import java.awt.Color;
import javax.swing.*;

public class Play {
    private Panel gamePanel;
    private Background gameBackground;
    private Board board;
    private JLabel name;
    private int points;
    private JLabel records;
    private final int labelPos1 = 150;
    private final int labelPos = 20;
    private final int labelWeight = 150;
    private final int labelHeight = 30;

    public Play() {
        gamePanel = new Panel();
        gameBackground = new Background("src/main/java/org/fundacionjala/at15/pacman/images/playImage.jpg");
        board = new Board(gamePanel);
    }

    public void runGame(Window window, String player, JPanel panelMenu) {
        panelMenu.setVisible(false);
        gamePanel.add(gameBackground, 0);

        board.insertBoard();

        name = new JLabel("PLAYER: " + player);
        name.setBounds(labelPos, labelPos, labelWeight, labelHeight);
        name.setForeground(Color.white);
        name.setVisible(true);
        gamePanel.add(name, 0);

        points = 0;
        records = new JLabel("POINTS: " + points);
        records.setBounds(window.getWidth() - (labelPos1 + labelPos), labelPos, labelWeight, labelHeight);
        records.setForeground(Color.white);
        records.setVisible(true);
        gamePanel.add(records, 0);

        board.moveGhostGroup();
        board.movPacman(window, records, panelMenu);

        window.add(gamePanel);
    }

    public Board getBoard() {
        return board;
    }
}
