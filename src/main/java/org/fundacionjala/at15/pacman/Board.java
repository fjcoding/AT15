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
    private int[][] board; // 0 = empty, 1 = wall, 2 = pacman, 3 = ghost, 4 = dot
    private JLabel[][] matriz ;
    Pacman pacman;
    Ghost ghost;
    Play play;
    int up=0, down=0, left=0, right=0;
    Timer timer;
    int point = 0;

    public Board() {
        board = new int[15][15];
        matriz = new JLabel[15][15];
        pacman = new Pacman();
        ghost = new Ghost();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                matriz[i][j] = new JLabel();
            }
        }

        board = defectTable();
        board[pacman.getPosX()][pacman.getPosY()] = 2;
        board[ghost.getPosX()][ghost.getPosY()] = 3;
    }


    public void insertBoard(JPanel gamePanel) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                matriz[i][j].setIcon(new ImageIcon("src/main/java/org/fundacionjala/at15/pacman/images/"+board[i][j]+".png"));
                matriz[i][j].setBounds(120+(i*30), 120+(j*30), 30, 30);
                matriz[i][j].setVisible(true);
                gamePanel.add(matriz[i][j],0);
            }
        }
    }

    public void moverPacman(Window window, JPanel gamePanel, JPanel menuPanel, JLabel records){
        timer = new Timer (200, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (up == 1 && (board[pacman.getPosX()][pacman.getPosY()-1]==4 || board[pacman.getPosX()][pacman.getPosY()-1]==0)) {
                    if (board[pacman.getPosX()][pacman.getPosY()-1]==4) {

                        point+=5;
                        records.setText("points: "+point);
                    }
                    board[pacman.getPosX()][pacman.getPosY()]=0;

                    pacman.setPosY(pacman.getPosY()-1);
                    board[pacman.getPosX()][pacman.getPosY()]=2;
                    insertBoard(gamePanel);

                }
                if (down == 1 && (board[pacman.getPosX()][pacman.getPosY()+1]==4 || board[pacman.getPosX()][pacman.getPosY()+1]==0)) {
                    if (board[pacman.getPosX()][pacman.getPosY()+1]==4) {
                        point+=5;
                        records.setText("points: "+point);
                    }
                    board[pacman.getPosX()][pacman.getPosY()]=0;


                    pacman.setPosY(pacman.getPosY()+1);
                    board[pacman.getPosX()][pacman.getPosY()]=2;
                    insertBoard(gamePanel);

                }
                if (left == 1 && (board[pacman.getPosX()-1][pacman.getPosY()]==4 || board[pacman.getPosX()-1][pacman.getPosY()]==0)) {
                    if (board[pacman.getPosX()-1][pacman.getPosY()]==4) {
                        point+=5;
                        records.setText("points: "+point);
                    }
                    board[pacman.getPosX()][pacman.getPosY()]=0;

                    pacman.setPosX(pacman.getPosX()-1);
                    board[pacman.getPosX()][pacman.getPosY()]=2;
                    insertBoard(gamePanel);

                }
                if (right == 1 && (board[pacman.getPosX()+1][pacman.getPosY()]==4 || board[pacman.getPosX()+1][pacman.getPosY()]==0)) {
                    if (board[pacman.getPosX()+1][pacman.getPosY()]==4) {
                        point+=5;
                        records.setText("points: "+point);
                    }
                    board[pacman.getPosX()][pacman.getPosY()]=0;

                    pacman.setPosX(pacman.getPosX()+1);
                    board[pacman.getPosX()][pacman.getPosY()]=2;
                    insertBoard(gamePanel);

                }
                int enc = 0;
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (board[i][j] == 4) {
                            enc=1;
                        }
                    }
                }
                if (enc == 0) {
                    JOptionPane.showMessageDialog(window.getWindow(), "YOU WIN!!!!");
                    gamePanel.setVisible(false);
                    menuPanel.setVisible(true);
                    timer.stop();
                }
            }
        });
        timer.start();


        window.getWindow().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println(" up");
                    if (board[pacman.getPosX()][pacman.getPosY()-1]==4 || board[pacman.getPosX()][pacman.getPosY()-1]==0) {
                        up = 1;
                        down = 0;
                        left=0;
                        right=0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    System.out.println(" down");
                    if (board[pacman.getPosX()][pacman.getPosY()+1]==4 || board[pacman.getPosX()][pacman.getPosY()+1]==0) {
                        up = 0;
                        down = 1;
                        left=0;
                        right=0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.out.println(" left");
                    if (board[pacman.getPosX()-1][pacman.getPosY()]==4|| board[pacman.getPosX()-1][pacman.getPosY()]==0) {
                        up = 0;
                        down = 0;
                        left=1;
                        right=0;
                    }

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println(" right");
                    if (board[pacman.getPosX()+1][pacman.getPosY()]==4 || board[pacman.getPosX()+1][pacman.getPosY()]==0) {
                        up = 0;
                        down = 0;
                        left=0;
                        right=1;
                    }


                }
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }



    public int[][] defectTable(){
        int aux[][]={
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                    };
        return aux;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

}
