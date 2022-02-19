package org.fundacionjala.at15.pacman;

public class Grid {
    private String[][] mat;
    private final int colsX = 11;
    private final int rowsY = 11;
    private final int pacmanX = 10;
    private final int pacmanY = 10;
    private final int caseUp = 1;
    private final int caseDown = 2;
    private final int caseLeft = 3;
    private final int caseRight = 4;
    private final int gridLimit = 10;
    private final int ghostX1 = 2;
    private final int ghostY1 = 2;
    private final int ghostX2 = 2;
    private final int ghostY2 = 8;
    private final int ghostX3 = 8;
    private final int ghostY3 = 2;
    private final int limitRandom = 5;
    private PacMan pacman = new PacMan(pacmanX, pacmanY, true);
    private Ghost ghost1 = new Ghost(ghostX1, ghostY1);
    private Ghost ghost2 = new Ghost(ghostX2, ghostY2);
    private Ghost ghost3 = new Ghost(ghostX3, ghostY3);
    private String oldValue = "[*]";


    public String[][] crearGrid() {
        mat = new String[colsX][rowsY];
        for (int cols = 0; cols < colsX; cols++) {
            for (int rows = 0; rows < rowsY; rows++) {
                mat[cols][rows] = "[*]";
            }
        }
        mat[pacman.getPosx()][pacman.getPosy()] = "[P]";
        mat[ghost1.getXPos()][ghost1.getYPos()] = "[G]";
        mat[ghost2.getXPos()][ghost2.getYPos()] = "[G]";
        mat[ghost3.getXPos()][ghost3.getYPos()] = "[G]";
        return mat;
    }

    public String[][] movimientoPacman(int entrada, String[][] matriz) {
        matriz = ghostMove(matriz, ghost1);
        matriz = ghostMove(matriz, ghost2);
        matriz = ghostMove(matriz, ghost3);
        switch (entrada) {
            case caseUp:
                if (pacman.getPosx() == 0) {
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                } else {
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[ ]";
                    pacman.setPosx(pacman.getPosx() - 1);
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                }
                break;
            case caseDown:
                if (pacman.getPosx() == gridLimit) {
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                } else {
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[ ]";
                    pacman.setPosx(pacman.getPosx() + 1);
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                }
                break;
            case caseLeft:
                if (pacman.getPosy() == 0) {
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                } else {
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[ ]";
                    pacman.setPosy(pacman.getPosy() - 1);
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                }
                break;
            case caseRight:
                if (pacman.getPosy() == gridLimit) {
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                } else {
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[ ]";
                    pacman.setPosy(pacman.getPosy() + 1);
                    matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                }
                break;
            default:
                matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
        }
        return matriz;
    }

    public String[][] ghostMove(String[][] matriz, Ghost ghost) {
        String[][] moveMat = matriz;
        int random =   (int) Math.floor(Math.random() * (limitRandom - 1) + 1);
        switch (random) {
            case caseUp:
                if (ghost.getXPos() == 0) {
                    moveMat[ghost.getXPos()][ghost.getYPos()] = "[G]";
                } else {
                    moveMat[ghost.getXPos()][ghost.getYPos()] = oldValue;
                    ghost.setXPos(ghost.getXPos() - 1);
                    oldValue = moveMat[ghost.getXPos()][ghost.getYPos()];
                    moveMat[ghost.getXPos()][ghost.getYPos()] = "[G]";
                }
                break;

            case caseDown:
                if (ghost.getXPos() == gridLimit) {
                    moveMat[ghost.getXPos()][ghost.getYPos()] = "[G]";
                } else {
                    moveMat[ghost.getXPos()][ghost.getYPos()] = oldValue;
                    ghost.setXPos(ghost.getXPos() + 1);
                    oldValue = moveMat[ghost.getXPos()][ghost.getYPos()];
                    moveMat[ghost.getXPos()][ghost.getYPos()] = "[G]";
                }
                break;

            case caseLeft:
                if (ghost.getYPos() == 0) {
                    moveMat[ghost.getXPos()][ghost.getYPos()] = "[G]";
                } else {
                    moveMat[ghost.getXPos()][ghost.getYPos()] = oldValue;
                    ghost.setYPos(ghost.getYPos() - 1);
                    oldValue = moveMat[ghost.getXPos()][ghost.getYPos()];
                    moveMat[ghost.getXPos()][ghost.getYPos()] = "[G]";
                }
                break;

            case caseRight:
                if (ghost.getYPos() == gridLimit) {
                    moveMat[ghost.getXPos()][ghost.getYPos()] = "[G]";
                } else {
                    moveMat[ghost.getXPos()][ghost.getYPos()] = oldValue;
                    ghost.setXPos(ghost.getYPos() + 1);
                    oldValue = moveMat[ghost.getXPos()][ghost.getYPos()];
                    moveMat[ghost.getXPos()][ghost.getYPos()] = "[G]";
                }
                break;
        }
        return moveMat;
    }
    public void print(String[][] matriz) {
        for (int col = 0; col < matriz.length; col++) {
            for (int row = 0; row < matriz.length; row++) {
                System.out.print(matriz[col][row] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
