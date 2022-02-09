
package org.fundacionjala.at15.katas.langtonant.mauricio;

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
        finished = false; // the game is ready
    }

    public void nextStep() {
        switch (direction) {
            case "up":
                // System.out.println("UP");
                if (grid.getSquare(posX, posY) == 1) {
                    if (isValidNextPosition(posX, posY + 1, "right")) {
                        grid.changeSquare(posX, posY); // Change square to 1 or 0
                        posY += 1;
                        this.direction = "right";
                    } else {
                        finished = true;
                    }
                } else { // if is 0
                    if (isValidNextPosition(posX, posY - 1, "left")) {
                        grid.changeSquare(posX, posY); // Change square to 1 or 0
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
                } else { // if is 0
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
                } else { // if is 0
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
                } else { // if is 0
                    if (isValidNextPosition(posX, posY + 1, "right")) {
                        grid.changeSquare(posX, posY);
                        posY++;
                        direction = "right";
                    } else {
                        finished = true;
                    }
                    break;
                }
            default: // Incorrect direction
                break;
        }
    }

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
            default: // Incorrect direction
                break;

        }
        return flag;
    }

    public void game(int n) {
        System.out.println();
        while (n > 0) {
            if (!finished) {
                nextStep();
                n--;
            }
            System.out.println();
            grid.printGrid();
        }
        System.out.println("The game is over and the Ant did: " + n + " steps!");
    }
}