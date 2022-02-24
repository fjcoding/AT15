package org.fundacionjala.at15.pacman;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class Play {
    private JPanel gamePanel;
    private JLabel gameBackground;
    private ImageIcon imageGameBackground;
    private Board board;
    private JLabel name;
    private int points;
    private JLabel records;
    private final int labelPos1 = 150;
    private final int labelPos = 20;
    private final int labelWeight = 150;
    private final int labelHeight = 30;

    public Play() {
        points = 0;
    }

    public void jugar(Window window, String player, JPanel panelMenu) {
        panelMenu.setVisible(false);
        gamePanel = new JPanel();
        gamePanel.setLayout(null);
        gamePanel.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        gamePanel.setVisible(true);

        gameBackground = new JLabel();
        gameBackground.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        imageGameBackground = new ImageIcon("src/main/java/org/fundacionjala/at15/pacman/images/playImage.jpg");
        imageGameBackground = new ImageIcon(imageGameBackground.getImage()
                .getScaledInstance(window.getWindow().getWidth(), window.getWindow().getHeight(), Image.SCALE_DEFAULT));
        gameBackground.setIcon(imageGameBackground);
        gameBackground.setVisible(true);
        gamePanel.add(gameBackground, 0);

        board = new Board();
        board.insertBoard(gamePanel);

        name = new JLabel("PLAYER: " + player);
        name.setBounds(labelPos, labelPos, labelWeight, labelHeight);
        name.setForeground(Color.white);
        name.setVisible(true);
        gamePanel.add(name, 0);

        points = 0;
        records = new JLabel("POINTS: " + points);
        records.setBounds(window.getWindow().getWidth() - (labelPos1 + labelPos), labelPos, labelWeight, labelHeight);
        records.setForeground(Color.white);
        records.setVisible(true);
        gamePanel.add(records, 0);

        board.moverPacman(window, gamePanel, records, panelMenu);

        window.getWindow().add(gamePanel);
    }

    public Board getBoard() {
        return board;
    }
}
