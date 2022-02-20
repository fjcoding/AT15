package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GridTest {
    @Test
    public void itShoultCreateTheGridWithPacman() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        String[][] expectedMat = {
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[_]", "[_]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" }
        };
        expectedMat[10][10] = "[P]";
        expectedMat[2][2] = "[G]";
        expectedMat[2][8] = "[G]";
        expectedMat[8][2] = "[G]";
        assertArrayEquals(expectedMat, matGrid);
    }

    @Test
    public void itShoultMoveUpPacman() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        int random =   (int) Math.floor(Math.random() * (5 - 1) + 1);
        matGrid = grid.movimientoPacman(1, matGrid, random);
        String[][] expectedMat = {
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[_]", "[_]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" }
        };
        expectedMat[9][10] = "[P]";
        expectedMat[10][10] = "[ ]";
        switch (random) {
            case 1:
                expectedMat[1][2] = "[G]";
                expectedMat[1][8] = "[G]";
                expectedMat[7][2] = "[G]";
                break;
            case 2:
                expectedMat[3][2] = "[G]";
                expectedMat[3][8] = "[G]";
                expectedMat[9][2] = "[G]";
                break;
            case 3:
                expectedMat[2][1] = "[G]";
                expectedMat[2][7] = "[G]";
                expectedMat[8][1] = "[G]";
                break;
            case 4:
                expectedMat[2][3] = "[G]";
                expectedMat[2][9] = "[G]";
                expectedMat[8][3] = "[G]";
                break;
            default:
                break;
        }
        assertArrayEquals(expectedMat, matGrid);
    }

    @Test
    public void itShoultMoveDownPacman() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        int random =   (int) Math.floor(Math.random() * (5 - 1) + 1);
        matGrid = grid.movimientoPacman(1, matGrid, random);
        matGrid = grid.movimientoPacman(2, matGrid, random);
        String[][] expectedMat = {
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[_]", "[_]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" }
        };
        expectedMat[9][10] = "[ ]";
        expectedMat[10][10] = "[P]";
        switch (random) {
            case 1:
                expectedMat[0][2] = "[G]";
                expectedMat[0][8] = "[G]";
                expectedMat[6][2] = "[G]";
                break;
            case 2:
                expectedMat[4][2] = "[G]";
                expectedMat[4][8] = "[G]";
                expectedMat[10][2] = "[G]";
                break;
            case 3:
                expectedMat[2][0] = "[G]";
                expectedMat[2][6] = "[G]";
                expectedMat[8][0] = "[G]";
                break;
            case 4:
                expectedMat[2][4] = "[G]";
                expectedMat[2][10] = "[G]";
                expectedMat[8][4] = "[G]";
                break;
            default:
                break;
        }
        assertArrayEquals(expectedMat, matGrid);
    }

    @Test
    public void itShoultMoveLeftPacman() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        int random =   (int) Math.floor(Math.random() * (5 - 1) + 1);
        matGrid = grid.movimientoPacman(3, matGrid, random);
        String[][] expectedMat = {
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[_]", "[_]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" }
        };
        expectedMat[10][9] = "[P]";
        expectedMat[10][10] = "[ ]";
        switch (random) {
            case 1:
                expectedMat[1][2] = "[G]";
                expectedMat[1][8] = "[G]";
                expectedMat[7][2] = "[G]";
                break;
            case 2:
                expectedMat[3][2] = "[G]";
                expectedMat[3][8] = "[G]";
                expectedMat[9][2] = "[G]";
                break;
            case 3:
                expectedMat[2][1] = "[G]";
                expectedMat[2][7] = "[G]";
                expectedMat[8][1] = "[G]";
                break;
            case 4:
                expectedMat[2][3] = "[G]";
                expectedMat[2][9] = "[G]";
                expectedMat[8][3] = "[G]";
                break;
            default:
                break;
        }
        assertArrayEquals(expectedMat, matGrid);
    }

    @Test
    public void itShoultMoveRightPacman() {
        Grid grid = new Grid();
        String[][] matGrid = grid.crearGrid();
        int random =   (int) Math.floor(Math.random() * (5 - 1) + 1);
        matGrid = grid.movimientoPacman(3, matGrid, random);
        matGrid = grid.movimientoPacman(4, matGrid, random);
        String[][] expectedMat = {
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[_]", "[_]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[|]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" },
            {"[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]", "[*]" }
        };
        expectedMat[10][9] = "[ ]";
        expectedMat[10][10] = "[P]";
        switch (random) {
            case 1:
                expectedMat[0][2] = "[G]";
                expectedMat[0][8] = "[G]";
                expectedMat[6][2] = "[G]";
                break;
            case 2:
                expectedMat[4][2] = "[G]";
                expectedMat[4][8] = "[G]";
                expectedMat[10][2] = "[G]";
                break;
            case 3:
                expectedMat[2][0] = "[G]";
                expectedMat[2][6] = "[G]";
                expectedMat[8][0] = "[G]";
                break;
            case 4:
                expectedMat[2][4] = "[G]";
                expectedMat[2][10] = "[G]";
                expectedMat[8][4] = "[G]";
                break;
            default:
                break;
        }
        assertArrayEquals(expectedMat, matGrid);
    }
/*
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
