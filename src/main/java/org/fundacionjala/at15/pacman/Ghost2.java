package org.fundacionjala.at15.pacman;

public class Ghost2 {
    private Board board;
    private int posX;
    private int posY;

    public Ghost2(Board board) {
        this.board = board;
        this.posX = board.getGhostX2();
        this.posY = board.getGhostY2();
    }

    public void setX(int newX) {
        this.posX = newX;
    }

    public void setY(int newY) {
        this.posY = newY;
    }

    public void move(String direction) {
        if (direction.compareTo("w") == 0) {
            this.posX--;
        } else if (direction.compareTo("s") == 0) {
            this.posX++;
        } else if (direction.compareTo("a") == 0) {
            this.posY--;
        } else if (direction.compareTo("d") == 0) {
            this.posY++;
        }
        if (this.board.isWall(this.posX, this.posY)) {
            this.posX = this.board.getGhostX2();
            this.posY = this.board.getGhostY2();
        } else if (this.board.isPacman(this.posX, this.posY)) {
            this.posX = this.board.getGhostX2();
            this.posY = this.board.getGhostY2();
        } else if (this.board.isDot(this.posX, this.posY)) {
            board.setGhostX2(posX);
            board.setGhostY2(posY);
            this.board.setDot(posX, posY);
        } else if (this.board.isPellet(posX, posY)) {
            this.board.setPellet(posX, posY);
            board.setGhostX2(posX);
            board.setGhostY2(posY);
        }
    }
}