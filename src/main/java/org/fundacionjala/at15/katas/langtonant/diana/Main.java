package org.fundacionjala.at15.katas.langtonant.diana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("WELCOME TO THE LANTONAN GAME!");
        System.out.println("Create board size");

        Scanner read = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int userRows = read.nextInt();
        System.out.println("Enter number of columns:");
        int userColumns = read.nextInt();
        System.out.println("Enter the number of steps the ant will take:");
        int userSteps = read.nextInt();
        System.out.println("Enter row position for the ant:");
        int userPositionRows = read.nextInt();
        System.out.println("Enter column position for the ant:");
        int userPositionColumns = read.nextInt();
        read.close();
        Grid matrix = new Grid(userRows, userColumns);
        Ant ant = new Ant(userPositionRows - 1, userPositionColumns - 1, matrix, "up");
        ant.run(userSteps);
    }
}