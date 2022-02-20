package org.fundacionjala.at15.pacman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int limitRandom = 5;
        Scanner scanner = new Scanner(System.in);

        Grid grid = new Grid();
        String[][] matriz = grid.crearGrid();
        grid.print(matriz);

        int entrada = -1;
        while (entrada != 0) {
            System.out.println("-------------------------------");
            System.out.println("Mueva a pacman 1: arriba, 2: abajo, 3: izquierda, 4: derecha");
            entrada = Integer.parseInt(scanner.nextLine());
            int random =   (int) Math.floor(Math.random() * (limitRandom - 1) + 1);
            matriz = grid.movimientoPacman(entrada, matriz, random);
            grid.print(matriz);
        }
    }
}
