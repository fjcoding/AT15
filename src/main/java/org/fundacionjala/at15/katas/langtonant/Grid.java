package org.fundacionjala.at15.katas.langtonant;

public class Grid {

    public static final int DEFAULT_COLUMNS_COUNT = 11;
    public static final int DEFAULT_ROWS_COUNT = 11;
    public static final int DEFAULT_ANT_X_POS = 5;
    public static final int DEFAULT_ANT_Y_POS = 5;

    private Square[][] squares;
    private Ant theAnt;
    private int rows;
    private int columns;

    public Grid() {
        createGrid(DEFAULT_ROWS_COUNT, DEFAULT_COLUMNS_COUNT, DEFAULT_ANT_X_POS, DEFAULT_ANT_Y_POS);
    }

    public Square[][] getSquares() {
        return squares;
    }

    private void createGrid(int theRows, int theColumns, int antX, int antY) {
        this.rows = theRows;
        this.columns = theColumns;
        this.squares = new Square[columns][rows];
        for (int xIndex = 0; xIndex < columns; xIndex++) {
            for (int yIndex = 0; yIndex < rows; yIndex++) {
                Position pos = new Position(xIndex, yIndex);
                if (xIndex == antX && yIndex == antY) {
                    this.theAnt = new Ant(Direction.WEST, Square.Color.WHITE, pos);
                    this.squares[xIndex][yIndex] = this.theAnt;
                } else {
                    this.squares[xIndex][yIndex] = new Square(pos, Square.Color.WHITE);
                }
            }
        }
    }

    public void moveAnt() {
        // flip color of square
        Square antPrevSquare = new Square(theAnt.getPosition(), theAnt.getColor());
        antPrevSquare.switchColor();

        // ant moves forward
        Position afterStepAntPosition = theAnt.findNextStepPosition();
        Square antNextSquare = squares[afterStepAntPosition.getX()][afterStepAntPosition.getY()];
        theAnt.takeStep(antNextSquare.getColor());

        // update grid
        int antPrevSquarePosX = antPrevSquare.getPosition().getX();
        int antPrevSquarePosY = antPrevSquare.getPosition().getY();
        int antNextSquarePosX = antNextSquare.getPosition().getX();
        int antNextSquarePosY = antNextSquare.getPosition().getY();

        squares[antPrevSquarePosX][antPrevSquarePosY] = antPrevSquare;
        squares[antNextSquarePosX][antNextSquarePosY] = theAnt;
    }

    /**
     * Builds a "printable" string that can be displayed to show grid contents/status
     *
     * The print rotates 90
     */
    public String print() {
        String result = "";
        for (int yIndex = rows - 1; yIndex >= 0; yIndex--) {
            for (int xIndex = 0; xIndex < columns; xIndex++) {
                result += squares[xIndex][yIndex].print();
            }
            result += "\n";
        }
        return result;
    }
}
