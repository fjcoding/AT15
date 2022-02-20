package org.fundacionjala.at15.pacman;

public class Ghost {
    private Board board;
    private int x;
    private int y;



    public Ghost(Board board) {
        this.board = board;
        this.x = board.getGhostX();
        this.y = board.getGhostY();

    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void move(String direction) {
        if (direction.compareTo("w") == 0) {
            this.x--;
        } else if (direction.compareTo("s") == 0) {
            this.x++;
        } else if (direction.compareTo("a") == 0) {
            this.y--;
        } else if (direction.compareTo("d") == 0) {
            this.y++;
        }
        if (this.board.isWall(this.x, this.y)) {
            this.x = this.board.getGhostX();
            this.y = this.board.getGhostY();
        } else if (this.board.isPacman(this.x, this.y)) {
            board.setLives(board.getLives() - 1);
            board.restartAfterDie();
            this.x = this.board.getGhostX();
            this.y = this.board.getGhostY();
        } else if (this.board.isDot(this.x, this.y)) {
            board.setGhostX(x);
            board.setGhostY(y);
            this.board.setDot(x, y);
        } else if (this.board.isPellet(x, y)) {
            this.board.setPellet(x, y);
            board.setGhostX(x);
            board.setGhostY(y);
        }
    }
}
