package org.fundacionjala.at15.katas.langtonant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AntTest {

    @Test
    public void itShouldHaveADirectionAndASquareColor() {
        Ant theAnt = new Ant(Direction.WEST, SquareColor.WHITE);

        assertEquals(Direction.WEST, theAnt.getDirection());
        assertEquals(SquareColor.WHITE, theAnt.getSquareColor());
    }

    @Test
    public void itShouldTurnDirectionRightWhenSquareColorIsWhite() {
        Ant theAnt = new Ant(Direction.WEST, SquareColor.WHITE);

        theAnt.turnDirection();
        assertEquals(Direction.NORTH, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Direction.EAST, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Direction.SOUTH, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Direction.WEST, theAnt.getDirection());
    }

    @Test
    public void itShouldTurnDirectionLeftWhenSquareColorIsBlack() {
        Ant theAnt = new Ant(Direction.WEST, SquareColor.BLACK);

        theAnt.turnDirection();
        assertEquals(Direction.SOUTH, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Direction.EAST, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Direction.NORTH, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Direction.WEST, theAnt.getDirection());
    }
}
