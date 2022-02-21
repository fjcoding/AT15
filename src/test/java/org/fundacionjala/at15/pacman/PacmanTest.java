package org.fundacionjala.at15.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class PacmanTest {
    Board board = new Board();
    Pacman pacman = new Pacman(board);

    @Test
    public void itShouldSetXY(){
        int expectedPosX = 8;
        int expectedPosY = 8;
        int newPosX = 8;
        int newPosY = 8;
        pacman.setX(newPosX);
        pacman.setY(newPosY);
        assertEquals(expectedPosX, pacman.getX());
        assertEquals(expectedPosY, pacman.getY());
    }

    @Test
    public void itShouldChangePositionWithDirection(){
        int xExpectedW = 1;
        int xExpectedS = 2;
        int yExpectedD = 2;
        int yExpectedA = 1;
        pacman.move("w");
        assertEquals(xExpectedW,pacman.getX());
        pacman.move("s");
        assertEquals(xExpectedS,pacman.getX());
        pacman.move("d");
        assertEquals(yExpectedD,pacman.getY());
        pacman.move("a");
        assertEquals(yExpectedA,pacman.getY());
    }

    @Test
    public void itShouldStopIfIsWallUp(){
        board.setPacmanX(1);
        Pacman pacman = new Pacman(board);
        pacman.move("w");
        int xExpectedIsWall = 1;
        assertEquals(xExpectedIsWall,pacman.getX());
    }

    @Test
    public void itShouldStopIfIsWallDown(){
        board.setPacmanX(8);
        Pacman pacman = new Pacman(board);
        pacman.move("s");
        int xExpectedIsWall = 8;
        assertEquals(xExpectedIsWall,pacman.getX());
    }
    @Test
    public void itShouldStopIfIsWallRight(){
        board.setPacmanY(8);
        Pacman pacman = new Pacman(board);
        pacman.move("d");
        int yExpectedIsWall = 8;
        assertEquals(yExpectedIsWall,pacman.getY());
    }

    @Test
    public void itShouldStopIfIsWallLeft(){
        board.setPacmanY(1);
        Pacman pacman = new Pacman(board);
        pacman.move("a");
        int yExpectedIsWall = 1;
        assertEquals(yExpectedIsWall,pacman.getY());
    }

    @Test
    public void itShouldDieGhost(){
        board.setGhostX(2);
        board.setGhostY(1);
        Pacman pacman = new Pacman(board);
        pacman.move("s");
        int lifeDimished = 2;
        assertEquals(lifeDimished,pacman.getLives());
    }
    @Test
    public void itShouldDieGhost2(){
        board.setGhostX2(1);
        board.setGhostY2(2);
        Pacman pacman = new Pacman(board);
        pacman.move("d");
        int lifeDimished = 2;
        assertEquals(lifeDimished,pacman.getLives());
    }
    @Test
    public void itShouldChangeDot(){
        board.setPacmanX(2);
        board.setPacmanY(2);
        Pacman pacman = new Pacman(board);
        pacman.move("s");
        assertFalse(board.isDot(2,2));
    }
    @Test
    public void itShouldChagePellet(){
        board.setPellet(2, 1);
        pacman.move("s");
        assertFalse(board.isPellet(2,1));
    }
}
