package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Main {
    public static void main(String[] args) {
        //Inputs
        //Grid's size
        int rows = 11;
        int columns = 11;

        int[] initialPosition = {5, 5};
        int steps = 100;

        //Create a grid
        boolean color = false; //false: white, true: black
        Grid grid = new Grid(rows, columns, color);

        //Move the ant
        Ant ant = new Ant(initialPosition[0], initialPosition[1]);
        ant.start(steps, grid);

        //Show grid status
        grid.printGrid();
    }
}