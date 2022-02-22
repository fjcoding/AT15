package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BlockTest {

    @Test
    public void itShouldHaveLifes() {
        int life = 3;
        Block asteroid = new Block(life);

        assertEquals(3, asteroid.getLife());
    }

    @Test
    public void itShouldChangeLifes() {
        int life = 3;
        Block asteroid = new Block(life);
        life--;
        asteroid.setLife(life);
        assertEquals(life, asteroid.getLife());
    }
}
