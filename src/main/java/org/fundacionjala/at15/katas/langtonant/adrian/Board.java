package org.fundacionjala.at15.katas.langtonant.adrian;

public class Board {
    private int width;
    private int height;
    private int[][] grid;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new int[height][width];
        for (int index = 0; index < grid.length; index++) {
            for (int jndex = 0; jndex < grid[index].length; jndex++) {
                grid[index][jndex] = 0;
            }
        }
    }
    public void print() {
        for (int index = 0; index < grid.length; index++) {
            for (int jndex = 0; jndex < grid[index].length; jndex++) {
                System.out.print(grid[index][jndex] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getTablero() {
        return grid;
    }
    public int getPosTablero(int y, int x) {
        return grid[y][x];
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    public void setPos0(int y, int x) {
        grid[y][x] = 0;
    }
    public void setPos1(int y, int x) {
        grid[y][x] = 1;
    }
}
