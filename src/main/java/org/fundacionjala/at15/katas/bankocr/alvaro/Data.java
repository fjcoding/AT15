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
    public static char[][] extractNumberIn3x3Matrix(int index) {
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
    public static int compareNumbers(char[][]matrix) {

        if (compareWithNumberOne(matrix)) {
            return ONE;
        } else if (compareWithNumberTwo(matrix)) {
            return TWO;
        } else if (compareWithNumberThree(matrix)) {

            return THREE;
        } else if (compareWithNumberFour(matrix)) {

            return FOUR;
        } else if (compareWithNumberFive(matrix)) {

            return FIVE;
        } else if (compareWithNumberSix(matrix)) {

            return SIX;
        } else if (compareWithNumberSeven(matrix)) {

            return SEVEN;
        } else if (compareWithNumberEigth(matrix)) {

            return EIGTH;
        } else if (compareWithNumberNine(matrix)) {

            return NINE;
        } else if (compareWithNumberZero(matrix)) {

            return ZERO;
        }

        return NUMBERNOVALID;

    }
    public static boolean compareWithNumberZero(char[][]matrix) {
        char[][] zero = {{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, zero)) {
            return !cond;
        } else {
            return cond;
        }

    }
    public static boolean compareWithNumberOne(char[][]matrix) {
        char[][] one = {{' ', ' ', ' '}, {'|', ' ', ' '}, {'|', ' ', ' '}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, one)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean compareWithNumberTwo(char[][]matrix) {
        char[][] two = {{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, two)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean compareWithNumberThree(char[][]matrix) {
        char[][] three = {{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, three)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean compareWithNumberFour(char[][]matrix) {
        char[][] four = {{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, four)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean compareWithNumberFive(char[][]matrix) {
        char[][] five = {{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, five)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean compareWithNumberSix(char[][]matrix) {
        char[][] six = {{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, six)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean compareWithNumberSeven(char[][]matrix) {
        char[][] seven = {{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, seven)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean compareWithNumberEigth(char[][]matrix) {
        char[][] eigth = {{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, eigth)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean compareWithNumberNine(char[][]matrix) {
        char[][] nine = {{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, nine)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean showNumbers(int[] numbers) {
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
    public static boolean checkIfitIsaValidAccount(int[]nros) {
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
