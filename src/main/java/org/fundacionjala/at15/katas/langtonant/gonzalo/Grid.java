package org.fundacionjala.at15.katas.langtonant.gonzalo;

public class Grid {
    private int wide;
    private int high;
    private int[][] grid;
    public Grid(int wide, int high) {
        this.wide = wide;
        this.high = high;
        grid = new int[wide][high];
    }
    public void loadGrid() {
        for (int column = 0; column < high; column++) {
            for (int file = 0; file < wide; file++) {
                grid[column][file] = 0;
            }
        }
    }
    public void printGrid() {
        for (int column = 0; column < high; column++) {
            for (int file = 0; file < wide; file++) {
                System.out.print(grid[column][file] + " ");
            }
            System.out.println();
        }
    }
    public int getPosition(int posX, int posY) {
        return grid[posX][posY];
    }
    public void changeValue(int posX, int posY) {
        if (grid[posX][posY] == 0) {
            grid[posX][posY] = 1;
        } else if (grid[posX][posY] == 1) {
            grid[posX][posY] = 0;
        }
    }
}