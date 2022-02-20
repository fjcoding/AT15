package org.fundacionjala.at15.pacman;

public class Board {
    private int[][] board; // 0 = empty, 1 = wall, 2 = pacman, 3 = ghost, 4 = dot
    private final int rowLength = 10;
    private final int colLength = 10;
    private final int startPositionPacmanX = 1;
    private final int startPositionPacmanY = 1;
    private final int startPositionGhostX = 4;
    private final int startPositionGhostY = 4;
    private final int startPositionGhostX2 = 6;
    private final int startPositionGhostY2 = 6;
    private final int wall = 1;
    private final int pacman = 2;
    private final int ghost = 3;
    private final int dot = 4;
    private int pacmanX;
    private int pacmanY;
    private int ghostX;
    private int ghostY;
    private int ghostX2;
    private int ghostY2;
    private int score;
    private int level;

    public Board() {
        this.board = new int[rowLength][colLength];
        this.pacmanX = startPositionPacmanX;
        this.pacmanY = startPositionPacmanY;
        this.ghostX = startPositionGhostX;
        this.ghostY = startPositionGhostY;
        this.ghostX2 = startPositionGhostX2;
        this.ghostY2 = startPositionGhostY2;
        this.score = 0;
        this.level = 1;
        this.initializeBoard();
        this.fillWall();
    }

    private void initializeBoard() {
        for (int indexI = 0; indexI < rowLength; indexI++) {
            for (int indexJ = 0; indexJ < colLength; indexJ++) {
                this.board[indexI][indexJ] = dot;
            }
        }
        this.board[1][1] = pacman;

    }

    private void fillWall() {
        for (int indexI = 0; indexI < rowLength; indexI++) {
            board[indexI][0] = wall;
            board[indexI][colLength - 1] = wall;
        }

        for (int indexJ = 0; indexJ < colLength; indexJ++) {
            board[0][indexJ] = wall;
            board[rowLength - 1][indexJ] = wall;
        }
        // board[4][5] = 1;
        // board[5][5] = 1;
        // board[6][5] = 1;
    }

    public void restart() {
        pacmanX = startPositionPacmanX;
        pacmanY = startPositionPacmanY;
        ghostX = startPositionGhostX;
        ghostY = startPositionGhostY;
        ghostX2 = startPositionGhostY2;
        ghostY2 = startPositionGhostY2;
        setScore(0);
        level = level + 1;
        initializeBoard();
        fillWall();
    }

    public void restartAfterDie() {
        pacmanY = startPositionPacmanY;
        pacmanX = startPositionPacmanX;
        ghostX = startPositionGhostX;
        ghostY = startPositionGhostY;
        ghostX2 = startPositionGhostX2;
        ghostY2 = startPositionGhostY2;
    }

    public void printBoard() {
        for (int indexI = 0; indexI < board.length; indexI++) {
            for (int indexJ = 0; indexJ < board[indexI].length; indexJ++) {
                if (indexI == pacmanX && indexJ == pacmanY) {
                    System.out.print("P ");
                } else if (board[indexI][indexJ] == wall) {
                    System.out.print("# ");
                } else if (indexI == ghostX2 && indexJ == ghostY2) {
                    System.out.print("G ");
                } else if (indexI == ghostX && indexJ == ghostY) {
                    System.out.print("G ");
                } else if (board[indexI][indexJ] == ghost) {
                    System.out.print("G ");
                } else if (board[indexI][indexJ] == pacman) {
                    System.out.print(". ");
                } else if (board[indexI][indexJ] == dot) {
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

    public void setScore(int newScore) {
        score = newScore;
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

    public boolean isPacman(int posX, int posY) {
        return posX == pacmanX && posY == pacmanY;
    }

    public int[][] getBoard() {
        return board;
    }

    public boolean isWall(int posX, int posY) {
        return board[posX][posY] == wall;
    }

    public boolean isDot(int posX, int posY) {
        return board[posX][posY] == 2;
    }

    public boolean isPellet(int posX, int posY) {
        return board[posX][posY] == dot;
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
        board[posX][posY] = dot;
    }
}
