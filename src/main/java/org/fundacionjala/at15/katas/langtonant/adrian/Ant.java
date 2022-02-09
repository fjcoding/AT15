package org.fundacionjala.at15.katas.langtonant.adrian;

public class Ant {
    private int valueInX;
    private int valueInY;
    private int state;
    private final int up = 0;
    private final int right = 1;
    private final int down = 2;
    private final int left = 3;
    private int direction;
    private Board grid;

    public Ant(int valueInX, int valueInY, int direction, Board grid) {
        this.valueInX = valueInX;
        this.valueInY = valueInY;
        this.direction = direction;
        this.grid = grid;
        state = grid.getPosGrid(valueInY, valueInX);
    }

    public void turnRight() {
        direction++;
        if (direction > left) {
            direction = up;
        }
    }
    public void turnLeft() {
        direction--;
        if (direction < up) {
            direction = left;
        }
    }
    public void moveForward() {
        switch (direction) {
                case up:
                state = grid.getPosGrid(valueInY - 1, valueInX);
                valueInY = valueInY - 1;
                break;
                case right:
                state = grid.getPosGrid(valueInY, valueInX + 1);
                valueInX = valueInX + 1;
                break;
                case down:
                state = grid.getPosGrid(valueInY + 1, valueInX);
                valueInY = valueInY + 1;
                break;
                case left:
                state = grid.getPosGrid(valueInY, valueInX - 1);
                valueInX = valueInX - 1;
                break;
                default:
                System.out.println("Error while moving forward");
            }

            if (valueInX > grid.getWidth() - 1) {
                valueInX = 0;
            } else if (valueInX < 0) {
                valueInX = grid.getWidth() - 1;
            }
            if (valueInY > grid.getHeight() - 1) {
                valueInY = 0;
            } else if (valueInY < 0) {
                valueInY = grid.getHeight() - 1;
            }
    }
    public void draw(int n) {
        while (n > 0) {
            if (state == 0) {
                turnRight();
                grid.setPos1(valueInY, valueInX);
                moveForward();
            } else if (state == 1) {
                turnLeft();
                grid.setPos0(valueInY, valueInX);
                moveForward();
            }
            n--;
        }
        grid.print();
    }
}
