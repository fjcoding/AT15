package org.fundacionjala.at15.katas.langtonant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AntTest {

    @Test
    public void itShouldHaveADirectionAndASquareColor() {
        Ant theAnt = new Ant(Direction.WEST, Square.Color.WHITE);

        assertEquals(Direction.WEST, theAnt.getDirection());
        assertEquals(Square.Color.WHITE, theAnt.getColor());
    }

    @Test
    public void itShouldTurnDirectionRightWhenSquareColorIsWhite() {
        Ant theAnt = new Ant(Direction.WEST, Square.Color.WHITE);

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
        Ant theAnt = new Ant(Direction.WEST, Square.Color.BLACK);

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
        Ant theAnt = new Ant(Direction.WEST, Square.Color.BLACK, initAntPos);
        theAnt.moveForward();
        Position expectedForwardPos = new Position(4, 5);
        assertEquals(expectedForwardPos, theAnt.getPosition());

        initAntPos = new Position(5, 5);
        theAnt = new Ant(Direction.NORTH, Square.Color.BLACK, initAntPos);
        theAnt.moveForward();
        expectedForwardPos = new Position(5, 6);
        assertEquals(expectedForwardPos, theAnt.getPosition());

        initAntPos = new Position(5, 5);
        theAnt = new Ant(Direction.EAST, Square.Color.BLACK, initAntPos);
        theAnt.moveForward();
        expectedForwardPos = new Position(6, 5);
        assertEquals(expectedForwardPos, theAnt.getPosition());

        initAntPos = new Position(5, 5);
        theAnt = new Ant(Direction.SOUTH, Square.Color.BLACK, initAntPos);
        theAnt.moveForward();
        expectedForwardPos = new Position(5, 4);
        assertEquals(expectedForwardPos, theAnt.getPosition());
    }

    @Test
    public void itShouldTakeStepWhereReceivesNewSquareColorAndMoveForward() {
        Position initAntPos = new Position(5, 5);
        Ant theAnt = new Ant(Direction.WEST, Square.Color.WHITE, initAntPos);
        theAnt.takeStep(Square.Color.WHITE);
        Position expectedForwardPos = new Position(5, 6);
        assertEquals(expectedForwardPos, theAnt.getPosition());
        assertEquals(Square.Color.WHITE, theAnt.getColor());
        assertEquals(Direction.NORTH, theAnt.getDirection());

        theAnt.takeStep(Square.Color.WHITE);
        expectedForwardPos = new Position(6, 6);
        assertEquals(expectedForwardPos, theAnt.getPosition());
        assertEquals(Square.Color.WHITE, theAnt.getColor());
        assertEquals(Direction.EAST, theAnt.getDirection());

        theAnt.takeStep(Square.Color.WHITE);
        expectedForwardPos = new Position(6, 5);
        assertEquals(expectedForwardPos, theAnt.getPosition());
        assertEquals(Square.Color.WHITE, theAnt.getColor());
        assertEquals(Direction.SOUTH, theAnt.getDirection());

        theAnt.takeStep(Square.Color.BLACK);
        expectedForwardPos = new Position(5, 5);
        assertEquals(expectedForwardPos, theAnt.getPosition());
        assertEquals(Square.Color.BLACK, theAnt.getColor());
        assertEquals(Direction.WEST, theAnt.getDirection());

        theAnt.takeStep(Square.Color.WHITE);
        expectedForwardPos = new Position(5, 4);
        assertEquals(expectedForwardPos, theAnt.getPosition());
        assertEquals(Square.Color.WHITE, theAnt.getColor());
        assertEquals(Direction.SOUTH, theAnt.getDirection());
    }
}
