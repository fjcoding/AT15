package org.fundacionjala.at15.pacman;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static final int DEFAULT_CONSTANT = 10;

    private Pacman pacman;
    private Ghost ghost;
    private Ghost2 ghost2;
    private Board board;
    private int score;
    private static final String[] DIRECTION = new String[] {"w", "a", "s", "d" };
    private static final int NUMBER_10 = 10;

    public Game() {
        this.board = new Board();
        this.pacman = new Pacman(board);
        this.ghost = new Ghost(board);
        this.ghost2 = new Ghost2(board);
        this.score = 0;

    }

    public void start(Scanner scanner) {
        while (true) {
            this.board.printBoard();
            this.pacman.move(scanner.nextLine());
            this.ghost.move(DIRECTION[new Random().nextInt(DIRECTION.length)]);
            this.ghost2.move(DIRECTION[new Random().nextInt(DIRECTION.length)]);
            this.score += this.board.getScore();

            if (this.pacman.isDead()) {
                System.out.println("Game Over");
                System.out.println("Score: " + this.score);
                break;
            } else if (pacman.getScore() == ((board.getBoard().length - 2) * (board.getBoard()[0].length - 2) - 1)
                    * NUMBER_10) {
                System.out.println("Next Level");
                System.out.println("Score: " + this.score);
                System.out.println("Level: " + board.getLevel());
                board.restart();
            }
        }
    }
}