package org.fundacionjala.at15.pacman;

public class Pacman {
    private Board board;
    private int posX;
    private int posY;
    private final int maxlives = 3;
    private final int dotscore = 10;
    private int lives;
    private int score;
    private boolean isDead;

    public Pacman(Board board) {
        this.board = board;
        this.posX = board.getPacmanX();
        this.posY = board.getPacmanY();
        this.lives = maxlives;
        this.score = 0;
        this.isDead = false;
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
            this.posX = this.board.getPacmanX();
            this.posY = this.board.getPacmanY();
        }
        if (this.board.isDot(this.posX, this.posY)) {
            board.setPacmanX(posX);
            board.setPacmanY(posY);
        }
        if (this.board.isPellet(posX, posY)) {
            this.score += dotscore;
            this.board.setScore(score);
            this.board.setDot(posX, posY);
            board.setPacmanX(posX);
            board.setPacmanY(posY);
        }
        if (this.board.isGhost(this.posX, this.posY)) {
            this.lives--;
            board.restartAfterDie();
            this.posX = this.board.getPacmanX();
            this.posY = this.board.getPacmanY();
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
        return this.posX;
    }

    public int getY() {
        return this.posY;
    }

    public void setX(int newPosX) {
        this.posX = newPosX;
    }

    public void setY(int newPosY) {
        this.posY = newPosY;
    }
}
