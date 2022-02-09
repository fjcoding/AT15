package org.fundacionjala.at15.katas.langtonant.adrian;

public class Board {
    private int width;
    private int height;
    private int[][] tablero;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        tablero = new int[height][width];
        for (int index = 0; index < tablero.length; index++) {
            for (int jndex = 0; jndex < tablero[index].length; jndex++) {
                tablero[index][jndex] = 0;
                //System.out.print(tablero[i][j]+" ");
            }
            //System.out.println();
        }
    }
    public void print() {
        for (int index = 0; index < tablero.length; index++) {
            for (int jndex = 0; jndex < tablero[index].length; jndex++) {
                System.out.print(tablero[index][jndex] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getTablero() {
        return tablero;
    }
    public int getPosTablero(int y, int x) {
        return tablero[y][x];
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    public void setPos0(int y, int x) {
        tablero[y][x] = 0;
    }
    public void setPos1(int y, int x) {
        tablero[y][x] = 1;
    }
}
