package org.fundacionjala.at15.pacman;

import static org.fundacionjala.at15.pacman.Constants.Board.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class UtilitiesPacman {

    public static String pacmanDirections(int[][] board, int indI, int indJ, int auxUp, int auxDown, int auxLeft,
            int auxRight, String aux) {
        String pacmanAux = ".png";
        if (board[indI][indJ] == 2) {
            if (auxRight == 1) {
                pacmanAux = "pacmanright.gif";
            }
            if (auxLeft == 1) {
                pacmanAux = "pacmanleft.gif";
            }
            if (auxUp == 1) {
                pacmanAux = "pacmanup.gif";
            }
            if (auxDown == 1) {
                pacmanAux = "pacmandown.gif";
            }
        }
        return pacmanAux;
    }

    public static JPanel pacmanMovement(int[][] board, Pacman pacman, int up, int down, int left, int right, int point,
            JLabel records, int[][] auxBoard, JPanel gamePanel) {
        if (up == 1 && (board[pacman.getPosX()][pacman.getPosY() - 1] == DOT
                || board[pacman.getPosX()][pacman.getPosY() - 1] == 0)) {
            if (board[pacman.getPosX()][pacman.getPosY() - 1] == DOT) {
                point += INCRE;
                records.setText("points: " + point);
            }
            board[pacman.getPosX()][pacman.getPosY()] = 0;
            auxBoard[pacman.getPosX()][pacman.getPosY()] = board[pacman.getPosX()][pacman.getPosY()];
            pacman.setPosY(pacman.getPosY() - 1);
            board[pacman.getPosX()][pacman.getPosY()] = 2;
            return gamePanel;

        }
        if (down == 1 && (board[pacman.getPosX()][pacman.getPosY() + 1] == DOT
                || board[pacman.getPosX()][pacman.getPosY() + 1] == 0)) {
            if (board[pacman.getPosX()][pacman.getPosY() + 1] == DOT) {
                point += INCRE;
                records.setText("points: " + point);
            }
            board[pacman.getPosX()][pacman.getPosY()] = 0;
            auxBoard[pacman.getPosX()][pacman.getPosY()] = board[pacman.getPosX()][pacman.getPosY()];
            pacman.setPosY(pacman.getPosY() + 1);
            board[pacman.getPosX()][pacman.getPosY()] = 2;
            return gamePanel;

        }
        if (left == 1 && (board[pacman.getPosX() - 1][pacman.getPosY()] == DOT
                || board[pacman.getPosX() - 1][pacman.getPosY()] == 0)) {
            if (board[pacman.getPosX() - 1][pacman.getPosY()] == DOT) {
                point += INCRE;
                records.setText("points: " + point);
            }
            board[pacman.getPosX()][pacman.getPosY()] = 0;
            auxBoard[pacman.getPosX()][pacman.getPosY()] = board[pacman.getPosX()][pacman.getPosY()];
            pacman.setPosX(pacman.getPosX() - 1);
            board[pacman.getPosX()][pacman.getPosY()] = 2;
            return gamePanel;
        }
        if (right == 1 && (board[pacman.getPosX() + 1][pacman.getPosY()] == DOT
                || board[pacman.getPosX() + 1][pacman.getPosY()] == 0)) {
            if (board[pacman.getPosX() + 1][pacman.getPosY()] == DOT) {
                point += INCRE;
                records.setText("points: " + point);
            }
            board[pacman.getPosX()][pacman.getPosY()] = 0;
            auxBoard[pacman.getPosX()][pacman.getPosY()] = board[pacman.getPosX()][pacman.getPosY()];
            pacman.setPosX(pacman.getPosX() + 1);
            board[pacman.getPosX()][pacman.getPosY()] = 2;
            return gamePanel;
        }
        return gamePanel;
    }

    public static int pacmanUp(int[][] board, Pacman pacman, int up, int down, int left, int right) {
        if (board[pacman.getPosX()][pacman.getPosY() - 1] == DOT
                || board[pacman.getPosX()][pacman.getPosY() - 1] == 0) {
            up = 1;
            down = 0;
            left = 0;
            right = 0;
        }
        return up;
    }

    public static int pacmanDown(int[][] board, Pacman pacman, int up, int down, int left, int right) {
        if (board[pacman.getPosX()][pacman.getPosY() + 1] == DOT
                || board[pacman.getPosX()][pacman.getPosY() + 1] == 0) {
            up = 0;
            down = 1;
            left = 0;
            right = 0;
        }
        return down;
    }

    public static int pacmanLeft(int[][] board, Pacman pacman, int up, int down, int left, int right) {
        if (board[pacman.getPosX() - 1][pacman.getPosY()] == DOT
                || board[pacman.getPosX() - 1][pacman.getPosY()] == 0) {
            up = 0;
            down = 0;
            left = 1;
            right = 0;
        }
        return left;
    }

    public static int pacmanRight(int[][] board, Pacman pacman, int up, int down, int left, int right) {
        if (board[pacman.getPosX() + 1][pacman.getPosY()] == DOT
                || board[pacman.getPosX() + 1][pacman.getPosY()] == 0) {
            up = 0;
            down = 0;
            left = 0;
            right = 1;
        }
        return right;
    }

}
