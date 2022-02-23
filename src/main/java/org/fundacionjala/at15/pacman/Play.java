package org.fundacionjala.at15.pacman;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class Play {
    JPanel gamePanel;
    JLabel gameBackground;
    ImageIcon imageGameBackground;
    Board board;
    Pacman pacman;
    String player;
    JLabel name;
    int points;
    JLabel records;



    public Play() {
       points = 0;
    }

    public void jugar(Window window, JPanel panelMenu, String player){
        panelMenu.setVisible(false);
        gamePanel = new JPanel();
        gamePanel.setLayout(null);
        gamePanel.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        gamePanel.setVisible(true);


        gameBackground = new JLabel();
        gameBackground.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        imageGameBackground = new ImageIcon("src/main/java/org/fundacionjala/at15/pacman/images/playImage.jpg");
        imageGameBackground = new ImageIcon(imageGameBackground.getImage().getScaledInstance(window.getWindow().getWidth(), window.getWindow().getHeight(), Image.SCALE_DEFAULT));
        gameBackground.setIcon(imageGameBackground);
        gameBackground.setVisible(true);
        gamePanel.add(gameBackground, 0);


        board = new Board();
        board.insertBoard(gamePanel);


        name = new JLabel("PLAYER: " + player);
        name.setBounds(20, 20, 150, 30);
        name.setForeground(Color.white);
        name.setVisible(true);
        gamePanel.add(name,0);


        points = 0;
        records = new JLabel("POINTS: " + points);
        records.setBounds(window.getWindow().getWidth()-(150+20), 20, 150, 30);
        records.setForeground(Color.white);
        records.setVisible(true);
        gamePanel.add(records,0);

        board.moverPacman(window, gamePanel, panelMenu, records);

        window.getWindow().add(gamePanel);
    }

}
