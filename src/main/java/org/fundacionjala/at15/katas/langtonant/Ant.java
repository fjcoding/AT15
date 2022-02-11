package org.fundacionjala.at15.katas.langtonant;

public class Ant {

    private Direction direction;
    private SquareColor squareColor;

    enum Direction {
        WEST, NORTH, EAST, SOUTH
    }

    public Ant(Direction direction, SquareColor squareColor) {
        this.direction = direction;
        this.squareColor = squareColor;
    }

    public Direction getDirection() {
        return direction;
    }

    public SquareColor getSquareColor() {
        return squareColor;
    }
}
