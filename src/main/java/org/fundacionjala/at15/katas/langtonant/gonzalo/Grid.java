package org.fundacionjala.at15.katas.langtonant.gonzalo;

public class Grid {
    private int wide;
    private int high;
    private char[][] grid;
    public Grid(int wide, int high) {
        this.wide = wide;
        this.high = high;
        grid = new char[wide][high];
    }
    public void loadGrid() {
        for (int column = 0; column < high; column++) {
            for (int file = 0; file < wide; file++) {
                grid[column][file] = 'X';
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
        if (grid[posX][posY] == 'X') {
            grid[posX][posY] = ' ';
        } else if (grid[posX][posY] == ' ') {
            grid[posX][posY] = 'X';
        }
    }
}