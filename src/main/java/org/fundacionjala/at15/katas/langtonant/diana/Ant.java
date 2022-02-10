package org.fundacionjala.at15.katas.langtonant.diana;

public class Ant {
    private int posX;
    private int posY;
    private Grid grid;
    private String direction;
    private boolean finished;
    private boolean flag = false;

    public Ant(int x, int y, Grid grid, String direction) {
        posX = x;
        posY = y;
        this.grid = grid;
        this.direction = direction;
        finished = false; // the game is ready
    }

    // 0 -> black
    // 1 -> white
    public void nextStep() {
        switch (direction) {
            case "up":
                if (grid.getSquare(posX, posY) == 1) { // Is white?
                    if (isInMatrix(posX, posY + 1, "left or right")) {
                        grid.changeSquare(posX, posY);
                        posY++;
                        this.direction = "right";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isInMatrix(posX, posY - 1, "left or right")) {
                        grid.changeSquare(posX, posY);
                        posY--;
                        this.direction = "left";
                    } else {
                        finished = true;
                    }
                }
                break;
            case "right":
                if (grid.getSquare(posX, posY) == 1) {
                    if (isInMatrix(posX + 1, posY, "up or down")) {
                        grid.changeSquare(posX, posY);
                        posX++;
                        direction = "down";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isInMatrix(posX - 1, posY, "up or down")) {
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
                    if (isInMatrix(posX - 1, posY, "up or down")) {
                        grid.changeSquare(posX, posY);
                        posX--;
                        direction = "up";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isInMatrix(posX + 1, posY, "up or down")) {
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
                    if (isInMatrix(posX, posY - 1, "left or right")) {
                        grid.changeSquare(posX, posY);
                        posY--;
                        direction = "left";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isInMatrix(posX, posY + 1, "left or right")) {
                        grid.changeSquare(posX, posY);
                        posY++;
                        direction = "right";
                    } else {
                        finished = true;
                    }
                    break;
                }
            default:
                finished = false;
        }
    }

    public boolean isInMatrix(int x, int y, String dir) {
        switch (dir) {
            case "up or down":
                if ((0 <= x) && (x < grid.getRows())) {
                    flag = true;
                }
                break;
            case "left or right":
                if ((0 <= y) && (y < grid.getColumns())) {
                    flag = true;
                }
                break;
            default:
                flag = false;
        }
        return flag;
    }

    public void run(int steps) {
        grid.printGrid();
        System.out.println();
        while (steps > 0) {
            if (!finished) {
                nextStep();
                steps--;
            }
            System.out.println();
            grid.printGrid();
        }
        System.out.println("Completed game");
    }
}