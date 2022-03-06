package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import javax.swing.JPanel;
import org.junit.Test;

public class BoardTest {
    @Test
    public void itShouldHaveAInitializedBoard() {
        Panel gamePanel = new Panel();
        Board board = new Board(gamePanel);
        int[][] sample = {
                                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                                {1, 2, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 1},
                                {1, 4, 1, 1, 4, 1, 4, 1, 4, 1, 1, 4, 1, 4, 1},
                                {1, 4, 1, 4, 4, 1, 4, 1, 4, 1, 1, 4, 1, 4, 1},
                                {1, 4, 4, 4, 1, 1, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                                {1, 4, 1, 4, 4, 4, 4, 4, 1, 1, 1, 4, 1, 1, 1},
                                {1, 4, 1, 1, 4, 1, 1, 4, 4, 1, 1, 4, 4, 4, 1},
                                {1, 4, 4, 4, 4, 4, 1, 1, 4, 4, 4, 4, 1, 4, 1},
                                {1, 1, 1, 4, 1, 4, 1, 1, 1, 4, 1, 4, 1, 4, 1},
                                {1, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                                {1, 4, 1, 4, 4, 4, 1, 1, 1, 4, 1, 4, 1, 4, 1},
                                {1, 4, 4, 4, 1, 4, 1, 4, 4, 4, 4, 4, 1, 4, 1},
                                {1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 4, 4, 1},
                                {1, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
                        };
        assertArrayEquals(sample, board.getBoard());
    }

    @Test
    public void itShouldHaveADefectTable() {
        Panel gamePanel = new Panel();
        Board board = new Board(gamePanel);
        int[][] expected = {
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                            {1, 4, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 1, 1, 4, 1, 4, 1, 4, 1, 1, 4, 1, 4, 1},
                            {1, 4, 1, 4, 4, 1, 4, 1, 4, 1, 1, 4, 1, 4, 1},
                            {1, 4, 4, 4, 1, 1, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 1, 4, 4, 4, 4, 4, 1, 1, 1, 4, 1, 1, 1},
                            {1, 4, 1, 1, 4, 1, 1, 4, 4, 1, 1, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 1, 1, 4, 4, 4, 4, 1, 4, 1},
                            {1, 1, 1, 4, 1, 4, 1, 1, 1, 4, 1, 4, 1, 4, 1},
                            {1, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 1, 4, 4, 4, 1, 1, 1, 4, 1, 4, 1, 4, 1},
                            {1, 4, 4, 4, 1, 4, 1, 4, 4, 4, 4, 4, 1, 4, 1},
                            {1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 4, 4, 1},
                            {1, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
                        };
        assertArrayEquals(expected, board.defectTable());
    }

    @Test
    public void itShouldHaveABoard() {
        Panel gamePanel = new Panel();
        Board board = new Board(gamePanel);
        Play play = new Play();
        Window window = new Window("PACMAN");
        String player = "player";
        JPanel panel = new JPanel();
        int wall = 1;
        int dot = 4;

        play.runGame(window, player, panel);

        for (int i = 0; i < board.getBoard().length; i++) {
            assertEquals(wall, board.getBoard()[0][i]);
            assertEquals(wall, board.getBoard()[board.getBoard()[0].length-1][i]);
        }
        assertEquals(dot, board.getBoard()[5][5]);
    }

    @Test
    public void itShouldHaveAPacman() {
        Panel gamePanel = new Panel();
        Board board = new Board(gamePanel);
        Play play = new Play();
        Window window = new Window("PACMAN");
        String player = "player";
        JPanel panel = new JPanel();
        int PACMAN = 2;

        play.runGame(window, player, panel);
        int x = board.getPacman().getPosX();
        int y = board.getPacman().getPosY();
        assertEquals(PACMAN, board.getBoard()[x][y]);
    }

    @Test
    public void itShouldListenKeyEvent() {

        Play play = new Play();
        Window window = new Window("PACMAN");
        String player = "player";
        JPanel panel = new JPanel();

        play.runGame(window, player, panel);
    }

    @Test
    public void itShouldMoveGhost() {
        Panel gamePanel = new Panel();
        Board board = new Board(gamePanel);
        Window window = new Window("PACMAN");
        gamePanel.setLayout(null);
        gamePanel.setBounds(0, 0, window.getWidth(), window.getHeight());

        int posX = 13;
        int posY = 13;
        Ghost ghost = new Ghost(posX, posY);

        ghost.setDirection(1);
        board.ghostMove(ghost);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());

        ghost.setDirection(2);
        board.ghostMove(ghost);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());

        ghost.setDirection(3);
        board.ghostMove(ghost);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());

        ghost.setDirection(4);
        board.ghostMove(ghost);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());

        board.ghostMove(ghost);
        board.ghostMove(ghost);
        board.ghostMove(ghost);
        board.ghostMove(ghost);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());
    }
}
