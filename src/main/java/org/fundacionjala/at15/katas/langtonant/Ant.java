package org.fundacionjala.at15.katas.langtonant;

public class Ant extends Square {

    private Direction direction;

    public Ant(Direction direction, Square.Color color) {
        super(new Position(0, 0), color);
        this.direction = direction;
    }

    public Ant(Direction direction, Square.Color color, Position position) {
        super(position, color);
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void takeStep(Square.Color newColor) {
        turnDirection();
        moveForward();
        this.color = newColor;
    }

    public void turnDirection() {
        if (this.color == Square.Color.WHITE) {
            if (direction == Direction.WEST) {
                direction = Direction.NORTH;
            } else if (direction == Direction.NORTH) {
                direction = Direction.EAST;
            } else if (direction == Direction.EAST) {
                direction = Direction.SOUTH;
            } else if (direction == Direction.SOUTH) {
                direction = Direction.WEST;
            }
        } else if (this.color == Square.Color.BLACK) {
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
