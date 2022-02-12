package org.fundacionjala.at15.katas.langtonant;

public class Square {

    private Position position;
    private SquareColor color;

    public Square(Position position, SquareColor color) {
        this.position = position;
        this.color = color;
    }

    public Position getPosition() {
        return this.position;
    }

    public SquareColor getColor() {
        return this.color;
    }
}
