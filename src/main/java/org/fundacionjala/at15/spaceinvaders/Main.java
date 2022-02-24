package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JFrame;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Main extends JFrame {

    public static void main(String[] args) {

        Board board = new Board();
        JFrame myWindow = new JFrame("Space Invaders");
        myWindow.add(board);
        myWindow.setSize(BOARD_WIDTH, BOARD_HEIGHT);
        myWindow.setVisible(true);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
