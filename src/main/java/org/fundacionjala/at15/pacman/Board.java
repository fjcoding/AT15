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
                aux = UtilitiesPacman.pacmanDirections(board, indI, indJ, auxUp, auxDown, auxLeft, auxRight, aux);
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
                insertBoard(
                        UtilitiesPacman.pacmanMovement(board, pacman, up, down, left, right, point, records, auxBoard,
                                gamePanel));
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
                up = 0;
                down = 0;
                left = 0;
                right = 0;
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    up = UtilitiesPacman.pacmanUp(board, pacman, up, down, left, right);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    down = UtilitiesPacman.pacmanDown(board, pacman, up, down, left, right);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    left = UtilitiesPacman.pacmanLeft(board, pacman, up, down, left, right);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    right = UtilitiesPacman.pacmanRight(board, pacman, up, down, left, right);
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
                UtilitiesGhost.ghostMovement(board, ghost, auxBoard);
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
