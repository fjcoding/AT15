package org.fundacionjala.at15.pacman;

public class Board {
    private int[][] board; // 0 = empty, 1 = wall, 2 = pacman, 3 = ghost, 4 = DOT, 5 = POWER_DOT
    private int pacmanX;
    private int pacmanY;
    private int ghostX;
    private int ghostY;
    private int ghostX2;
    private int ghostY2;
    private int score;
    private int level;
    private static final int SIZE = 10;
    private static final int NUMBER_4 = 4;
    private static final int NUMBER_6 = 6;
    private static final int NUMBER_9 = 9;

    public Board() {
        this.board = new int[SIZE][SIZE];
        this.pacmanX = 1;
        this.pacmanY = 1;
        this.ghostX = NUMBER_4;
        this.ghostY = NUMBER_4;
        this.ghostX2 = NUMBER_6;
        this.ghostY2 = NUMBER_6;
        this.score = 0;
        this.level = 1;
        this.initializeBoard();
        this.fillWall();
    }

    private void initializeBoard() {
        for (int indI = 0; indI < SIZE; indI++) {
            for (int indJ = 0; indJ < SIZE; indJ++) {
                this.board[indI][indJ] = NUMBER_4;
            }
        }
        this.board[1][1] = 2;

    }

    private void fillWall() {
        for (int indI = 0; indI < board.length; indI++) {
            board[indI][0] = 1;
        }
        for (int indI = 0; indI < board.length; indI++) {
            board[indI][NUMBER_9] = 1;
        }
        for (int indI = 0; indI < board[0].length; indI++) {
            board[0][indI] = 1;
        }
        for (int indI = 0; indI < board[0].length; indI++) {
            board[NUMBER_9][indI] = 1;
        }
    }

    public void restart() {
        this.pacmanX = 1;
        this.pacmanY = 1;
        this.ghostX = NUMBER_4;
        this.ghostY = NUMBER_4;
        this.ghostX2 = NUMBER_6;
        this.ghostY2 = NUMBER_6;
        setScore(0);
        this.level = level + 1;
        this.initializeBoard();
        this.fillWall();
    }

    public void restartAfterDie() {
        this.pacmanX = 1;
        this.pacmanY = 1;
        this.ghostX = NUMBER_4;
        this.ghostY = NUMBER_4;
        this.ghostX2 = NUMBER_6;
        this.ghostY2 = NUMBER_6;
    }

    public void printBoard() {
        for (int indI = 0; indI < board.length; indI++) {
            for (int indJ = 0; indJ < board[indI].length; indJ++) {
                if (indI == pacmanX && indJ == pacmanY) {
                    System.out.print("P ");
                } else if (board[indI][indJ] == 1) {
                    System.out.print("# ");
                } else if (indI == ghostX2 && indJ == ghostY2) {
                    System.out.print("G ");
                } else if (indI == ghostX && indJ == ghostY) {
                    System.out.print("G ");
                } else if (board[indI][indJ] == 2) {
                    System.out.print(". ");
                } else if (board[indI][indJ] == NUMBER_4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Score: " + this.score);
    }

    public int getLevel() {
        return this.level;
    }

    public void setPacmanX(int newPacmanX) {
        this.pacmanX = newPacmanX;
    }

    public void setPacmanY(int newPacmanY) {
        this.pacmanY = newPacmanY;
    }

    public void setGhostX(int newGhostX) {
        this.ghostX = newGhostX;
    }

    public void setGhostY(int newGhostY) {
        this.ghostY = newGhostY;
    }

    public void setGhostX2(int newGhostX2) {
        this.ghostX2 = newGhostX2;
    }

    public void setGhostY2(int newGhostY2) {
        this.ghostY2 = newGhostY2;
    }

    public void setScore(int newScore) {
        this.score = newScore;
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

    public int getScore() {
        return score;
    }

    public boolean isPacman(int x, int y) {
        return x == this.pacmanX && y == this.pacmanY;
    }

    public int[][] getBoard() {
        return board;
    }

    public boolean isWall(int x, int y) {
        return board[x][y] == 1;
    }

    public boolean isDot(int x, int y) {
        return board[x][y] == 2;
    }

    public boolean isPellet(int x, int y) {
        return board[x][y] == NUMBER_4;
    }

    public boolean isGhost(int x, int y) {
        boolean confirmation = false;
        if (pacmanX == ghostX && pacmanY == ghostY) {
            confirmation = true;
        } else if (pacmanX == ghostX2 && pacmanY == ghostY2) {
            confirmation = true;
        }
        return confirmation;
    }

    public void setDot(int x, int y) {
        board[x][y] = 2;
    }

    public void setPellet(int x, int y) {
        board[x][y] = NUMBER_4;
    }
}
