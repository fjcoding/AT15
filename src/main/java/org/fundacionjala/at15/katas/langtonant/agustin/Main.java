package org.fundacionjala.at15.katas.langtonant.agustin;

public class Main {

    static final int SIZEOFGRID = 5;
    static final int STEPS = 5;

    public static void main(String[] args) {

        Grid grid = new Grid(SIZEOFGRID, SIZEOFGRID);

        Ant ant = new Ant(2, 2, "NORTH", grid, STEPS);
        ant.run();

        // print in console the state of the grid
        System.out.println("Final State: ");
        grid.printGrid();

    }
}