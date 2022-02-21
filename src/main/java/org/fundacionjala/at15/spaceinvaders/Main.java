package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JFrame;

import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame("Space Invaders");
        Board board = new Board();
        myWindow.add(board);
        myWindow.setSize(BOARD_WIDTH, BOARD_HEIGHT);
        myWindow.setVisible(true);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // while (true) {
        //     try {
        //         Thread.sleep(SLEEP);
        //     } catch (InterruptedException ex) {
        //         System.out.println(ex.toString());
        //         board.repaint();
        //     }
        // }
    }

}
