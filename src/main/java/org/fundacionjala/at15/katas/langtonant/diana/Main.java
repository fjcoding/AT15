package org.fundacionjala.at15.katas.langtonant.diana;

public class Main {

    public static void main(String[] args) {
        System.out.println("FROM DIANA: This is Langton's Ant main class, you can do yout implementation here :)");

        Grid grid = new Grid(5, 10); // definicion tamaño de matriz
        Ant ant = new Ant(3, 2, grid, "up"); // posicion y direccion de la hormiga
        ant.game(3); // numero de saltos de la hormiga
        System.out.println(grid.getRows());
        System.out.println(grid.getColumns());
    }
}