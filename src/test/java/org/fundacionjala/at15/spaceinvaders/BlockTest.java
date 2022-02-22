package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BlockTest {

    @Test
    public void itShouldHaveLifes() {
        int life = 3;
        Block asteroid = new Block(life);
        assertEquals(life, asteroid.getLife());
    }
}
