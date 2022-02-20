package org.fundacionjala.at15.pacman;

public class Board {
    private int[][] board;  // 0 = empty, 1 = wall, 2 = pacman, 3 = ghost, 4 = DOT, 5 = POWER_DOT
    private int pacmanX;
    private int pacmanY;
    private int ghostX;
    private int ghostY;
    private int ghostX2;
    private int ghostY2;
    private int score;
    private boolean fruit;

    public Board() {
        this.board = new int[10][10];
        this.pacmanX = 1;
        this.pacmanY = 1;
        this.ghostX = 4;
        this.ghostY = 4;
        this.ghostX2 = 6;
        this.ghostY2 = 6;
        this.score = 0;
        this.fruit = false;
        this.initializeBoard();
        this.fillWall();
    }

    private void initializeBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.board[i][j] = 4;
            }
        }
        this.board[1][1] = 2;

    }

    private void fillWall() {
        for (int i = 0; i < board.length; i++) {
            board[i][0] = 1;
        }
        for (int i = 0; i < board.length; i++) {
            board[i][9] = 1;
        }
        for (int i = 0; i < board[0].length; i++) {
            board[0][i] = 1;
        }
        for (int i = 0; i < board[0].length; i++) {
            board[9][i] = 1;
        }

        // board[4][5] = 1;
        // board[5][5] = 1;
        // board[6][5] = 1;
    }

    public void restart() {
        this.pacmanX = 1;
        this.pacmanY = 1;
        this.score = 0;
        this.fruit = false;
        this.initializeBoard();
        this.fillWall();
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == pacmanX && j == pacmanY) {
                    System.out.print("P ");
                } else if (board[i][j] == 1) {
                    System.out.print("# ");
                } else if (i == ghostX2 && j == ghostY2) {
                    System.out.print("G ");
                } else if (i == ghostX && j == ghostY) {
                    System.out.print("G ");
                } else if (board[i][j] == 2) {
                    System.out.print(". ");
                } else if (board[i][j] == 4) {
                    System.out.print("* ");
                } else if (board[i][j] == 5) {
                    System.out.print("F ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Score: " + this.score);
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public void setPacmanX(int pacmanX) {
        this.pacmanX = pacmanX;
    }

    public void setPacmanY(int pacmanY) {
        this.pacmanY = pacmanY;
    }

    public void setGhostX(int ghostX) {
        this.ghostX = ghostX;
    }

    public void setGhostY(int ghostY) {
        this.ghostY = ghostY;
    }

    public void setGhostX2(int ghostX2) {
        this.ghostX2 = ghostX2;
    }

    public void setGhostY2(int ghostY2) {
        this.ghostY2 = ghostY2;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setFruit(boolean fruit) {
        this.fruit = fruit;
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

    public boolean isFruit() {
        return fruit;
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
        return board[x][y] == 4;
    }

    public boolean isFruit(int x, int y) {
        return board[x][y] == 5;
    }

    public boolean isGhost(int x, int y) {
        return board[x][y] == 3;
    }

    public void setDot(int x, int y) {
        board[x][y] = 2;
    }
    public void setPellet(int x, int y){
        board[x][y] = 4;
    }
}
