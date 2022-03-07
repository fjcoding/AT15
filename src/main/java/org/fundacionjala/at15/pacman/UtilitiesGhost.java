package org.fundacionjala.at15.pacman;

import static org.fundacionjala.at15.pacman.Constants.Board.*;

public class UtilitiesGhost {
    public static void ghostMovement(int[][] board, Ghost ghost, int[][] auxBoard) {
        if (ghost.getDirection() == RANDOM_ONE) {
            if (board[ghost.getPosX() - 1][ghost.getPosY()] != 1
                    && (board[ghost.getPosX() - 1][ghost.getPosY()] == 0
                            || board[ghost.getPosX() - 1][ghost.getPosY()] == DOT)) {
                board[ghost.getPosX()][ghost.getPosY()] = auxBoard[ghost.getPosX()][ghost.getPosY()];
                ghost.setPosX(ghost.getPosX() - 1);
                board[ghost.getPosX()][ghost.getPosY()] = GHOSTP;
            } else if (ghost.getPosX() > 0 && board[ghost.getPosX() - 1][ghost.getPosY()] == 1) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
            } else if (board[ghost.getPosX() - 1][ghost.getPosY()] == GHOSTP) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
            }
        } else if (ghost.getDirection() == RANDOM_TWO) {
            if (board[ghost.getPosX() + 1][ghost.getPosY()] != 1
                    && (board[ghost.getPosX() + 1][ghost.getPosY()] == 0
                            || board[ghost.getPosX() - 1][ghost.getPosY()] == DOT)) {
                board[ghost.getPosX()][ghost.getPosY()] = auxBoard[ghost.getPosX()][ghost.getPosY()];
                ghost.setPosX(ghost.getPosX() + 1);
                board[ghost.getPosX()][ghost.getPosY()] = GHOSTP;
            } else if (ghost.getPosX() < BOARD_LIMIT && board[ghost.getPosX() + 1][ghost.getPosY()] == 1) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
            } else if (board[ghost.getPosX() + 1][ghost.getPosY()] == GHOSTP) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
            }
        } else if (ghost.getDirection() == RANDOM_THREE) {
            if (board[ghost.getPosX()][ghost.getPosY() - 1] != 1
                    && (board[ghost.getPosX()][ghost.getPosY() - 1] == 0
                            || board[ghost.getPosX()][ghost.getPosY() - 1] == DOT)) {
                board[ghost.getPosX()][ghost.getPosY()] = auxBoard[ghost.getPosX()][ghost.getPosY()];
                ghost.setPosY(ghost.getPosY() - 1);
                board[ghost.getPosX()][ghost.getPosY()] = GHOSTP;
            } else if (ghost.getPosY() > 0 && board[ghost.getPosX()][ghost.getPosY() - 1] == 1) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
            } else if (board[ghost.getPosX()][ghost.getPosY() - 1] == GHOSTP) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
            }
        } else if (ghost.getDirection() == RANDOM_FOUR) {
            if (board[ghost.getPosX()][ghost.getPosY() + 1] != 1
                    && (board[ghost.getPosX()][ghost.getPosY() + 1] == 0
                            || board[ghost.getPosX()][ghost.getPosY() + 1] == DOT)) {
                board[ghost.getPosX()][ghost.getPosY()] = auxBoard[ghost.getPosX()][ghost.getPosY()];
                ghost.setPosY(ghost.getPosY() + 1);
                board[ghost.getPosX()][ghost.getPosY()] = GHOSTP;
            } else if (ghost.getPosY() < BOARD_LIMIT && board[ghost.getPosX()][ghost.getPosY() + 1] == 1) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
            } else if (board[ghost.getPosX()][ghost.getPosY() + 1] == GHOSTP) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
            }
        }
    }

}
