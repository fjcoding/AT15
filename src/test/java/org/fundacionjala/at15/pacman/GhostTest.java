package org.fundacionjala.at15.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class GhostTest {

    Ghost ghost = new Ghost(4,4);

    @Test
    public void itShouldHavePosXY(){
        int expectedX = 4;
        int expectedY = 4;

        assertEquals(expectedX, ghost.getPosX());
        assertEquals(expectedY, ghost.getPosY());
    }

    @Test
    public void itShouldSetPosXY(){
        int newPosX = 9;
        int newPosY = 6;

        ghost.setPosX(newPosX);
        ghost.setPosY(newPosY);
        assertEquals(newPosX, ghost.getPosX());
        assertEquals(newPosY, ghost.getPosY());
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
        ghost.move(board);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());

        ghost.setDirection(2);
        ghost.move(board);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());

        ghost.setDirection(3);
        ghost.move(board);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());

        ghost.setDirection(4);
        ghost.move(board);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());

        ghost.move(board);
        ghost.move(board);
        ghost.move(board);
        ghost.move(board);
        assertEquals(posX, ghost.getPosX());
        assertEquals(posY, ghost.getPosY());
    }
}
