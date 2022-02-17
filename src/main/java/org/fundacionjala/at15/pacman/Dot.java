package org.fundacionjala.at15.pacman;

public class Dot {
    private String dot;
    private boolean status;

    public Dot(String dot) {
        this.dot = dot;
        status = true;
    }

    public boolean getStatus() {
        return status;
    }

    public String dissapear() {
        dot = " ";
        return dot;
    }

    public String printDot() {
        return dot;
    }
}
