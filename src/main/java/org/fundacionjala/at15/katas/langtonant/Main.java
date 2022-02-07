package org.fundacionjala.at15.katas.langtonant;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is Langton's Ant main class, you can do yout implementation here :)");

        // TODO: Create Grid Class instance
        Grid grid = new Grid(5,5);
        // TODO: Create Ant Class instance

        Ant ant = new Ant(2,2,"NORTH",grid);
        ant.run();

        // print in console the state of the grid
        grid.printGrid();

    }
}