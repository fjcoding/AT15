package org.fundacionjala.at15.katas.langtonant;

public class Grid {
    // TODO: Make Grid Class with constructor and methods

    // variables
    boolean [] [] grid; // bi-dimensional boolean array. ! Non initialized boolean (primitive) value is false !
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

    public boolean[][] getGrid() {
        return grid;
    }

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

    // https://www.geeksforgeeks.org/public-vs-protected-access-modifier-in-java/ <-- probably the best way
    public void setWhite(int h, int w) {
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
            System.out.println();
        }
    }
}
