package org.fundacionjala.at15.pacman;

import java.util.Random;
import java.util.Scanner;

public class Game extends CommonFeatures {

    private Board board;
    private Pacman pacman;
    private Ghost ghost1;
    private Ghost ghost2;
    private int score;

    public Game() {
        this.board = new Board();
        this.pacman = new Pacman(startPositionPacmanX, startPositionPacmanY);
        this.ghost1 = new Ghost(startPositionGhostX, startPositionGhostY);
        this.ghost2 = new Ghost(startPositionGhostX2, startPositionGhostY2);
        this.score = 0;

    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }

    public String[] getDirection() {
        return DIRECTION;
    }

    public void restartAfterDie() {
        pacman.setY(startPositionPacmanY);
        pacman.setX(startPositionPacmanX);
        ghost1.setX(startPositionGhostX);
        ghost1.setY(startPositionGhostY);
        ghost2.setX(startPositionGhostX2);
        ghost2.setY(startPositionGhostY2);
    }

    public void pacmanInFrontDot() {
        if (this.board.isDot(transitionX, transitionY)) {
            pacman.setX(transitionX);
            pacman.setY(transitionY);
            // board.setPacmanX(pacman.getX());
            // board.setPacmanY(pacman.getY());
        }
    }

    public void pacmanInFrontPellet() {
        if (this.board.isPellet(transitionX, transitionY)) {
            this.score += dotScore;
            this.board.setDot(transitionX, transitionY);
            pacman.setX(transitionX);
            pacman.setY(transitionY);
        }
    }

    public void pacmanInFrontGhost() {
        if (this.board.isGhost(transitionX, transitionY)) {// to board or game
            int currentPacmanLives = pacman.getLives() - 1;
            if (currentPacmanLives == 0) {
                pacman.setIsDead(true);
            }
            pacman.setLives(currentPacmanLives);
            restartAfterDie();
        }
    }

    public void ghostInFrontPacman() {
        if (this.board.isPacman(transitionX, transitionY)) {
            int currentPacmanLives = pacman.getLives() - 1;
            if (currentPacmanLives == 0) {
                pacman.setIsDead(true);
            }
            pacman.setLives(currentPacmanLives);
            restartAfterDie();
        }
    }

    public void ghostInFrontDot(Ghost newGhost) {
        if (this.board.isDot(transitionX, transitionY)) {
            newGhost.setX(transitionX);
            newGhost.setY(transitionY);
            this.board.setDot(transitionX, transitionY);
        }
    }

    public void ghostInFrontPellet(Ghost newGhost) {
        if (this.board.isPellet(transitionX, transitionY)) {
            this.board.setPellet(transitionX, transitionY);
            newGhost.setX(transitionX);
            newGhost.setY(transitionY);
        }
    }

    public void start(Scanner scanner) {
        while (true) {
            this.board.printBoard();
            transitionX = pacman.getX();
            transitionY = pacman.getY();
            this.pacman.move(scanner.nextLine());
            pacmanInFrontDot();
            pacmanInFrontPellet();
            pacmanInFrontGhost();
            board.setPacmanX(pacman.getX());
            board.setPacmanY(pacman.getY());
            transitionX = ghost1.getX();
            transitionY = ghost1.getY();
            this.ghost1.move(DIRECTION[new Random().nextInt(DIRECTION.length)]);
            ghostInFrontPacman();
            ghostInFrontDot(ghost1);
            ghostInFrontPellet(ghost1);
            board.setGhostX(ghost1.getX());
            board.setGhostY(ghost1.getY());
            transitionX = ghost2.getX();
            transitionY = ghost2.getY();
            this.ghost2.move(DIRECTION[new Random().nextInt(DIRECTION.length)]);
            ghostInFrontPacman();
            ghostInFrontDot(ghost2);
            ghostInFrontPellet(ghost2);
            board.setGhostX2(ghost2.getX());
            board.setGhostY2(ghost2.getY());
            System.out.println("Score: " + this.score);

            if (this.pacman.isDead()) {
                System.out.println("Game Over");
                System.out.println("Score: " + this.score);
                break;
            } else if (score == ((board.getBoard().length - 2) * (board.getBoard()[0].length - 2) - 1)
                    * DEFAULT_CONSTANT) {
                System.out.println("Next Level");
                System.out.println("Score: " + this.score);
                System.out.println("Level: " + board.getLevel());
                setScore(0);
                board.restart();
            }
        }
    }
}