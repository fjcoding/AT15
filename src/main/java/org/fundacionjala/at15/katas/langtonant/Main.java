package org.fundacionjala.at15.katas.langtonant;

public class Main {

    public static final int STEPS = 200; // Modify this value and run runLangtonAnt task to see result grid in console

    public static void main(String[] args) {
        Grid theGrid = new Grid();
        for (int counter = 0; counter < STEPS; counter++) {
            theGrid.moveAnt();
        }
        System.out.println(theGrid.print());
    }
}