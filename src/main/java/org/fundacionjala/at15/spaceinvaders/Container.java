package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JFrame;

public class Container extends JFrame {
    public Container() {
        setTitle("Space Invaders");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setFocusable(true);
    }
}