package org.fundacionjala.at15.katas.langtonant.alvaro;


public class Main {
    
    public static void main(String[] args) {
        //System.out.println("Saul here.... This is Langton's Ant main class, you can do yout implementation here :)");

        Grid grid = new Grid(8, 8);
        Ant ant = new Ant(2, 2, grid, "up");

        //grid.printGrid();
        ant.game(5);

        //System.out.println(grid.getRows());
        //System.out.println(grid.getColumns());
    }


}