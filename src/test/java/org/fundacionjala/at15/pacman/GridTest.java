package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GridTest {
    // @Test
    // public void itShoultCreateTheGridWithPacman() {
    //     Grid grid = new Grid();
    //     String[][] matGrid = grid.crearGrid();
    //     String[][] expectedMat = new String[11][11];
    //     for (int cols = 0; cols < expectedMat.length; cols++) {
    //         for (int rows = 0; rows < expectedMat.length; rows++) {
    //             expectedMat[cols][rows] = "[*]";
    //         }
    //     }
    //     expectedMat[10][10] = "[P]";
    //     expectedMat[2][2] = "[G]";
    //     expectedMat[2][8] = "[G]";
    //     expectedMat[8][2] = "[G]";
    //     assertArrayEquals(expectedMat, matGrid);
    // }
    /*
    @Test
    public void itShoultMoveUpPacman() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        matGrid = grid.movimientoPacman(1, matGrid);
        String[][] expectedMat = new String[11][11];
        for (int cols = 0; cols < expectedMat.length; cols++) {
            for (int rows = 0; rows < expectedMat.length; rows++) {
                expectedMat[cols][rows] = "[*]";
            }
        }
        expectedMat[9][10] = "[P]";
        expectedMat[10][10] = "[ ]";
        assertArrayEquals(expectedMat, matGrid);
    }

    @Test
    public void itShoultMoveLeftPacman() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        matGrid = grid.movimientoPacman(3, matGrid);
        String[][] expectedMat = new String[11][11];
        for (int cols = 0; cols < expectedMat.length; cols++) {
            for (int rows = 0; rows < expectedMat.length; rows++) {
                expectedMat[cols][rows] = "[*]";
            }
        }
        expectedMat[10][9] = "[P]";
        expectedMat[10][10] = "[ ]";
        assertArrayEquals(expectedMat, matGrid);
    }

    @Test
    public void itShoultMoveDownPacman() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        matGrid = grid.movimientoPacman(1, matGrid);
        matGrid = grid.movimientoPacman(2, matGrid);
        String[][] expectedMat = new String[11][11];
        for (int cols = 0; cols < expectedMat.length; cols++) {
            for (int rows = 0; rows < expectedMat.length; rows++) {
                expectedMat[cols][rows] = "[*]";
            }
        }
        expectedMat[9][10] = "[ ]";
        expectedMat[10][10] = "[P]";
        assertArrayEquals(expectedMat, matGrid);
    }

    @Test
    public void itShoultMoveRightPacman() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        matGrid = grid.movimientoPacman(3, matGrid);
        matGrid = grid.movimientoPacman(4, matGrid);
        String[][] expectedMat = new String[11][11];
        for (int cols = 0; cols < expectedMat.length; cols++) {
            for (int rows = 0; rows < expectedMat.length; rows++) {
                expectedMat[cols][rows] = "[*]";
            }
        }
        expectedMat[10][9] = "[ ]";
        expectedMat[10][10] = "[P]";
        assertArrayEquals(expectedMat, matGrid);
    }

    @Test
    public void itShoultShowDefaultSwitchCase() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        matGrid = grid.movimientoPacman(7, matGrid);
        String[][] expectedMat = new String[11][11];
        for (int cols = 0; cols < expectedMat.length; cols++) {
            for (int rows = 0; rows < expectedMat.length; rows++) {
                expectedMat[cols][rows] = "[*]";
            }
        }
        expectedMat[2][2] = "[G]";
        expectedMat[2][8] = "[G]";
        expectedMat[8][2] = "[G]";
        expectedMat[10][10] = "[P]";
        assertArrayEquals(expectedMat, matGrid);
    }*/
}
