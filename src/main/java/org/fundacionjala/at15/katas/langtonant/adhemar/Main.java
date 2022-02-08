package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Main {
    public static void main(String[] args) {
        //Inputs
        //Grid's size
        int rows = 4;
        int columns = 4;

        int[] initialPosition = {3, 1};
        int steps = 1;

        //Create a grid
        boolean color = false; //false: white, true: black
        Grid grid = new Grid(rows, columns, color);
        grid.printGrid();

        //Move the ant
        Ant ant = new Ant(initialPosition[0], initialPosition[1]);
        ant.start(steps, grid);

        //Show grid status
        grid.printGrid();
    }
}