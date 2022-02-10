package org.fundacionjala.at15.katas.langtonant.jimy;
public class Ant {
    private int posX;
    private int posY;
    private Board board;
    private String direction;
    private boolean finished;

    public Ant(int x, int y, Board board, String direction) {
        posX = x;
        posY = y;
        this.board = board;
        this.direction = direction;
        finished = false;
    }

    // 0 -> black square   (left)
    // 1 -> white square (right)
    public void nextStep() {
        switch (direction) {
            case "up":
                if (board.getPosition(posX, posY) == 1) {
                    if (isInBoard(posX, posY + 1, "right")) {
                        board.changeStatePosition(posX, posY);
                        posY += 1;
                        this.direction = "right";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isInBoard(posX, posY - 1, "left")) {
                        board.getPosition(posX, posY);
                        posY -= 1;
                        this.direction = "left";
                    } else {
                        finished = true;
                    }
                }
                break;
            case "right":
                if (board.getPosition(posX, posY) == 1) {
                    if (isInBoard(posX + 1, posY, "down")) {
                        board.changeStatePosition(posX, posY);
                        posX++;
                        direction = "down";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isInBoard(posX - 1, posY, "up")) {
                        board.changeStatePosition(posX, posY);
                        posX--;
                        direction = "up";
                    } else {
                        finished = true;
                    }
                }
                break;
            case "left":
                if (board.getPosition(posX, posY) == 1) {
                    if (isInBoard(posX - 1, posY, "up")) {
                        board.changeStatePosition(posX, posY);
                        posX--;
                        direction = "up";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isInBoard(posX + 1, posY, "down")) {
                        board.getPosition(posX, posY);
                        posX++;
                        direction = "down";
                    } else {
                        finished = true;
                    }
                }
                break;
            case "down":
                if (board.getPosition(posX, posY) == 1) {
                    if (isInBoard(posX, posY - 1, "left")) {
                        board.changeStatePosition(posX, posY);
                        posY--;
                        direction = "left";
                    } else {
                        finished = true;
                    }
                } else {
                    if (isInBoard(posX, posY + 1, "right")) {
                        board.changeStatePosition(posX, posY);
                        posY++;
                        direction = "right";
                    } else {
                        finished = true;
                    }
                }
                break;
            default:
                break;
        }
    }

    public boolean isInBoard(int x, int y, String dir) {
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
                if (y < board.getColumns() - 1) {
                    flag = true;
                }
                break;
            case "down":
                if (x < board.getRows() - 1) {
                    flag = true;
                }
                break;
            default:
                break;
        }
        return flag;
    }

    public void playGame(int n) {
        board.printBoard();
        System.out.println();
        while (n > 0) {
            if (!finished) {
                nextStep();
                n--;
            }
            System.out.println();
            board.printBoard();
        }
        System.out.println("Game Over");
    }
}