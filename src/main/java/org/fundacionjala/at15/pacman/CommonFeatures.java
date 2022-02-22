package org.fundacionjala.at15.pacman;

public class CommonFeatures {
    protected final int rowLength = 10;
    protected final int colLength = 10;
    protected final int startPositionPacmanX = 1;
    protected final int startPositionPacmanY = 1;
    protected final int startPositionGhostX = 4;
    protected final int startPositionGhostY = 4;
    protected final int startPositionGhostX2 = 6;
    protected final int startPositionGhostY2 = 6;
    protected static int transitionX = 0;
    protected static int transitionY = 0;
    protected final int wall = 1;
    protected final int pacman = 2;
    protected final int ghost = 3;
    protected final int dot = 4;
    protected final int maxLives = 3;
    protected final int dotScore = 10;
    protected final String[] DIRECTION = new String[] {"w", "a", "s", "d" };
    protected final int DEFAULT_CONSTANT = 10;

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
}
