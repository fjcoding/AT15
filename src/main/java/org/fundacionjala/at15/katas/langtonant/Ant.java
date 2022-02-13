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
        Direction newDirection = findNextStepDirection();
        Position newPosition = findNextStepPosition(newDirection);

        this.direction = newDirection;
        this.position = newPosition;
        this.color = newColor;
    }

    public Direction findNextStepDirection() {
        Direction newDirection = null;
        if (this.color == Square.Color.WHITE) {
            if (this.direction == Direction.WEST) {
                newDirection = Direction.NORTH;
            } else if (this.direction == Direction.NORTH) {
                newDirection = Direction.EAST;
            } else if (this.direction == Direction.EAST) {
                newDirection = Direction.SOUTH;
            } else if (this.direction == Direction.SOUTH) {
                newDirection = Direction.WEST;
            }
        } else if (this.color == Square.Color.BLACK) {
            if (this.direction == Direction.WEST) {
                newDirection = Direction.SOUTH;
            } else if (this.direction == Direction.SOUTH) {
                newDirection = Direction.EAST;
            } else if (this.direction == Direction.EAST) {
                newDirection = Direction.NORTH;
            } else if (this.direction == Direction.NORTH) {
                newDirection = Direction.WEST;
            }
        }
        return newDirection;
    }

    public Position findNextStepPosition(Direction nextStepDirection) {
        int nextStepPosX = this.position.getX() + nextStepDirection.getXForward();
        int nextStepPosY = this.position.getY() + nextStepDirection.getYForward();
        return new Position(nextStepPosX, nextStepPosY);
    }
}
