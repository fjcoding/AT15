package org.fundacionjala.at15.katas.langtonant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PositionTest {

    @Test
    public void itShouldHaveXAndYCoordinates() {
        Position pos = new Position(0, 0);
        assertEquals(0, pos.getX());
        assertEquals(0, pos.getY());
    }

    @Test
    public void itShouldBeEqualsToAnotherPositionWhenCoordinatesMatch() {
        Position pos = new Position(5, 5);
        Position anotherPos = new Position(5, 5);
        assertTrue(pos.equals(anotherPos));
    }

    @Test
    public void itShouldNotBeEqualsToAnotherPositionWhenCoordinatesDoNotMatch() {
        Position pos = new Position(5, 5);
        Position anotherPos = new Position(0, 5);
        assertFalse(pos.equals(anotherPos));
    }
}
