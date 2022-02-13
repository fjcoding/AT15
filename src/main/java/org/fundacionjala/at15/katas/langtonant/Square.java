package org.fundacionjala.at15.katas.langtonant;

public class Square {

    protected Position position;
    protected Color color;

    public enum Color {
        WHITE, BLACK
    }

    public Square(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public Position getPosition() {
        return this.position;
    }

    public Color getColor() {
        return this.color;
    }

    public void switchColor() {
        this.color = this.color == Color.BLACK ? Color.WHITE : Color.BLACK;
    }

    public String print() {
        return this.color == Color.BLACK ? "[X]" : "[ ]";
    }
}
