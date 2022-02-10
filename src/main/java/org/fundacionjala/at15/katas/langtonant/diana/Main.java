package org.fundacionjala.at15.katas.langtonant.diana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("WELCOME TO THE LANTONAN GAME!");
        System.out.println("Crear tamaño del tablero");

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numero de filas:");
        int userRows = read.nextInt();
        System.out.println("Ingrese numero de columnas:");
        int userColumns = read.nextInt();
        System.out.println("Ingrese numero de pasos que dara la hormiga:");
        int userSteps = read.nextInt();
        System.out.println("Ingrese posicion de fila para la hormiga:");
        int userPositionRows = read.nextInt();
        System.out.println("Ingrese posicion de columna para la hormiga:");
        int userPositionColumns = read.nextInt();

        Grid matrix = new Grid(userRows, userColumns);
        Ant ant = new Ant(userPositionRows - 1, userPositionColumns - 1, matrix, "up");
        ant.run(userSteps);
    }
}