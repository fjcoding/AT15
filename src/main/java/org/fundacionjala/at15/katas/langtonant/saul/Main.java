package org.fundacionjala.at15.katas.langtonant.saul;

public class Main {
    public static void main(String[] args) {
        final int rows = 8;
        final int columns = 8;
        final int steps = 5;
        Grid grid = new Grid(rows, columns);
        Ant ant = new Ant(2, 2, grid, "up");

        ant.game(steps);
    }
}