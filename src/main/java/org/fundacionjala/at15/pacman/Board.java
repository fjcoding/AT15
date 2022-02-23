package org.fundacionjala.at15.pacman;

public class Board extends CommonFeatures {
    private int[][] board; // 0 = empty, 1 = wall, 2 = pacman, 3 = ghost, 4 = dot
    private int pacmanX;
    private int pacmanY;
    private int ghostX;
    private int ghostY;
    private int ghostX2;
    private int ghostY2;
    private int level;

    public Board() {
        this.board = new int[ROW_LENGTH][COL_LENGTH];
        this.pacmanX = START_POSITION_PACMAN_X;
        this.pacmanY = START_POSITION_PACMAN_Y;
        this.ghostX = START_POSITION_GHOST_X;
        this.ghostY = START_POSITION_GHOST_Y;
        this.ghostX2 = START_POSITION_GHOST_X_2;
        this.ghostY2 = START_POSITION_GHOST_Y_2;
        //this.score = 0;
        this.level = 1;
        this.initializeBoard();
        this.fillWall();
    }

    private void initializeBoard() {
        for (int indexI = 0; indexI < ROW_LENGTH; indexI++) {
            for (int indexJ = 0; indexJ < COL_LENGTH; indexJ++) {
                this.board[indexI][indexJ] = DOT;
            }
        }
        this.board[1][1] = PACMAN;

    }

    private void fillWall() {
        for (int indexI = 0; indexI < ROW_LENGTH; indexI++) {
            board[indexI][0] = WALL;
            board[indexI][COL_LENGTH - 1] = WALL;
        }

        for (int indexJ = 0; indexJ < COL_LENGTH; indexJ++) {
            board[0][indexJ] = WALL;
            board[ROW_LENGTH - 1][indexJ] = WALL;
        }
        // board[4][5] = 1;
        // board[5][5] = 1;
        // board[6][5] = 1;
    }

    public void restart() {
        pacmanX = START_POSITION_PACMAN_X;
        pacmanY = START_POSITION_PACMAN_Y;
        ghostX = START_POSITION_GHOST_X;
        ghostY = START_POSITION_GHOST_Y;
        ghostX2 = START_POSITION_GHOST_Y_2;
        ghostY2 = START_POSITION_GHOST_Y_2;
        level = level + 1;
        initializeBoard();
        fillWall();
    }


    public void printBoard() {
        for (int indexI = 0; indexI < board.length; indexI++) {
            for (int indexJ = 0; indexJ < board[indexI].length; indexJ++) {
                if (indexI == pacmanX && indexJ == pacmanY) {
                    System.out.print("P ");
                } else if (board[indexI][indexJ] == WALL) {
                    System.out.print("# ");
                } else if (indexI == ghostX2 && indexJ == ghostY2) {
                    System.out.print("G ");
                } else if (indexI == ghostX && indexJ == ghostY) {
                    System.out.print("G ");
                } else if (board[indexI][indexJ] == GHOST) {
                    System.out.print("G ");
                } else if (board[indexI][indexJ] == PACMAN) {
                    System.out.print(". ");
                } else if (board[indexI][indexJ] == DOT) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public int getLevel() {
        return level;
    }

    public void setPacmanX(int posX) {
        pacmanX = posX;
    }

    public void setPacmanY(int posY) {
        pacmanY = posY;
    }

    public void setGhostX(int posX) {
        ghostX = posX;
    }

    public void setGhostY(int posY) {
        ghostY = posY;
    }

    public void setGhostX2(int posX) {
        ghostX2 = posX;
    }

    public void setGhostY2(int posY) {
        ghostY2 = posY;
    }

    public int getPacmanX() {
        return pacmanX;
    }

    public int getPacmanY() {
        return pacmanY;
    }

    public int getGhostX() {
        return ghostX;
    }

    public int getGhostY() {
        return ghostY;
    }

    public int getGhostX2() {
        return ghostX2;
    }

    public int getGhostY2() {
        return ghostY2;
    }

    public boolean isPacman(int posX, int posY) {
        return posX == pacmanX && posY == pacmanY;
    }

    public int[][] getBoard() {
        return board;
    }

    public boolean isDot(int posX, int posY) {
        return board[posX][posY] == 2;
    }

    public boolean isPellet(int posX, int posY) {
        return board[posX][posY] == DOT;
    }

    public boolean isGhost(int posX, int posY) {
        boolean confirmation = false;
        if (posX == ghostX && posY == ghostY) {
            confirmation = true;
        } else if (posX == ghostX2 && posY == ghostY2) {
            confirmation = true;
        }
        return confirmation;
    }

    public void setDot(int posX, int posY) {
        board[posX][posY] = 2;
    }

    public void setPellet(int posX, int posY) {
        board[posX][posY] = DOT;
    }
}
