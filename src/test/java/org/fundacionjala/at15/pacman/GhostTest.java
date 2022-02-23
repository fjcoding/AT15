package org.fundacionjala.at15.pacman;


import static org.junit.Assert.*;
import org.junit.Test;

public class GhostTest {

    Ghost ghost = new Ghost(4,4);

    @Test
    public void itShouldSetXY(){
        int expectedX = 5;
        int expectedY = 3;
        int newX = 5;
        int newY = 3;
        ghost.setX(newX);
        ghost.setY(newY);
        assertEquals(expectedX, ghost.getX());
        assertEquals(expectedY, ghost.getY());
    }
}


