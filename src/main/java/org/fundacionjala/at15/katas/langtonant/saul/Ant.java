package org.fundacionjala.at15.katas.langtonant.saul;

public class Ant {
    private int posX;
    private int posY;
    private Grid grid;
    private String direction;
    private boolean finished;

    public Ant(int x, int y, Grid grid, String direction) {
        posX = x;
        posY = y;
        this.grid = grid;
        this.direction = direction;
        finished = false;           // the game is ready
    }

    /**
     * This method move the Ant one step depending the direction it is. A '0' square
     * means that is in black color, and '1' represents white color.
     */
    public void nextStep() {
        switch (direction) {
            case "up":
                if (grid.getSquare(posX, posY) == 1) {                      // is White?
                    if (isValidNextPosition(posX, posY + 1, "right")) {
                        grid.changeSquare(posX, posY);
                        posY += 1;
                        this.direction = "right";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isValidNextPosition(posX, posY - 1, "left")) {
                        grid.changeSquare(posX, posY);
                        posY -= 1;
                        this.direction = "left";
                    } else {
                        finished = true;
                    }
                }
                break;
            case "right":
                if (grid.getSquare(posX, posY) == 1) {
                    if (isValidNextPosition(posX + 1, posY, "down")) {
                        grid.changeSquare(posX, posY);
                        posX++;
                        direction = "down";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isValidNextPosition(posX - 1, posY, "up")) {
                        grid.changeSquare(posX, posY);
                        posX--;
                        direction = "up";
                    } else {
                        finished = true;
                    }
                }
                break;

            case "left":
                if (grid.getSquare(posX, posY) == 1) {
                    if (isValidNextPosition(posX - 1, posY, "up")) {
                        grid.changeSquare(posX, posY);
                        posX--;
                        direction = "up";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isValidNextPosition(posX + 1, posY, "down")) {
                        grid.changeSquare(posX, posY);
                        posX++;
                        direction = "down";
                    } else {
                        finished = true;
                    }
                }
                break;

            case "down":
                if (grid.getSquare(posX, posY) == 1) {
                    if (isValidNextPosition(posX, posY - 1, "left")) {
                        grid.changeSquare(posX, posY);
                        posY--;
                        direction = "left";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isValidNextPosition(posX, posY + 1, "right")) {
                        grid.changeSquare(posX, posY);
                        posY++;
                        direction = "right";
                    } else {
                        finished = true;
                    }
                    break;
                }
            default:
                break;
        }
    }

    /**
     * This Method verifies if the next position to move the Ant will be valid.
     * @param x next position in rows
     * @param y next position in columns
     * @param dir the direction that the Ant is
     * @return  true if the next position is valid, in other case will be false.
     */
    public boolean isValidNextPosition(int x, int y, String dir) {
        boolean flag = false;
        switch (dir) {
            case "up":
                if (x > 0) {
                    flag = true;
                }
                break;

            case "left":
                if (y > 0) {
                    flag = true;
                }
                break;

            case "right":
                if (y < grid.getColumns() - 1) {
                    flag = true;
                }
                break;

            case "down":
                if (x < grid.getRows() - 1) {
                    flag = true;
                }
                break;

            default:
                break;
        }
        return flag;
    }

    /**
     * This method move the Ant acording the steps given by the 'n' parameter.
     * @param n the steps that the Ant will move.
     */
    public void game(int n) {
        grid.printGrid();
        System.out.println();
        while (n > 0) {
            if (!finished) {
                nextStep();
                n--;
            }
            System.out.println();
            grid.printGrid();
        }
        System.out.println("The game is over...");
    }
}