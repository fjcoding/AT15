package org.fundacionjala.at15.pacman;

public class Ghost {
    private Board board;
    private int x;
    private int y;
    private boolean isDead;
    String direction;

    public Ghost(Board board) {
        this.board = board;
        this.x = board.getGhostX();
        this.y = board.getGhostY();
        this.isDead = false;
        direction = "w";
    }

    public void move() {
        //char direction = this.board.getDirection();
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
        }
        if (this.board.isPacman(this.x, this.y)) {
            //this.lives--;
            this.x = this.board.getGhostX();
            this.y = this.board.getGhostY();
        }
        //if (this.lives == 0) {
        //    this.isDead = true;
        //}
    }

    public boolean isDead() {
        return this.isDead;
    }
}
