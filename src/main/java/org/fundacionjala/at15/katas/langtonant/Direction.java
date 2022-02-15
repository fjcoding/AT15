package org.fundacionjala.at15.katas.langtonant;

public enum Direction {

    WEST(-1, 0),
    NORTH(0, 1),
    EAST(1, 0),
    SOUTH(0, -1);

    private final int xForward;
    private final int yForward;

    Direction(int xForward, int yForward) {
        this.xForward = xForward;
        this.yForward = yForward;
    }

    public int getXForward() {
        return this.xForward;
    }

    public int getYForward() {
        return this.yForward;
    }
}
