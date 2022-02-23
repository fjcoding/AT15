package org.fundacionjala.at15.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class PacmanTest {
    Pacman pacman = new Pacman(1,1);

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
    public void itShouldHaveLife(){
        int expectedResult = 3;

        assertEquals(expectedResult, pacman.getLives());
    }

    @Test
    public void itShouldSetLife(){
        int expectedResult = 1;
        pacman.setLives(1);

        assertEquals(expectedResult, pacman.getLives());
    }
}
