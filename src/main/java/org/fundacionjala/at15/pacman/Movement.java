package org.fundacionjala.at15.pacman;

import static org.fundacionjala.at15.pacman.Constants.Board.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.ImageIcon;

public class Movement {
    private int[][] board1; // 0 = empty, 1 = wall, 2 = pacman, 3 = ghost, 4 = dot
    private int[][] auxBoard;
    private JLabel[][] matriz;
    private Timer timerG;

    private int up = 0;
    private int down = 0;
    private int left = 0;
    private int right = 0;

    public void insertBoard(JPanel gamePanel) {
        String aux = ".png";
        int auxUp = getUp();
        int auxDown = getDown();
        int auxLeft = getLeft();
        int auxRight = getRight();
        for (int indI = 0; indI < board1.length; indI++) {
            for (int indJ = 0; indJ < board1.length; indJ++) {
                if (board1[indI][indJ] == 2) {
                    if (auxRight == 1) {
                        aux = "pacmanright.gif";
                    }
                    if (auxLeft == 1) {
                        aux = "pacmanleft.gif";
                    }
                    if (auxUp == 1) {
                        aux = "pacmanup.gif";
                    }
                    if (auxDown == 1) {
                        aux = "pacmandown.gif";
                    }
                }
                matriz[indI][indJ].setIcon(
                        new ImageIcon(
                                "src/main/java/org/fundacionjala/at15/pacman/images/" + board1[indI][indJ] + aux));

                matriz[indI][indJ].setBounds(BOARD_POS + (indI * BOARD_HEIGHT), BOARD_POS + (indJ * BOARD_HEIGHT),
                        BOARD_HEIGHT, BOARD_HEIGHT);
                matriz[indI][indJ].setVisible(true);
                gamePanel.add(matriz[indI][indJ], 0);
                aux = ".png";
            }
        }
    }

    public void movementGhost(JPanel gamePanel, Ghost ghost) {
        timerG = new Timer(TIME, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
                System.out.println(ghost);
                System.out.println("-------------------------------------------");
                System.out.println(board1);
                if (ghost.getDirection() == RANDOM_ONE) {
                    if (board1[ghost.getPosX() - 1][ghost.getPosY()] != 1
                            && (board1[ghost.getPosX() - 1][ghost.getPosY()] == 0
                                    || board1[ghost.getPosX() - 1][ghost.getPosY()] == DOT)) {
                        board1[ghost.getPosX()][ghost.getPosY()] = auxBoard[ghost.getPosX()][ghost.getPosY()];
                        ghost.setPosX(ghost.getPosX() - 1);
                        board1[ghost.getPosX()][ghost.getPosY()] = GHOSTP;
                    } else if (ghost.getPosX() > 0 && board1[ghost.getPosX() - 1][ghost.getPosY()] == 1) {
                        ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
                    } else if (board1[ghost.getPosX() - 1][ghost.getPosY()] == GHOSTP) {
                        ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
                    }
                } else if (ghost.getDirection() == RANDOM_TWO) {
                    if (board1[ghost.getPosX() + 1][ghost.getPosY()] != 1
                            && (board1[ghost.getPosX() + 1][ghost.getPosY()] == 0
                                    || board1[ghost.getPosX() - 1][ghost.getPosY()] == DOT)) {
                        board1[ghost.getPosX()][ghost.getPosY()] = auxBoard[ghost.getPosX()][ghost.getPosY()];
                        ghost.setPosX(ghost.getPosX() + 1);
                        board1[ghost.getPosX()][ghost.getPosY()] = GHOSTP;
                    } else if (ghost.getPosX() < BOARD_LIMIT && board1[ghost.getPosX() + 1][ghost.getPosY()] == 1) {
                        ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
                    } else if (board1[ghost.getPosX() + 1][ghost.getPosY()] == GHOSTP) {
                        ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
                    }
                } else if (ghost.getDirection() == RANDOM_THREE) {
                    if (board1[ghost.getPosX()][ghost.getPosY() - 1] != 1
                            && (board1[ghost.getPosX()][ghost.getPosY() - 1] == 0
                                    || board1[ghost.getPosX()][ghost.getPosY() - 1] == DOT)) {
                        board1[ghost.getPosX()][ghost.getPosY()] = auxBoard[ghost.getPosX()][ghost.getPosY()];
                        ghost.setPosY(ghost.getPosY() - 1);
                        board1[ghost.getPosX()][ghost.getPosY()] = GHOSTP;
                    } else if (ghost.getPosY() > 0 && board1[ghost.getPosX()][ghost.getPosY() - 1] == 1) {
                        ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
                    } else if (board1[ghost.getPosX()][ghost.getPosY() - 1] == GHOSTP) {
                        ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
                    }
                } else if (ghost.getDirection() == RANDOM_FOUR) {
                    if (board1[ghost.getPosX()][ghost.getPosY() + 1] != 1
                            && (board1[ghost.getPosX()][ghost.getPosY() + 1] == 0
                                    || board1[ghost.getPosX()][ghost.getPosY() + 1] == DOT)) {
                        board1[ghost.getPosX()][ghost.getPosY()] = auxBoard[ghost.getPosX()][ghost.getPosY()];
                        ghost.setPosY(ghost.getPosY() + 1);
                        board1[ghost.getPosX()][ghost.getPosY()] = GHOSTP;
                    } else if (ghost.getPosY() < BOARD_LIMIT && board1[ghost.getPosX()][ghost.getPosY() + 1] == 1) {
                        ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
                    } else if (board1[ghost.getPosX()][ghost.getPosY() + 1] == GHOSTP) {
                        ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));
                    }
                }
                insertBoard(gamePanel);
            }
        });
        timerG.start();
    }

    public int getUp() {
        return up;
    }

    public int getDown() {
        return down;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
