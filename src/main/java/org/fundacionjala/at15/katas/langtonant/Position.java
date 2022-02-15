package org.fundacionjala.at15.katas.langtonant;

/**
 * Position class that represents a position ([]) in a cartesian coordinate system
 * described by coordinates X and Y
 *
 *  Y
 *  |
 *  |N [] [] [] []    []
 *  |...
 *  |3 [] [] [] []    []
 *  |2 [] [] [] []    []
 *  |1 [] [] [] []    []
 *  |0 [] [] [] []    []
 *  |  0  1  2  3  ... N
 *  |____________________ X
 */
public class Position {

    private int coordinateX;
    private int coordinateY;

    public Position(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getX() {
        return this.coordinateX;
    }

    public int getY() {
        return this.coordinateY;
    }

    @Override
    public boolean equals(Object anotherObj) {
        Position anotherPos = (Position) anotherObj;
        return anotherPos != null
            && this.coordinateX == anotherPos.coordinateX
            && this.coordinateY == anotherPos.coordinateY;
    }

    @Override
    public int hashCode() {
        return this.coordinateX + this.coordinateY;
    }
}
