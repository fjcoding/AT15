package org.fundacionjala.at15.pacman;

public class Pacman {
    private Board board;
    private int x;
    private int y;
    private int lives;
    private int score;
    private boolean isDead;

    public Pacman(Board board) {
        this.board = board;
        this.x = board.getPacmanX();
        this.y = board.getPacmanY();
        this.lives = 3;
        this.score = 0;
        this.isDead = false;
    }


    public void move(String direction) {
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
            this.x = this.board.getPacmanX();
            this.y = this.board.getPacmanY();
        }
        if (this.board.isDot(this.x, this.y)) {
            board.setPacmanX(x);
            board.setPacmanY(y);
        }
        if (this.board.isPellet(x, y)) {
            this.score += 10;
            this.board.setScore(score);
            this.board.setDot(x, y);
            board.setPacmanX(x);
            board.setPacmanY(y);
        }
        // if (this.board.isFruit(this.x, this.y)) {
        //     this.score += 100;
        //     this.board.setScore(score);
        //     this.board.setFruit(false);
        // }
        if (this.board.isGhost(this.x, this.y)) {
            this.lives--;
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
