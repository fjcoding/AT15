package org.fundacionjala.at15.pacman;

import java.util.Scanner;

public class Game {
    private Pacman pacman;
    Ghost ghost;
    private Board board;
    private int score;

    public Game() {
        this.board = new Board();
        this.pacman = new Pacman(board);
        this.ghost = new Ghost(board);
        this.score = 0;
    }

    public void start(Scanner scanner) {
        while (true) {
            this.board.printBoard();
            this.pacman.move(scanner.nextLine());
            //this.ghost.move();
            this.score += this.board.getScore();
            //this.board.setScore(0);
            if (this.pacman.isDead()) {
                System.out.println("Game Over");
                System.out.println("Score: " + this.score);
                break;
            }
        }
    }
}