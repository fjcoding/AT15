package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;

import java.awt.Dimension;

public class Board extends JPanel {
    private Dimension boardDimension;

    static final int BOARD_WIDTH = 800;
    static final int BOARD_HEIGHT = 600;

    public Board() {
        inicializateBoard();
    }

    public void inicializateBoard() {
        boardDimension = new DimensionUIResource(BOARD_WIDTH, BOARD_HEIGHT);
        setFocusable(true);
    }

    public void drawBoard() {
        setBackground(Color.DARK_GRAY);
    }
}
