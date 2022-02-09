package org.fundacionjala.at15.katas.langtonant.saul;

//import org.fundacionjala.at15.katas.langtonant.saul.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Saul here.... This is Langton's Ant main class, you can do yout implementation here :)");
        final int rows = 8;
        final int columns = 8;
        final int steps = 5;
        Grid grid = new Grid(rows, columns);
        Ant ant = new Ant(2, 2, grid, "up");

        //grid.printGrid();
        ant.game(steps);

        //System.out.println(grid.getRows());
        //System.out.println(grid.getColumns());
    }


}