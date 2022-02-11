package org.fundacionjala.at15.katas.bankocr;

public class NumbersMachine {

    static int numberIs;
    
    public static int numbersMachine(String[] compare) {
        final String[] number0 = new String[] { " _ ", "| |", "|_|" };
        final String[] number1 = new String[] { "   ", "  |", "  |" };
        final String[] number2 = new String[] { " _ ", " _|", "|_ " };
        final String[] number3 = new String[] { " _ ", " _|", " _|" };
        final String[] number4 = new String[] { "   ", "|_|", "  |" };
        final String[] number5 = new String[] { " _ ", "|_ ", " _|" };
        final String[] number6 = new String[] { " _ ", "|_ ", "|_|" };
        final String[] number7 = new String[] { " _ ", "  |", "  |" };
        final String[] number8 = new String[] { " _ ", "|_|", "|_|" };
        final String[] number9 = new String[] { " _ ", "|_|", " _|" };
        if (compare == number0) {
            numberIs=0;
        } else if (compare == number1) {
            numberIs=1;
        } else if (compare == number2) {
            numberIs=2;
        } else if (compare == number3) {
            numberIs=3;
        } else if (compare == number4) {
            numberIs=4;
        } else if (compare == number5) {
            numberIs=5;
        } else if (compare == number6) {
            numberIs=6;
        } else if (compare == number7) {
            numberIs=7;
        } else if (compare == number8) {
            numberIs=8;
        } else if (compare == number9) {
            numberIs=9;
        }
        return numberIs;
    }
}