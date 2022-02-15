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
    public void itShouldFindNextStepDirectionWhenSquareColorIsWhite() {
        Ant theAnt = new Ant(Direction.WEST, Square.Color.WHITE);
        assertEquals(Direction.NORTH, theAnt.findNextStepDirection());

        theAnt = new Ant(Direction.NORTH, Square.Color.WHITE);
        assertEquals(Direction.EAST, theAnt.findNextStepDirection());

        theAnt = new Ant(Direction.EAST, Square.Color.WHITE);
        assertEquals(Direction.SOUTH, theAnt.findNextStepDirection());

        theAnt = new Ant(Direction.SOUTH, Square.Color.WHITE);
        assertEquals(Direction.WEST, theAnt.findNextStepDirection());
    }

    @Test
    public void itShouldFindNextStepDirectionWhenSquareColorIsBlack() {
        Ant theAnt = new Ant(Direction.WEST, Square.Color.BLACK);
        assertEquals(Direction.SOUTH, theAnt.findNextStepDirection());

        theAnt = new Ant(Direction.SOUTH, Square.Color.BLACK);
        assertEquals(Direction.EAST, theAnt.findNextStepDirection());

        theAnt = new Ant(Direction.EAST, Square.Color.BLACK);
        assertEquals(Direction.NORTH, theAnt.findNextStepDirection());

        theAnt = new Ant(Direction.NORTH, Square.Color.BLACK);
        assertEquals(Direction.WEST, theAnt.findNextStepDirection());
    }

    @Test
    public void itShouldFindNextStepPositionDependingOnCurrentDirectionAndSquareColor() {
        Position initAntPos = new Position(5, 5);
        Ant theAnt = new Ant(Direction.WEST, Square.Color.WHITE, initAntPos);

        Position nextStepPos = theAnt.findNextStepPosition();
        Position expectedPos = new Position(5, 6);
        assertEquals(expectedPos, nextStepPos);

        theAnt = new Ant(Direction.NORTH, Square.Color.WHITE, initAntPos);
        nextStepPos = theAnt.findNextStepPosition();
        expectedPos = new Position(6, 5);
        assertEquals(expectedPos, nextStepPos);

        theAnt = new Ant(Direction.SOUTH, Square.Color.BLACK, initAntPos);
        nextStepPos = theAnt.findNextStepPosition();
        expectedPos = new Position(6, 5);
        assertEquals(expectedPos, nextStepPos);

        theAnt = new Ant(Direction.EAST, Square.Color.BLACK, initAntPos);
        nextStepPos = theAnt.findNextStepPosition();
        expectedPos = new Position(5, 6);
        assertEquals(expectedPos, nextStepPos);
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

    @Test
    public void itShoulBeAbleToPrintAntSymbolDependingOnColor() {
        Position irrelevantPos = new Position(0, 0);
        Ant theAntInWhiteSquare = new Ant(Direction.WEST, Square.Color.WHITE, irrelevantPos);
        Ant theAntInBlackSquare = new Ant(Direction.WEST, Square.Color.BLACK, irrelevantPos);

        assertEquals("[A]", theAntInWhiteSquare.print());
        assertEquals("[a]", theAntInBlackSquare.print());
    }
}
