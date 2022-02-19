package org.fundacionjala.at15.pacman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
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
        }
    }
}
=======
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        game.start(scanner);
        /*
        Board board = new Board();
        Pacman pacman = new Pacman(board);
        board.printBoard();

        Scanner scanner = new Scanner(System.in);
        String direction = scanner.nextLine();
        //System.out.println(direction);

        while (true) {
            pacman.move(direction);
            board.printBoard();
            direction = scanner.nextLine();
        }
        */
    }
}
>>>>>>> d0446edb05367d07c94cce18f9d88b9f64a5ad51
