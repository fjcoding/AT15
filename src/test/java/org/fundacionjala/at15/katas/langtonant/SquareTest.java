package org.fundacionjala.at15.katas.langtonant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {

    @Test
    public void itShouldHaveAPositionAndAColor() {
        Position pos = new Position(0, 0);
        Square theSquare = new Square(pos, Square.Color.WHITE);
        assertEquals(new Position(0, 0), theSquare.getPosition());
        assertEquals(Square.Color.WHITE, theSquare.getColor());
    }
}
