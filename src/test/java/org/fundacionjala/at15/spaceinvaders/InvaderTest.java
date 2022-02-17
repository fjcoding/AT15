package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvaderTest {
    @Test
    public void itShouldHaveAPosition() {
        int posX = 20;
        int posY = 20;
        
        Invader theInvader = new Invader(posX, posY);

        assertEquals(posX, theInvader.getPosX());
        assertEquals(posY, theInvader.getPosY());
    }
}
