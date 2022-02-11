package org.fundacionjala.at15.katas.daniel.langtonant;

public class Main {

    public static void main(String[] args) {

        Grid grid = new Grid(6, 6);
        Ant ant = new Ant(2, 2, grid, "up");

        // grid.printGrid();
        ant.game(3);
    }
}