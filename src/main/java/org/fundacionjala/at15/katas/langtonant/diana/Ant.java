package org.fundacionjala.at15.katas.langtonant.diana;

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

    // 0 -> black
    // 1 -> white
    public void nextStep() {
        switch (direction) {
            case "up":
                if (grid.getSquare(posX, posY) == 1) { // Is white?
                    if (isValidNextPosition(posX, posY + 1, "left or right")) {
                        grid.changeSquare(posX, posY);
                        posY++;
                        this.direction = "right";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isValidNextPosition(posX, posY - 1, "left or right")) {
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
                    if (isValidNextPosition(posX + 1, posY, "up or down")) {
                        grid.changeSquare(posX, posY);
                        posX++;
                        direction = "down";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isValidNextPosition(posX - 1, posY, "up or down")) {
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
                    if (isValidNextPosition(posX - 1, posY, "up or down")) {
                        grid.changeSquare(posX, posY);
                        posX--;
                        direction = "up";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isValidNextPosition(posX + 1, posY, "up or down")) {
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
                    if (isValidNextPosition(posX, posY - 1, "left or right")) {
                        grid.changeSquare(posX, posY);
                        posY--;
                        direction = "left";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isValidNextPosition(posX, posY + 1, "left or right")) {
                        grid.changeSquare(posX, posY);
                        posY++;
                        direction = "right";
                    } else {
                        finished = true;
                    }
                    break;
                }
        }
    }

    public boolean isValidNextPosition(int x, int y, String dir) {
        boolean flag = false;
        switch (dir) {
            case "up or down":
                if ((0 <= x) && (x < grid.getRows()))
                    flag = true;
                break;
            case "left or right":
                if ((0 <= y) && (y < grid.getColumns()))
                    flag = true;
                break;
        }
        return flag;
    }

    public void game(int n) {
        grid.printGrid();
        System.out.println();
        while (n > 0) {
            if (finished == false) {
                nextStep();
                n--;
            }
            System.out.println();
            grid.printGrid();
        }
        System.out.println("The game is over..."); // the game end
    }
}