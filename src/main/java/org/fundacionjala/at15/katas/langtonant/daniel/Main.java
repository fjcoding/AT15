package org.fundacionjala.at15.katas.langtonant.daniel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the size rows and columns");
        Scanner read = new Scanner(System.in);
        int rows = read.nextInt();
        int colums = read.nextInt();
        Grid grid = new Grid(rows, colums);
        Ant ant = new Ant(2, 2, grid, "up");
        final int steps = 3;
        ant.game(steps);
    }
}