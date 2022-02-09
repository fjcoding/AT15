package org.fundacionjala.at15.katas.langtonant.adrian;

public class Ant {
    private int valueinx;
    private int valueiny;
    private int state;
    private final int up = 0;
    private final int right = 1;
    private final int down = 2;
    private final int left = 3;
    private int direction;
    private Board tablero;

    public Ant(int valueinx, int valueiny, int direction, Board tablero) {
        this.valueinx = valueinx;
        this.valueiny = valueiny;
        this.direction = direction;
        this.tablero = tablero;
        state = tablero.getPosTablero(valueiny, valueinx);
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
                state = tablero.getPosTablero(valueiny - 1, valueinx);
                valueiny = valueiny - 1;
                break;
                case right:
                state = tablero.getPosTablero(valueiny, valueinx + 1);
                valueinx = valueinx + 1;
                break;
                case down:
                state = tablero.getPosTablero(valueiny + 1, valueinx);
                valueiny = valueiny + 1;
                break;
                case left:
                state = tablero.getPosTablero(valueiny, valueinx - 1);
                valueinx = valueinx - 1;
                break;
                default:
                System.out.println("Error while moving forward");
            }

            if (valueinx > tablero.getWidth() - 1) {
                valueinx = 0;
            } else if (valueinx < 0) {
                valueinx = tablero.getWidth() - 1;
            }
            if (valueiny > tablero.getHeight() - 1) {
                valueiny = 0;
            } else if (valueiny < 0) {
                valueiny = tablero.getHeight() - 1;
            }
    }
    public void draw(int n) {
        while (n > 0) {
            if (state == 0) {
                turnRight();
                tablero.setPos1(valueiny, valueinx);
                moveForward();
            } else if (state == 1) {
                turnLeft();
                tablero.setPos0(valueiny, valueinx);
                moveForward();
            }
            n--;
        }
        tablero.print();
    }
}
