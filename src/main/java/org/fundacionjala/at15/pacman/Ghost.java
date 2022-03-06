package org.fundacionjala.at15.pacman;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ghost {
    private int posX;
    private int posY;
    private int direction;
    private Timer timerG;
    private final int randomLimit = 5;
    private final int randomOne = 1;
    private final int randomTwo = 2;
    private final int randomThree = 3;
    private final int randomFour = 4;
    static final int GHOSTP = 3;
    private final int boardLimit = 14;

    public Ghost(int newPosX, int newPosY) {
        this.posX = newPosX;
        this.posY = newPosY;
        this.direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getDirection() {
        return direction;
    }

    public void setPosX(int newPosX) {
        this.posX = newPosX;
    }

    public void setPosY(int newPosY) {
        this.posY = newPosY;
    }

    public void setDirection(int newDirection) {
        this.direction = newDirection;
    }

    public void move(Board theBoard) {
        timerG = new Timer(Board.DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[][] board = theBoard.getBoard();
                int[][] auxBoard = theBoard.getAuxBoard();
                direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);

                if (direction == randomOne) {
                    if (board[posX - 1][posY] != 1 && (board[posX - 1][posY] == 0 || board[posX - 1][posY] == Board.DOT)) {
                        board[posX][posY] = auxBoard[posX][posY];
                        posX--;
                        board[posX][posY] = GHOSTP;
                    } else if (posX > 0 && board[posX - 1][posY] == 1) {
                        direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
                    } else if (board[posX - 1][posY] == GHOSTP) {
                        direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
                    }
                } else if (direction == randomTwo) {
                    if (board[posX + 1][posY] != 1 && (board[posX + 1][posY] == 0 || board[posX - 1][posY] == Board.DOT)) {
                        board[posX][posY] = auxBoard[posX][posY];
                        posX++;
                        board[posX][posY] = GHOSTP;
                    } else if (posX < boardLimit && board[posX + 1][posY] == 1) {
                        direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
                    } else if (board[posX + 1][posY] == GHOSTP) {
                        direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
                    }
                } else if (direction == randomThree) {
                    if (board[posX][posY - 1] != 1 && (board[posX][posY - 1] == 0 || board[posX][posY - 1] == Board.DOT)) {
                        board[posX][posY] = auxBoard[posX][posY];
                        posY--;
                        board[posX][posY] = GHOSTP;
                    } else if (posY > 0 && board[posX][posY - 1] == 1) {
                        direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
                    } else if (board[posX][posY - 1] == GHOSTP) {
                        direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
                    }
                } else if (direction == randomFour) {
                    if (board[posX][posY + 1] != 1 && (board[posX][posY + 1] == 0 || board[posX][posY + 1] == Board.DOT)) {
                        board[posX][posY] = auxBoard[posX][posY];
                        posY++;
                        board[posX][posY] = GHOSTP;
                    } else if (posY < boardLimit && board[posX][posY + 1] == 1) {
                        direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
                    } else if (board[posX][posY + 1] == GHOSTP) {
                        direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
                    }
                }
                theBoard.setBoard(board);

                theBoard.insertBoard();
            }
        });
        timerG.start();
    }

    public void stopTimer() {
        timerG.stop();
    }
}
