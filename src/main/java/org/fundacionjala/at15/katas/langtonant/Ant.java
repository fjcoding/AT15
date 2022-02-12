package org.fundacionjala.at15.katas.langtonant;

public class Ant {

    private Direction direction;
    private SquareColor squareColor;
    private Position position;

    public Ant(Direction direction, SquareColor squareColor) {
        this.direction = direction;
        this.squareColor = squareColor;
        this.position = new Position(0, 0);
    }

    public Ant(Direction direction, SquareColor squareColor, Position position) {
        this.direction = direction;
        this.squareColor = squareColor;
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    public SquareColor getSquareColor() {
        return squareColor;
    }

    public Position getPosition() {
        return position;
    }

    public void takeStep(SquareColor newSquareColor) {
        turnDirection();
        moveForward();
        this.squareColor = newSquareColor;
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

    public void moveForward() {
        int newXPos = this.position.getX() + this.direction.getXForward();
        int newYPos = this.position.getY() + this.direction.getYForward();
        this.position = new Position(newXPos, newYPos);
    }
}
