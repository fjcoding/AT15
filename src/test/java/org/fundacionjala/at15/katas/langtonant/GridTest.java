package org.fundacionjala.at15.katas.langtonant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GridTest {

    @Test
    public void itShouldHaveWhiteSquaresAndAnAntByDefault() {
        Grid theGrid = new Grid();
        Square[][] gridSquares = theGrid.getSquares();

        for (int xIndex = 0; xIndex < Grid.DEFAULT_COLUMNS_COUNT; xIndex++) {
            for (int yIndex = 0; yIndex < Grid.DEFAULT_ROWS_COUNT; yIndex++) {
                if (xIndex == Grid.DEFAULT_ANT_X_POS && yIndex == Grid.DEFAULT_ANT_Y_POS) {
                    assertTrue(gridSquares[xIndex][yIndex] instanceof Ant);
                    Ant antSquare = (Ant) gridSquares[xIndex][yIndex];
                    assertEquals(xIndex, antSquare.getPosition().getX());
                    assertEquals(yIndex, antSquare.getPosition().getY());
                    assertEquals(Direction.WEST, antSquare.getDirection());
                    assertEquals(Square.Color.WHITE, antSquare.getColor());
                } else {
                    Square square = gridSquares[xIndex][yIndex];
                    assertEquals(xIndex, square.getPosition().getX());
                    assertEquals(yIndex, square.getPosition().getY());
                    assertEquals(Square.Color.WHITE, square.getColor());
                }
            }
        }
    }

    @Test
    public void itShouldBeAbleToMoveTheAnt() {
        Grid theGrid = new Grid();
        theGrid.moveAnt();
        Square[][] gridSquares = theGrid.getSquares();

        Square previousAntSquare = gridSquares[Grid.DEFAULT_ANT_X_POS][Grid.DEFAULT_ANT_Y_POS];
        assertFalse(previousAntSquare instanceof Ant);
        assertEquals(Square.Color.BLACK, previousAntSquare.getColor());

        Square currentAntSquare = gridSquares[Grid.DEFAULT_ANT_X_POS][Grid.DEFAULT_ANT_Y_POS + 1];
        assertTrue(currentAntSquare instanceof Ant);
        assertEquals(Square.Color.WHITE, currentAntSquare.getColor());
    }

    @Test
    public void itShouldPrintDefaultGridSquares() {
        String expectedGridPrint =
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][A][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n";

        Grid theGrid = new Grid();
        assertEquals(expectedGridPrint, theGrid.print());
    }

    @Test
    public void itShouldPrintExpectedGridAfter10Steps() {
        String expectedGridPrintAfter10Steps =
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][X][X][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][X][X][X][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][X][ ][A][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n"
          + "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n";

        Grid theGrid = new Grid();
        int steps = 10;
        for (int counter = 0; counter < steps; counter++) {
            theGrid.moveAnt();
        }
        String actualGridPrint = theGrid.print();
        assertEquals(expectedGridPrintAfter10Steps, actualGridPrint);
    }
}
