package org.fundacionjala.at15.katas.langtonant.diana;

public class Main {

    public static void main(String[] args) {
        System.out.println("FROM DIANA: This is Langton's Ant main class, you can do yout implementation here :)");

        Grid grid = new Grid(10, 15); // array size definition
        Ant ant = new Ant(2, 2, grid, "up"); // define position and direction of the ant
        ant.game(1); // number of steps
        System.out.println(grid.getRows());
        System.out.println(grid.getColumns());
    }
}