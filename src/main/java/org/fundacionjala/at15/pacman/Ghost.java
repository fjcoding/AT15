package org.fundacionjala.at15.pacman;

public class Ghost {
    private Board board;
    private int posX;
    private int poxY;

    public Ghost(Board board) {
        this.board = board;
        this.posX = board.getGhostX();
        this.poxY = board.getGhostY();
    }

    public void setX(int newX) {
        this.posX = newX;
    }

    public void setY(int newY) {
        this.poxY = newY;
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return poxY;
    }

    public void move(String direction) {
        if (direction.compareTo("w") == 0) {
            this.posX--;
        } else if (direction.compareTo("s") == 0) {
            this.posX++;
        } else if (direction.compareTo("a") == 0) {
            this.poxY--;
        } else if (direction.compareTo("d") == 0) {
            this.poxY++;
        }
        if (this.board.isWall(this.posX, this.poxY)) {
            this.posX = this.board.getGhostX();
            this.poxY = this.board.getGhostY();
        } else if (this.board.isPacman(this.posX, this.poxY)) {
            this.posX = this.board.getGhostX();
            this.poxY = this.board.getGhostY();
        } else if (this.board.isDot(this.posX, this.poxY)) {
            board.setGhostX(posX);
            board.setGhostY(poxY);
            this.board.setDot(posX, poxY);
        } else if (this.board.isPellet(posX, poxY)) {
            this.board.setPellet(posX, poxY);
            board.setGhostX(posX);
            board.setGhostY(poxY);
        }
    }
}
