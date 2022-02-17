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
    private PacMan pacman = new PacMan(pacmanX, pacmanY, true);

    public String[][] crearGrid() {
        mat = new String[colsX][rowsY];
        for (int cols = 0; cols < colsX; cols++) {
            for (int rows = 0; rows < rowsY; rows++) {
                mat[cols][rows] = "[*]";
            }
        }
        mat[pacman.getPosx()][pacman.getPosy()] = "[P]";
        return mat;
    }

    public String[][] movimientoPacman(int entrada, String[][] matriz) {
        switch (entrada) {
            case caseUp:
                matriz[pacman.getPosx()][pacman.getPosy()] = "[ ]";
                pacman.setPosx(pacman.getPosx() - 1);
                matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                break;
            case caseDown:
                matriz[pacman.getPosx()][pacman.getPosy()] = "[ ]";
                pacman.setPosx(pacman.getPosx() + 1);
                matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                break;
            case caseLeft:
                matriz[pacman.getPosx()][pacman.getPosy()] = "[ ]";
                pacman.setPosy(pacman.getPosy() - 1);
                matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                break;
            case caseRight:
                matriz[pacman.getPosx()][pacman.getPosy()] = "[ ]";
                pacman.setPosy(pacman.getPosy() + 1);
                matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
                break;
            default:
                matriz[pacman.getPosx()][pacman.getPosy()] = "[P]";
        }
        return matriz;

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
