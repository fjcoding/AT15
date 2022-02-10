package org.fundacionjala.at15.katas.langtonant.alvaro;

public class Grid {

    private int sizeY;
    private int sizeX;
    private int[][] grid;
    private final int black = 8;
    public Grid(int sizeX, int  sizeY) {
        grid = new int[sizeX][sizeY];
        this.sizeY = sizeY;
        this.sizeX = sizeX;

    }
    public void createGrid() {

        for (int indx = 0; indx < sizeX; indx++) {
            for (int indy = 0; indy < sizeY; indy++) {
                grid[indx][indy] = 0; //create white matrix
            }
        }
    }
    public void printGrid() {
        for (int indx = 0; indx < sizeX; indx++) {
            for (int indy = 0; indy < sizeY; indy++) {
                System.out.print(grid[indx][indy]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public int getPos(int x, int y) {
        return grid[x][y];
    }
    public void changetoWhite(int x, int y) {
        grid[x][y] = 0;
    }
    public void changetoBlack(int x, int y) {
        grid[x][y] = black;
    }

}