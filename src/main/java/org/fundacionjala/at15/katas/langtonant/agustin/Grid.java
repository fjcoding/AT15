package org.fundacionjala.at15.katas.langtonant.agustin;

public class Grid {

    // variables
    boolean [][] grid; // bi-dimensional boolean array. ! Non initialized boolean (primitive) value is false !
    int height;
    int width;

    // constructor
    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
        grid = new boolean[height][width];
    }

    // Methods

    // getters

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isWhite(int h, int w) {
        return grid[h][w];
    }

    // setters

    protected void setWhite(int h, int w) {
        if (h < height && w < width) grid[h][w] = true;
    }

    protected void setBlack(int h, int w) {
        if (h < height && w < width) grid[h][w] = true;
    }

    public void printGrid() {
        for (int h = 0; h < height-1; h++) {
            for (int w = 0; w < width-1; w++) {
                if (isWhite(h,w)) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[x]");
                }
            }
            System.out.println(); // Line Break
        }
    }

}
