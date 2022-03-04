package org.fundacionjala.at15.katas.langtonant.agustin;

public class Grid {

    // variables
    private final boolean[][] grid; // bi-dimensional boolean array. ! Non initialized boolean (primitive) value is false !
    private final int height;
    private final int width;

    // constructor
    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
        grid = new boolean[height][width];
    }

    // getters

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isWhite(int heightParam, int widthParam) {
        return grid[heightParam][widthParam];
    }

    // setters

    protected void setWhite(int hei, int wid) {
        if (hei < height && wid < width) {
            grid[hei][wid] = true;
        }
    }

    protected void setBlack(int hei, int wid) {
        if (hei < height && wid < width) {
            grid[hei][wid] = true;
        }
    }

    public void printGrid() {
        for (int hei = 0; hei < height - 1; hei++) {
            for (int wid = 0; wid < width - 1; wid++) {
                if (isWhite(hei, wid)) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[x]");
                }
            }
            System.out.println(); // Line Break
        }
    }

}
