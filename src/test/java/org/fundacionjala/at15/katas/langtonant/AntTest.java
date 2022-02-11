package org.fundacionjala.at15.katas.langtonant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AntTest {

    @Test
    public void itShouldHaveADirectionAndASquareColor() {
        Ant theAnt = new Ant(Ant.Direction.WEST, SquareColor.WHITE);

        assertEquals(Ant.Direction.WEST, theAnt.getDirection());
        assertEquals(SquareColor.WHITE, theAnt.getSquareColor());
    }
}
