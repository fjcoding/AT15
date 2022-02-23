package org.fundacionjala.at15.pacman;

public class CommonFeatures {
    protected static final int ROW_LENGTH = 10;
    protected static final int COL_LENGTH = 10;
    protected static final int START_POSITION_PACMAN_X = 1;
    protected static final int START_POSITION_PACMAN_Y = 1;
    protected static final int START_POSITION_GHOST_X = 4;
    protected static final int START_POSITION_GHOST_Y = 4;
    protected static final int START_POSITION_GHOST_X_2 = 6;
    protected static final int START_POSITION_GHOST_Y_2 = 6;
    protected static int transitionX = 0;
    protected static int transitionY = 0;
    protected static final int WALL = 1;
    protected static final int PACMAN = 2;
    protected static final int GHOST = 3;
    protected static final int DOT = 4;
    protected static final int MAX_LIVES = 3;
    protected static final int DOT_SCORE = 10;
    protected static final String[] DIRECTION = new String[] {"w", "a", "s", "d" };
    protected static final int DEFAULT_CONSTANT = 10;

    public CommonFeatures() {

    }

    public void move(String direction) {
        if (direction.compareTo("w") == 0) {
            this.transitionX--;
        } else if (direction.compareTo("s") == 0) {
            this.transitionX++;
        } else if (direction.compareTo("a") == 0) {
            this.transitionY--;
        } else if (direction.compareTo("d") == 0) {
            this.transitionY++;
        }
    }

    public int getTransitionX() {
        return transitionX;
    }

    public int getTransitionY() {
        return transitionY;
    }

    public void setTransitionX(int numberX) {
        this.transitionX = numberX;
    }

    public void setTransitionY(int numberY) {
        this.transitionY = numberY;
    }


}
