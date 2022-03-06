package org.fundacionjala.at15.pacman;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pacman {
    private int posX;
    private int posY;
    private Timer timer;
    private int up = 0;
    private int down = 0;
    private int left = 0;
    private int right = 0;
    private int point = 0;
    private final int incre = 5;

    public Pacman() {
        posX = 1;
        posY = 1;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int newPosX) {
        this.posX = newPosX;
    }

    public void setPosY(int newPosY) {
        this.posY = newPosY;
    }

    public void move(Board board, JLabel records, Window window, Panel gamePanel, Panel panelMenu) {
        timer = new Timer(Board.DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[][] grid = board.getGrid();
                int[][] auxGrid = board.getAuxGrid();
                if (up == 1 && (grid[posX][posY - 1] == Board.DOT
                        || grid[posX][posY - 1] == 0)) {
                    if (grid[posX][posY - 1] == Board.DOT) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    grid[posX][posY] = 0;
                    auxGrid[posX][posY] = grid[posX][posY];
                    posY--;
                    grid[posX][posY] = 2;
                    board.insertBoard();
                }
                if (down == 1 && (grid[posX][posY + 1] == Board.DOT
                        || grid[posX][posY + 1] == 0)) {
                    if (grid[posX][posY + 1] == Board.DOT) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    grid[posX][posY] = 0;
                    auxGrid[posX][posY] = grid[posX][posY];
                    posY++;
                    grid[posX][posY] = 2;
                    board.insertBoard();

                }
                if (left == 1 && (grid[posX - 1][posY] == Board.DOT
                        || grid[posX - 1][posY] == 0)) {
                    if (grid[posX - 1][posY] == Board.DOT) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    grid[posX][posY] = 0;
                    auxGrid[posX][posY] = grid[posX][posY];
                    posX--;
                    grid[posX][posY] = 2;
                    board.insertBoard();
                }
                if (right == 1 && (grid[posX + 1][posY] == Board.DOT
                        || grid[posX + 1][posY] == 0)) {
                    if (grid[posX + 1][posY] == Board.DOT) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    grid[posX][posY] = 0;
                    auxGrid[posX][posY] = grid[posX][posY];
                    posX++;
                    grid[posX][posY] = 2;
                    board.insertBoard();
                }
                if (grid[posX + 1][posY] == Ghost.GHOSTP
                        || grid[posX - 1][posY] == Ghost.GHOSTP
                        || grid[posX][posY + 1] == Ghost.GHOSTP
                        || grid[posX][posY - 1] == Ghost.GHOSTP) {
                    board.stopGhostGroup();
                    JOptionPane.showMessageDialog(window, "DEAD, YOU LOSE!");
                    gamePanel.setVisible(false);
                    panelMenu.setVisible(true);
                    timer.stop();
                }
                int enc = 0;
                for (int indI = 0; indI < grid.length; indI++) {
                    for (int indJ = 0; indJ < grid.length; indJ++) {
                        if (grid[indI][indJ] == Board.DOT) {
                            enc = 1;
                        }
                    }
                }
                if (enc == 0) {
                    JOptionPane.showMessageDialog(window, "YOU WIN!!!!");
                    gamePanel.setVisible(false);
                    panelMenu.setVisible(true);
                    timer.stop();
                }
            }
        });
        timer.start();

        window.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int[][] grid = board.getGrid();
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (grid[posX][posY - 1] == Board.DOT
                            || grid[posX][posY - 1] == 0) {
                        up = 1;
                        down = 0;
                        left = 0;
                        right = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (grid[posX][posY + 1] == Board.DOT
                            || grid[posX][posY + 1] == 0) {
                        up = 0;
                        down = 1;
                        left = 0;
                        right = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (grid[posX - 1][posY] == Board.DOT
                            || grid[posX - 1][posY] == 0) {
                        up = 0;
                        down = 0;
                        left = 1;
                        right = 0;
                    }

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (grid[posX + 1][posY] == Board.DOT
                            || grid[posX + 1][posY] == 0) {
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
