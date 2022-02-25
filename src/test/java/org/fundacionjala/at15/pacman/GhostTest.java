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
}
