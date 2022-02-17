package org.fundacionjala.at15.spaceinvaders.diana;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;

import java.awt.Dimension;

public class Board extends JPanel {
    private Dimension boardDimension;
    private int boardWidth = 800;
    private int boardHeight = 800;
    private int marginMax = 800;
    private int marginMin = 0;

    public Board() {
        inicializateBoard();
    }

    public void inicializateBoard() {
        addKeyListener(new classAgustin());// keylistener class name (Agus)
        boardDimension = new DimensionUIResource(boardWidth, boardHeight);
        setFocusable(true);
    }

    public void drawBoard() {
        setBackground(Color.DARK_GRAY);
    }

    public int movementRange(int marginMax, int marginMin, int position) {
        if (position > marginMax) {
            position=marginMax;
        }
        if (position < marginMin) {
                position=marginMin;
            }
        }
    }
}
