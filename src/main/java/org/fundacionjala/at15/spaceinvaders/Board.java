package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;
import java.awt.Dimension;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Board extends JPanel {
    private Dimension boardDimension;
<<<<<<< HEAD


=======
>>>>>>> origin/dev/spaceinvaders

    public Board() {
        inicializateBoard();
    }

    public void inicializateBoard() {
<<<<<<< HEAD
        boardDimension = new DimensionUIResource(BOARD_WIDTH, BOARD_HEIGHT);
=======
        boardDimension = new DimensionUIResource(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
>>>>>>> origin/dev/spaceinvaders
        setFocusable(true);
    }

    public void drawBoard() {
        setBackground(Color.DARK_GRAY);
    }
}
