package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvaderTest {
    @Test
    public void itShouldHaveAPosition() {
        float posX = 20;
        float posY = 20;
        
        Invader theInvader = new Invader(posX, posY);

        assertEquals(posX, theInvader.getPosX(), 0);
        assertEquals(posY, theInvader.getPosY(), 0);
    }
}
