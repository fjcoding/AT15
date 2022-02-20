package org.fundacionjala.at15.pacman;

public class Pacman {
    private Board board;
    private int x;
    private int y;
    private int lives;
    private int score;
    private boolean isDead;
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_10 = 10;

    public Pacman(Board board) {
        this.board = board;
        this.x = board.getPacmanX();
        this.y = board.getPacmanY();
        this.lives = NUMBER_3;
        this.score = 0;
        this.isDead = false;
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
            this.x = this.board.getPacmanX();
            this.y = this.board.getPacmanY();
        }
        if (this.board.isDot(this.x, this.y)) {
            board.setPacmanX(x);
            board.setPacmanY(y);
        }
        if (this.board.isPellet(x, y)) {
            this.score += NUMBER_10;
            this.board.setScore(score);
            this.board.setDot(x, y);
            board.setPacmanX(x);
            board.setPacmanY(y);
        }
        if (this.board.isGhost(this.x, this.y)) {
            this.lives--;
            board.restartAfterDie();
            this.x = this.board.getPacmanX();
            this.y = this.board.getPacmanY();
        }
        if (this.lives == 0) {
            this.isDead = true;
        }
    }

    public boolean isDead() {
        return this.isDead;
    }

    public int getLives() {
        return this.lives;
    }

    public int getScore() {
        return this.score;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }
}
