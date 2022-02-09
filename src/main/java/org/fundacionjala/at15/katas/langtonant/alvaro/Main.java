package org.fundacionjala.at15.katas.langtonant.alvaro;


public class Main {
    public static void main(String[] args) {
        final int height = 6;
        final int width = 6;
        final int numberRuns = 3;
        Grid grid = new Grid(height, width);
        Ant ant = new Ant(2, 2, grid, 'u');
        ant.run(numberRuns);
    }
}