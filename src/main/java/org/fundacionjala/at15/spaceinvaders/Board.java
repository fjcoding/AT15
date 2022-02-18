package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;
import java.awt.Dimension;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Board extends JPanel {
    private Dimension boardDimension;



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
