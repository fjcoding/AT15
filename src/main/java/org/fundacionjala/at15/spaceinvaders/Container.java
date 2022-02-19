package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

import javax.swing.JFrame;

public class Container extends JFrame {
    public Container() {
        add(new Board());
        setTitle("Space Invaders");
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);
        setFocusable(true);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}