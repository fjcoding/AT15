package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;

import java.awt.Dimension;

public class Board extends JPanel {
    private Dimension boardDimension;

    public Board() {
        inicializateBoard();
    }

    public void inicializateBoard() {
        boardDimension = new DimensionUIResource(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        setFocusable(true);
    }

    public void drawBoard() {
        setBackground(Color.DARK_GRAY);
    }
}
