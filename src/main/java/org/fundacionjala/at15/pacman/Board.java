package org.fundacionjala.at15.pacman;

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
    private int[][] board; // 0 = empty, 1 = wall, 2 = pacman, 3 = ghost, dot = dot
    private JLabel[][] matriz;
    private Pacman pacman;
    private Ghost ghost;
    private int up = 0;
    private int down = 0;
    private int  left = 0;
    private int  right = 0;
    private Timer timer;
    private int point = 0;
    private final int rows = 15;
    private final int cols = 15;
    private final int ghostp = 3;
    private final int ghostPos = 13;
    private final int dot = 4;
    private final int wall = 1;
    private final int boardPos = 120;
    private final int boardHeight = 30;
    private final int incre = 5;
    private final int time = 200;

    public Board() {
        board = new int[rows][cols];
        matriz = new JLabel[rows][cols];
        pacman = new Pacman();
        ghost = new Ghost(ghostPos, ghostPos);

        for (int indI = 0; indI < board.length; indI++) {
            for (int indJ = 0; indJ < board.length; indJ++) {
                matriz[indI][indJ] = new JLabel();
            }
        }

        board = defectTable();
        board[pacman.getPosX()][pacman.getPosY()] = 2;
        board[ghost.getPosX()][ghost.getPosY()] = ghostp;
    }

    public void insertBoard(JPanel gamePanel) {
        for (int indI = 0; indI < board.length; indI++) {
            for (int indJ = 0; indJ < board.length; indJ++) {
                matriz[indI][indJ].setIcon(
                        new ImageIcon("src/main/java/org/fundacionjala/at15/pacman/images/" + board[indI][indJ] + ".png"));
                matriz[indI][indJ].setBounds(boardPos + (indI * boardHeight), boardPos + (indJ * boardHeight), boardHeight, boardHeight);
                matriz[indI][indJ].setVisible(true);
                gamePanel.add(matriz[indI][indJ], 0);
            }
        }
    }

    public void moverPacman(Window window, JPanel gamePanel, JLabel records, JPanel panelMenu) {
        timer = new Timer(time, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (up == 1 && (board[pacman.getPosX()][pacman.getPosY() - 1] == dot
                        || board[pacman.getPosX()][pacman.getPosY() - 1] == 0)) {
                    if (board[pacman.getPosX()][pacman.getPosY() - 1] == dot) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    board[pacman.getPosX()][pacman.getPosY()] = 0;

                    pacman.setPosY(pacman.getPosY() - 1);
                    board[pacman.getPosX()][pacman.getPosY()] = 2;
                    insertBoard(gamePanel);

                }
                if (down == 1 && (board[pacman.getPosX()][pacman.getPosY() + 1] == dot
                        || board[pacman.getPosX()][pacman.getPosY() + 1] == 0)) {
                    if (board[pacman.getPosX()][pacman.getPosY() + 1] == dot) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    board[pacman.getPosX()][pacman.getPosY()] = 0;
                    pacman.setPosY(pacman.getPosY() + 1);
                    board[pacman.getPosX()][pacman.getPosY()] = 2;
                    insertBoard(gamePanel);

                }
                if (left == 1 && (board[pacman.getPosX() - 1][pacman.getPosY()] == dot
                        || board[pacman.getPosX() - 1][pacman.getPosY()] == 0)) {
                    if (board[pacman.getPosX() - 1][pacman.getPosY()] == dot) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    board[pacman.getPosX()][pacman.getPosY()] = 0;
                    pacman.setPosX(pacman.getPosX() - 1);
                    board[pacman.getPosX()][pacman.getPosY()] = 2;
                    insertBoard(gamePanel);
                }
                if (right == 1 && (board[pacman.getPosX() + 1][pacman.getPosY()] == dot
                        || board[pacman.getPosX() + 1][pacman.getPosY()] == 0)) {
                    if (board[pacman.getPosX() + 1][pacman.getPosY()] == dot) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    board[pacman.getPosX()][pacman.getPosY()] = 0;

                    pacman.setPosX(pacman.getPosX() + 1);
                    board[pacman.getPosX()][pacman.getPosY()] = 2;
                    insertBoard(gamePanel);
                }
                int enc = 0;
                for (int indI = 0; indI < board.length; indI++) {
                    for (int indJ = 0; indJ < board.length; indJ++) {
                        if (board[indI][indJ] == dot) {
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
                // throw new UnsupportedOperationException("Not supported yet."); // Generated
                // from
                // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println(" up");
                    if (board[pacman.getPosX()][pacman.getPosY() - 1] == dot
                            || board[pacman.getPosX()][pacman.getPosY() - 1] == 0) {
                        up = 1;
                        down = 0;
                        left = 0;
                        right = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    System.out.println(" down");
                    if (board[pacman.getPosX()][pacman.getPosY() + 1] == dot
                            || board[pacman.getPosX()][pacman.getPosY() + 1] == 0) {
                        up = 0;
                        down = 1;
                        left = 0;
                        right = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.out.println(" left");
                    if (board[pacman.getPosX() - 1][pacman.getPosY()] == dot
                            || board[pacman.getPosX() - 1][pacman.getPosY()] == 0) {
                        up = 0;
                        down = 0;
                        left = 1;
                        right = 0;
                    }

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println(" right");
                    if (board[pacman.getPosX() + 1][pacman.getPosY()] == dot
                            || board[pacman.getPosX() + 1][pacman.getPosY()] == 0) {
                        up = 0;
                        down = 0;
                        left = 0;
                        right = 1;
                    }
                }
                // throw new UnsupportedOperationException("Not supported yet."); // Generated
                // from
                // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); // Generated
                // from
                // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    public int[][] defectTable() {
        int[][] aux = {
                {wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, dot, wall},
                {wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall}
        };
        return aux;
    }

    public int[][] getBoard() {
        return board;
    }

    public Pacman getPacman() {
        return pacman;
    }
}
