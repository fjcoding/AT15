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

    @Test
    public void itShouldMoveForwardDependingOnTheCurrentDirection() {
        Position initAntPos = new Position(5, 5);
        Ant theAnt = new Ant(Direction.WEST, SquareColor.BLACK, initAntPos);
        theAnt.moveForward();
        Position expectedForwardPos = new Position(4, 5);
        assertEquals(expectedForwardPos, theAnt.getPosition());

        initAntPos = new Position(5, 5);
        theAnt = new Ant(Direction.NORTH, SquareColor.BLACK, initAntPos);
        theAnt.moveForward();
        expectedForwardPos = new Position(5, 6);
        assertEquals(expectedForwardPos, theAnt.getPosition());

        initAntPos = new Position(5, 5);
        theAnt = new Ant(Direction.EAST, SquareColor.BLACK, initAntPos);
        theAnt.moveForward();
        expectedForwardPos = new Position(6, 5);
        assertEquals(expectedForwardPos, theAnt.getPosition());

        initAntPos = new Position(5, 5);
        theAnt = new Ant(Direction.SOUTH, SquareColor.BLACK, initAntPos);
        theAnt.moveForward();
        expectedForwardPos = new Position(5, 4);
        assertEquals(expectedForwardPos, theAnt.getPosition());
    }
}
