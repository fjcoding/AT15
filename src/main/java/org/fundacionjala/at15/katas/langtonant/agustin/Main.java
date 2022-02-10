package org.fundacionjala.at15.katas.langtonant.agustin;

public class Main {

    public static void main(String[] args) {

        Grid grid = new Grid(5,5);

        Ant ant = new Ant(2,2,"NORTH",grid,5);
        ant.run();

        // print in console the state of the grid
        System.out.println("Final State: ");
        grid.printGrid();

    }
}