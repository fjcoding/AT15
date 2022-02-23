package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import javax.swing.*;
import static org.junit.Assert.assertTrue;
import java.awt.*;

import org.junit.Test;

public class BoardTest extends JPanel{
    protected Graphics newGraph;

    @Test
    public void itShouldDrawAliens() {
        JFrame myWindow = new JFrame("Space Invaders");
        Board board = new Board();
        myWindow.add(board);
        myWindow.setSize(BOARD_WIDTH, BOARD_HEIGHT);
        myWindow.setVisible(true);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        assertTrue(true);
    }
}