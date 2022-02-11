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

    public void turnDirection() {
        if (squareColor == SquareColor.WHITE) {
            if (direction == Direction.WEST) {
                direction = Direction.NORTH;
            } else if (direction == Direction.NORTH) {
                direction = Direction.EAST;
            } else if (direction == Direction.EAST) {
                direction = Direction.SOUTH;
            } else if (direction == Direction.SOUTH) {
                direction = Direction.WEST;
            }
        } else if (squareColor == SquareColor.BLACK) {
            if (direction == Direction.WEST) {
                direction = Direction.SOUTH;
            } else if (direction == Direction.SOUTH) {
                direction = Direction.EAST;
            } else if (direction == Direction.EAST) {
                direction = Direction.NORTH;
            } else if (direction == Direction.NORTH) {
                direction = Direction.WEST;
            }
        }
    }
}
