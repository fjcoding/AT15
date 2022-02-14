package org.fundacionjala.at15.katas.bankocr.alvaro;

import java.util.Arrays;


public class Data {
    private static final int ROWS = 3;
    private static final int COLUMNS = 27;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGTH = 8;
    private static final int NINE = 9;
    private static final int ZERO = 0;
    private static final int NUMBERNOVALID = 10;
    private static final int CHECKSUM = 11;
    private static final int LONGITUDARRAYNUMBERS = 8;
    private static char[][] mat = new char[ROWS][COLUMNS];
    public static String readData(String[] data, int index) {
        String stringText = data[index];
        return stringText;
    }
    public boolean addToMatrix(String string, int index) {
        int counter = 0;
        boolean cond = true;
        char[] line = string.toCharArray();

        for (int ind = 0; ind < COLUMNS; ind++) {
            mat[index][ind] = line[ind];
            counter++;

        }
        if (counter == COLUMNS) {
            return cond;
        } else {
            return !cond;
        }
    }
    public static char[][] extractnumberin3x3matrix(int index) {
        int newindex = index;
        //int row = 3;
        char[][] mat3x3 = new char[ROWS][ROWS];
        for (int ind = 0; ind < ROWS; ind++) {
            for (int indj = 0; indj < ROWS; indj++) {
                mat3x3[ind][indj] = mat[ind][newindex];
                newindex++;
            }
            newindex = index;
        }
        return mat3x3;
    }
    public static int comparenumbers(char[][]matrix) {

        if (comparewithnumberone(matrix)) {
            return ONE;
        } else if (comparewithnumbertwo(matrix)) {
            return TWO;
        } else if (comparewithnumberthree(matrix)) {

            return THREE;
        } else if (comparewithnumberfour(matrix)) {

            return FOUR;
        } else if (comparewithnumberfive(matrix)) {

            return FIVE;
        } else if (comparewithnumbersix(matrix)) {

            return SIX;
        } else if (comparewithnumberseven(matrix)) {

            return SEVEN;
        } else if (comparewithnumbereigth(matrix)) {

            return EIGTH;
        } else if (comparewithnumbernine(matrix)) {

            return NINE;
        } else if (comparewithnumberzero(matrix)) {

            return ZERO;
        }

        return NUMBERNOVALID;

    }
    public static boolean comparewithnumberzero(char[][]matrix) {
        char[][] zero = {{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, zero)) {
            return !cond;
        } else {
            return cond;
        }

    }
    public static boolean comparewithnumberone(char[][]matrix) {
        char[][] one = {{' ', ' ', ' '}, {'|', ' ', ' '}, {'|', ' ', ' '}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, one)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumbertwo(char[][]matrix) {
        char[][] two = {{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, two)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumberthree(char[][]matrix) {
        char[][] three = {{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, three)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumberfour(char[][]matrix) {
        char[][] four = {{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, four)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumberfive(char[][]matrix) {
        char[][] five = {{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, five)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumbersix(char[][]matrix) {
        char[][] six = {{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, six)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumberseven(char[][]matrix) {
        char[][] seven = {{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, seven)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumbereigth(char[][]matrix) {
        char[][] eigth = {{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, eigth)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumbernine(char[][]matrix) {
        char[][] nine = {{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, nine)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean shownumbers(int[] numbers) {
        int counter = 0;
        boolean cond = false;
        for (int ind = 0; ind < numbers.length; ind++) {
            System.out.print(numbers[ind]);
            counter++;
        }
        if (counter - 1 == LONGITUDARRAYNUMBERS) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean checkifitisavalidaccount(int[]nros) {
        int mul = 1;
        int aux = 0;

        boolean cond = false;
        for (int ind = LONGITUDARRAYNUMBERS; ind >= 0; ind--) {
            aux = aux + nros[ind] * mul;
            mul++;
        }
        if (aux % CHECKSUM == 0) {
            System.out.println("Es numero valido");
            return !cond;


        } else {
            System.out.println("no es nro valido");
            return cond;
        }
    }
}
