package org.fundacionjala.at15.katas.langtonant.mauricio;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(5, 5); // We define size of the array
        Ant ant = new Ant(2, 2, grid, "up"); // We give the initial position of the ant and the direction
        ant.game(10); // We give the number of steps that de ant will have
    }
}