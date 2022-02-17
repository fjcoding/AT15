package org.fundacionjala.at15.pacman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Grid grid = new Grid();
        String[][] matriz = grid.crearGrid();
        grid.print(matriz);

        int entrada = -1;
        while (entrada != 0) {
            System.out.println("-------------------------------");
            System.out.println("Mueva a pacman 1: arriba, 2: abajo, 3: izquierda, 4: derecha");
            entrada = Integer.parseInt(scanner.nextLine());
            matriz = grid.movimientoPacman(entrada, matriz);
            grid.print(matriz);
            grid.pacmanScore(matriz);
        }
    }
}
