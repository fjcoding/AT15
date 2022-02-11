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

    @Test
    public void itShouldTurnDirectionRightWhenSquareColorIsWhite() {
        Ant theAnt = new Ant(Ant.Direction.WEST, SquareColor.WHITE);

        theAnt.turnDirection();
        assertEquals(Ant.Direction.NORTH, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Ant.Direction.EAST, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Ant.Direction.SOUTH, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Ant.Direction.WEST, theAnt.getDirection());
    }

    @Test
    public void itShouldTurnDirectionLeftWhenSquareColorIsBlack() {
        Ant theAnt = new Ant(Ant.Direction.WEST, SquareColor.BLACK);

        theAnt.turnDirection();
        assertEquals(Ant.Direction.SOUTH, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Ant.Direction.EAST, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Ant.Direction.NORTH, theAnt.getDirection());

        theAnt.turnDirection();
        assertEquals(Ant.Direction.WEST, theAnt.getDirection());
    }
}
