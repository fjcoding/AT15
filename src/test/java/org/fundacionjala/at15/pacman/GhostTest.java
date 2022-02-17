package org.fundacionjala.at15.pacman;


import static org.junit.Assert.*;
import org.junit.Test;
public class GhostTest {

    @Test
    public void itShouldChangePosition(){

        int xPos = 4;
        int yPos = 4;
        Ghost ghost = new Ghost(xPos, yPos);

        ghost.movementUp();
        int yPos1 = 3;
        assertEquals(yPos1, ghost.getYPos());

        ghost.movementDown();
        int yPos2 = 4;
        assertEquals(yPos2, ghost.getYPos());

        ghost.movementRight();
        int xPos1 = 5;
        assertEquals(xPos1, ghost.getXPos());

        ghost.movementLeft();
        int xPos2 = 4;
        assertEquals(xPos2, ghost.getYPos());











    }



}
