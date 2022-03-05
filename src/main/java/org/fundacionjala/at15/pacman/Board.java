package org.fundacionjala.at15.pacman;

import static org.fundacionjala.at15.pacman.Constants.Board.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board {
    private int[][] board; // 0 = empty, 1 = wall, 2 = pacman, 3 = ghost, 4 = dot
    private int[][] auxBoard;
    private JLabel[][] matriz;
    private Pacman pacman;
    private Table table = new Table();

    private int up = 0;
    private int down = 0;
    private int left = 0;
    private int right = 0;
    private Timer timer;
    private Timer timerG;
    private int point = 0;

    public Board() {
        board = new int[ROWS][COLS];
        auxBoard = new int[ROWS][COLS];
        matriz = new JLabel[ROWS][COLS];
        pacman = new Pacman();

        for (int indI = 0; indI < board.length; indI++) {
            for (int indJ = 0; indJ < board.length; indJ++) {
                matriz[indI][indJ] = new JLabel();
            }
        }
        auxBoard = table.tablePositions();
        board = table.tablePositions();
        board[pacman.getPosX()][pacman.getPosY()] = 2;
    }

    public void insertBoard(JPanel gamePanel) {
        String aux = ".png";
        int auxUp = getUp();
        int auxDown = getDown();
        int auxLeft = getLeft();
        int auxRight = getRight();
        for (int indI = 0; indI < board.length; indI++) {
            for (int indJ = 0; indJ < board.length; indJ++) {
                if (board[indI][indJ] == 2) {
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
                                "src/main/java/org/fundacionjala/at15/pacman/images/" + board[indI][indJ] + aux));

                matriz[indI][indJ].setBounds(BOARD_POS + (indI * BOARD_HEIGHT), BOARD_POS + (indJ * BOARD_HEIGHT),
                        BOARD_HEIGHT, BOARD_HEIGHT);
                matriz[indI][indJ].setVisible(true);
                gamePanel.add(matriz[indI][indJ], 0);
                aux = ".png";
            }
        }
    }

    public void movPacman(Window window, JPanel gamePanel, JLabel records, JPanel panelMenu) {
        timer = new Timer(TIME, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
                    insertBoard(gamePanel);

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
                    insertBoard(gamePanel);

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
                    insertBoard(gamePanel);
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
                    insertBoard(gamePanel);
                }
                if (board[pacman.getPosX() + 1][pacman.getPosY()] == GHOSTP
                        || board[pacman.getPosX() - 1][pacman.getPosY()] == GHOSTP
                        || board[pacman.getPosX()][pacman.getPosY() + 1] == GHOSTP
                        || board[pacman.getPosX()][pacman.getPosY() - 1] == GHOSTP) {
                    timerG.stop();
                    JOptionPane.showMessageDialog(window.getWindow(), "DEAD, YOU LOSE!");
                    gamePanel.setVisible(false);
                    panelMenu.setVisible(true);
                    timer.stop();
                }
                int enc = 0;
                for (int indI = 0; indI < board.length; indI++) {
                    for (int indJ = 0; indJ < board.length; indJ++) {
                        if (board[indI][indJ] == DOT) {
                            enc = 1;
                        }
                    }
                }
                if (enc == 0) {
                    JOptionPane.showMessageDialog(window.getWindow(), "YOU WIN!!!!");
                    gamePanel.setVisible(false);
                    panelMenu.setVisible(true);
                    timer.stop();
                }
            }
        });
        timer.start();

        window.getWindow().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (board[pacman.getPosX()][pacman.getPosY() - 1] == DOT
                            || board[pacman.getPosX()][pacman.getPosY() - 1] == 0) {
                        up = 1;
                        down = 0;
                        left = 0;
                        right = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (board[pacman.getPosX()][pacman.getPosY() + 1] == DOT
                            || board[pacman.getPosX()][pacman.getPosY() + 1] == 0) {
                        up = 0;
                        down = 1;
                        left = 0;
                        right = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (board[pacman.getPosX() - 1][pacman.getPosY()] == DOT
                            || board[pacman.getPosX() - 1][pacman.getPosY()] == 0) {
                        up = 0;
                        down = 0;
                        left = 1;
                        right = 0;
                    }

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (board[pacman.getPosX() + 1][pacman.getPosY()] == DOT
                            || board[pacman.getPosX() + 1][pacman.getPosY()] == 0) {
                        up = 0;
                        down = 0;
                        left = 0;
                        right = 1;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public void ghostMove(JPanel gamePanel, Ghost ghost) {
        timerG = new Timer(TIME, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                ghost.setDirection((int) Math.floor(Math.random() * (RANDOM_LIMIT - 1) + 1));

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

                insertBoard(gamePanel);

            }
        });
        timerG.start();
    }

    public void defectTable() {
        table.tablePositions();
    }

    public int[][] getBoard() {
        return board;
    }

    public Pacman getPacman() {
        return pacman;
    }

    public void setBoard(int[][] newBoard) {
        this.board = newBoard;
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
