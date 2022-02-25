package org.fundacionjala.at15.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class PacmanTest {
    Pacman pacman = new Pacman();

    @Test
    public void itShouldHavePosXY(){
        int expectedPosX = 1;
        int expectedPosY = 1;

        assertEquals(expectedPosX, pacman.getPosX());
        assertEquals(expectedPosY, pacman.getPosY());
    }

    @Test
    public void itShouldSetAPosXY(){
        int newPosX = 8;
        int newPosY = 8;

        pacman.setPosX(newPosX);
        pacman.setPosY(newPosY);
        assertEquals(newPosX, pacman.getPosX());
        assertEquals(newPosY, pacman.getPosY());
    }
}