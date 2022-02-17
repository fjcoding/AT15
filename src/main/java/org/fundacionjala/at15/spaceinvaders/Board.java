package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;

import java.awt.Dimension;

public class Board extends JPanel {
    private Dimension boardDimension;
    static final int boardWidth = 500;
    static final int boardHeight = 400;

    public Board() {
        inicializateBoard();
    }

    public void inicializateBoard() {
        boardDimension = new DimensionUIResource(boardWidth, boardHeight);
        setFocusable(true);
    }

    public void drawBoard() {
        setBackground(Color.DARK_GRAY);
    }
}
