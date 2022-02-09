package org.fundacionjala.at15.katas.langtonant.mauricio;

public class Main {
    static final int POS_INIX = 2;
    static final int POS_INIY = 2;
    static final int GRID_ROWS = 5;
    static final int GRID_COLUMNS = 5;
    static final int STEPS = 10;

    public static void main(String[] args) {
        Grid grid = new Grid(GRID_ROWS, GRID_COLUMNS);
        grid.fillGrid();
        grid.printGrid();
        Ant ant = new Ant(POS_INIX, POS_INIY, grid, "down");
        ant.game(STEPS); // We give the number of steps that the ant will have
    }
}