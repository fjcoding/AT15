package org.fundacionjala.at15.pacman;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InsertBoard {
    private final int boardPos = 120;
    private final int boardHeight = 30;
    
    public void insertBoard(JPanel gamePanel) {
        Board board = new Board();
        int bor[][];
        bor = board.getBoard();
        JLabel[][] matriz;
        matriz = board.getMatriz();
        String aux = ".png";
        int auxUp = board.getUp();
        int auxDown = board.getDown();
        int auxLeft = board.getLeft();
        int auxRight = board.getRight();
        for (int indI = 0; indI < bor.length; indI++) {
            for (int indJ = 0; indJ < bor.length; indJ++) {
                if (bor[indI][indJ] == 2) {
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
                                "src/main/java/org/fundacionjala/at15/pacman/images/" + bor[indI][indJ] + aux));

                matriz[indI][indJ].setBounds(boardPos + (indI * boardHeight), boardPos + (indJ * boardHeight),
                        boardHeight, boardHeight);
                matriz[indI][indJ].setVisible(true);
                gamePanel.add(matriz[indI][indJ], 0);
                aux = ".png";
            }
        }
    }
    
}
