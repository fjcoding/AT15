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
    private int[][] grid; // 0 = empty, 1 = wall, 2 = pacman, 3 = ghost, 4 = dot
    private int[][] auxGrid;
    private JLabel[][] matriz;
    private Pacman pacman;
    private Ghost ghost1;
    private Ghost ghost2;
    private Ghost ghost3;
    private Panel gamePanel;

    private int up = 0;
    private int down = 0;
    private int left = 0;
    private int right = 0;
    private Timer timer;
    private int point = 0;
    private final int rows = 15;
    private final int cols = 15;
    static final int DOT = 4;
    private final int wall = 1;
    private final int boardPos = 120;
    private final int boardHeight = 30;
    private final int incre = 5;
    static final int DELAY = 200;
    private final int ghostPos = 13;
    private final int ghostPos1 = 12;
    private final int ghostArray = 3;

    public Board(Panel gamePanel) {
        this.gamePanel = gamePanel;
        grid = new int[rows][cols];
        auxGrid = new int[rows][cols];
        matriz = new JLabel[rows][cols];
        pacman = new Pacman();
        ghost1 = new Ghost(ghostPos, ghostPos);
        ghost2 = new Ghost(ghostPos1, ghostPos);
        ghost3 = new Ghost(ghostPos, ghostPos1);

        for (int indI = 0; indI < grid.length; indI++) {
            for (int indJ = 0; indJ < grid.length; indJ++) {
                matriz[indI][indJ] = new JLabel();
            }
        }
        auxGrid = defectTable();
        grid = defectTable();
        grid[pacman.getPosX()][pacman.getPosY()] = 2;
        grid[ghost1.getPosX()][ghost1.getPosY()] = ghostArray;
        grid[ghost2.getPosX()][ghost2.getPosY()] = ghostArray;
        grid[ghost3.getPosX()][ghost3.getPosY()] = ghostArray;
    }

    public void insertBoard() {
        String aux = ".png";
        int auxUp = getUp();
        int auxDown = getDown();
        int auxLeft = getLeft();
        int auxRight = getRight();
        for (int indI = 0; indI < grid.length; indI++) {
            for (int indJ = 0; indJ < grid.length; indJ++) {
                if (grid[indI][indJ] == 2) {
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
                                "src/main/java/org/fundacionjala/at15/pacman/images/" + grid[indI][indJ] + aux));

                matriz[indI][indJ].setBounds(boardPos + (indI * boardHeight), boardPos + (indJ * boardHeight),
                        boardHeight, boardHeight);
                matriz[indI][indJ].setVisible(true);
                gamePanel.add(matriz[indI][indJ], 0);
                aux = ".png";
            }
        }
    }

    public void movPacman(Window window, JLabel records, JPanel panelMenu) {
        timer = new Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (up == 1 && (grid[pacman.getPosX()][pacman.getPosY() - 1] == DOT
                        || grid[pacman.getPosX()][pacman.getPosY() - 1] == 0)) {
                    if (grid[pacman.getPosX()][pacman.getPosY() - 1] == DOT) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    grid[pacman.getPosX()][pacman.getPosY()] = 0;
                    auxGrid[pacman.getPosX()][pacman.getPosY()] = grid[pacman.getPosX()][pacman.getPosY()];
                    pacman.setPosY(pacman.getPosY() - 1);
                    grid[pacman.getPosX()][pacman.getPosY()] = 2;
                    insertBoard();

                }
                if (down == 1 && (grid[pacman.getPosX()][pacman.getPosY() + 1] == DOT
                        || grid[pacman.getPosX()][pacman.getPosY() + 1] == 0)) {
                    if (grid[pacman.getPosX()][pacman.getPosY() + 1] == DOT) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    grid[pacman.getPosX()][pacman.getPosY()] = 0;
                    auxGrid[pacman.getPosX()][pacman.getPosY()] = grid[pacman.getPosX()][pacman.getPosY()];
                    pacman.setPosY(pacman.getPosY() + 1);
                    grid[pacman.getPosX()][pacman.getPosY()] = 2;
                    insertBoard();

                }
                if (left == 1 && (grid[pacman.getPosX() - 1][pacman.getPosY()] == DOT
                        || grid[pacman.getPosX() - 1][pacman.getPosY()] == 0)) {
                    if (grid[pacman.getPosX() - 1][pacman.getPosY()] == DOT) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    grid[pacman.getPosX()][pacman.getPosY()] = 0;
                    auxGrid[pacman.getPosX()][pacman.getPosY()] = grid[pacman.getPosX()][pacman.getPosY()];
                    pacman.setPosX(pacman.getPosX() - 1);
                    grid[pacman.getPosX()][pacman.getPosY()] = 2;
                    insertBoard();
                }
                if (right == 1 && (grid[pacman.getPosX() + 1][pacman.getPosY()] == DOT
                        || grid[pacman.getPosX() + 1][pacman.getPosY()] == 0)) {
                    if (grid[pacman.getPosX() + 1][pacman.getPosY()] == DOT) {
                        point += incre;
                        records.setText("points: " + point);
                    }
                    grid[pacman.getPosX()][pacman.getPosY()] = 0;
                    auxGrid[pacman.getPosX()][pacman.getPosY()] = grid[pacman.getPosX()][pacman.getPosY()];
                    pacman.setPosX(pacman.getPosX() + 1);
                    grid[pacman.getPosX()][pacman.getPosY()] = 2;
                    insertBoard();
                }
                if (grid[pacman.getPosX() + 1][pacman.getPosY()] == Ghost.GHOSTP
                        || grid[pacman.getPosX() - 1][pacman.getPosY()] == Ghost.GHOSTP
                        || grid[pacman.getPosX()][pacman.getPosY() + 1] == Ghost.GHOSTP
                        || grid[pacman.getPosX()][pacman.getPosY() - 1] == Ghost.GHOSTP) {
                    stopGhostGroup();
                    JOptionPane.showMessageDialog(window, "DEAD, YOU LOSE!");
                    gamePanel.setVisible(false);
                    panelMenu.setVisible(true);
                    timer.stop();
                }
                int enc = 0;
                for (int indI = 0; indI < grid.length; indI++) {
                    for (int indJ = 0; indJ < grid.length; indJ++) {
                        if (grid[indI][indJ] == DOT) {
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
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (grid[pacman.getPosX()][pacman.getPosY() - 1] == DOT
                            || grid[pacman.getPosX()][pacman.getPosY() - 1] == 0) {
                        up = 1;
                        down = 0;
                        left = 0;
                        right = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (grid[pacman.getPosX()][pacman.getPosY() + 1] == DOT
                            || grid[pacman.getPosX()][pacman.getPosY() + 1] == 0) {
                        up = 0;
                        down = 1;
                        left = 0;
                        right = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (grid[pacman.getPosX() - 1][pacman.getPosY()] == DOT
                            || grid[pacman.getPosX() - 1][pacman.getPosY()] == 0) {
                        up = 0;
                        down = 0;
                        left = 1;
                        right = 0;
                    }

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (grid[pacman.getPosX() + 1][pacman.getPosY()] == DOT
                            || grid[pacman.getPosX() + 1][pacman.getPosY()] == 0) {
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

    public void moveGhostGroup() {
        ghost1.move(this);
        ghost2.move(this);
        ghost3.move(this);
    }

    public void stopGhostGroup() {
        ghost1.stopTimer();
        ghost2.stopTimer();
        ghost3.stopTimer();
    }

    public int[][] defectTable() {
        int[][] aux = {
                {wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall },
                {wall, DOT, DOT, DOT, DOT, DOT, DOT, wall, DOT, DOT, DOT, DOT, DOT, DOT, wall },
                {wall, DOT, wall, wall, DOT, wall, DOT, wall, DOT, wall, wall, DOT, wall, DOT, wall },
                {wall, DOT, wall, DOT, DOT, wall, DOT, wall, DOT, wall, wall, DOT, wall, DOT, wall },
                {wall, DOT, DOT, DOT, wall, wall, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, wall },
                {wall, DOT, wall, DOT, DOT, DOT, DOT, DOT, wall, wall, wall, DOT, wall, wall, wall },
                {wall, DOT, wall, wall, DOT, wall, wall, DOT, DOT, wall, wall, DOT, DOT, DOT, wall },
                {wall, DOT, DOT, DOT, DOT, DOT, wall, wall, DOT, DOT, DOT, DOT, wall, DOT, wall },
                {wall, wall, wall, DOT, wall, DOT, wall, wall, wall, DOT, wall, DOT, wall, DOT, wall },
                {wall, DOT, DOT, DOT, wall, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, wall },
                {wall, DOT, wall, DOT, DOT, DOT, wall, wall, wall, DOT, wall, DOT, wall, DOT, wall },
                {wall, DOT, DOT, DOT, wall, DOT, wall, DOT, DOT, DOT, DOT, DOT, wall, DOT, wall },
                {wall, DOT, wall, DOT, wall, DOT, wall, DOT, wall, DOT, wall, DOT, DOT, DOT, wall },
                {wall, DOT, DOT, DOT, wall, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, wall },
                {wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall, wall }
        };
        return aux;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] newGrid) {
        this.grid = newGrid;
    }

    public int[][] getAuxGrid() {
        return auxGrid;
    }

    public void setAuxGrid(int[][] newGrid) {
        this.auxGrid = newGrid;
    }

    public Pacman getPacman() {
        return pacman;
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
