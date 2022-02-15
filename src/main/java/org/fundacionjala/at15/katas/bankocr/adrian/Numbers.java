package org.fundacionjala.at15.katas.bankocr.adrian;

public class Numbers {
    private String[][] matrix;
    private int rows;
    private int columns;
    //numbers that I use as coordinates of the matrix
    private final int threes = 3;
    private final int fours = 4;
    private final int fives = 5;
    private final int sixs = 6;
    private final int sevens = 7;
    private final int eight = 8;
    private final int nine = 9;
    private final int ten = 10;
    private final int eleven = 11;
    private final int twelve = 12;
    private final int thirteen = 13;
    private final int fourteen = 14;
    private final int fifteen = 15;
    private final int sixteen = 16;
    private final int seventeen = 17;
    private final int eightteen = 18;
    private final int nineteen = 19;
    private final int twenty = 20;
    private final int twentyone = 21;
    private final int twentytwo = 22;
    private final int twentythree = 23;
    private final int twentyfour = 24;
    private final int twentyfive = 25;
    private final int twentysix = 26;

    public Numbers(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new String[rows][columns];
    }

    public String[][] getStrings() {
        return matrix;
    }

    public String print() {
        System.out.println();
        String result = "";
        for (int ind = 0; ind < nine; ind++) {
            result = result + number()[ind];
        }
        return result;
    }
    public String[] number() {
        String[] number = new String[nine];
        number[0] = whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]);
        number[1] = whatNumber(matrix[0][fours], matrix[1][threes], matrix[1][fours], matrix[1][fives], matrix[2][threes],
            matrix[2][fours], matrix[2][fives]);
        number[2] = whatNumber(matrix[0][sevens], matrix[1][sixs], matrix[1][sevens], matrix[1][eight], matrix[2][sixs],
            matrix[2][sevens], matrix[2][eight]);
        number[threes] = whatNumber(matrix[0][ten], matrix[1][nine], matrix[1][ten], matrix[1][eleven], matrix[2][nine],
            matrix[2][ten], matrix[2][eleven]);
        number[fours] = whatNumber(matrix[0][thirteen], matrix[1][twelve], matrix[1][thirteen], matrix[1][fourteen], matrix[2][twelve],
            matrix[2][thirteen], matrix[2][fourteen]);
        number[fives] = whatNumber(matrix[0][sixteen], matrix[1][fifteen], matrix[1][sixteen], matrix[1][seventeen], matrix[2][fifteen],
            matrix[2][sixteen], matrix[2][seventeen]);
        number[sixs] = whatNumber(matrix[0][nineteen], matrix[1][eightteen], matrix[1][nineteen], matrix[1][twenty],
            matrix[2][eightteen], matrix[2][nineteen], matrix[2][twenty]);
        number[sevens] = whatNumber(matrix[0][twentytwo], matrix[1][twentyone], matrix[1][twentytwo], matrix[1][twentythree],
            matrix[2][twentyone], matrix[2][twentytwo], matrix[2][twentythree]);
        number[eight] = whatNumber(matrix[0][twentyfive], matrix[1][twentyfour], matrix[1][twentyfive], matrix[1][twentysix],
            matrix[2][twentyfour], matrix[2][twentyfive], matrix[2][twentysix]);
        return number;
    }

    public String whatNumber(String one, String two, String three, String four, String five, String six, String seven) {
        String number = "";
        String result = "?";
        number = one + two + three + four + five + six + seven;
        if (number.equals("_| ||_|")) {
            result = "0";
        }
        if (number.equals("   |  |")) {
            result = "1";
        }
        if (number.equals("_ _||_ ")) {
            result = "2";
        }
        if (number .equals("_ _| _|")) {
            result = "3";
        }
        if (number.equals(" |_|  |")) {
            result = "4";
        }
        if (number.equals("_|_  _|")) {
            result = "5";
        }
        if (number.equals("_|_ |_|")) {
            result = "6";
        }
        if (number.equals("_  |  |")) {
            result = "7";
        }
        if (number.equals("_|_||_|")) {
            result = "8";
        }
        if (number.equals("_|_| _|")) {
            result = "9";
        }
        return result;
    }
}
