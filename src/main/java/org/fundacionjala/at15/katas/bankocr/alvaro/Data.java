package org.fundacionjala.at15.katas.bankocr.alvaro;

import java.util.Arrays;
import java.util.Scanner;

public class Data {
    private static final int rows = 3;
    private static final int columns = 27;
    private static char[][] mat = new char[rows][columns];
    private static Scanner scan = new Scanner(System.in);
    public static String readData() {
        String stringText = scan.nextLine();
        return stringText;
    }
    public boolean addToMatrix(String string, int index) {
        int counter = 0;
        boolean cond = true;
        char[] line = string.toCharArray();

        for (int ind = 0; ind < columns; ind++) {
            mat[index][ind] = line[ind];
            counter++;

        }
        if (counter == columns) {
            return cond;
        } else {
            return !cond;
        }
    }
    public static char[][] extractnumberin3x3matrix(int index) {
        int newindex = index;
        int row = 3;
        char[][] mat3x3 = new char[3][3];
        for (int ind = 0; ind < row; ind++) {
            for (int indj = 0; indj < row; indj++) {
                mat3x3[ind][indj] = mat[ind][newindex];
                newindex++;
            }
            newindex = index;
        }
        return mat3x3;
    }
    public static int comparenumbers(char[][]matrix) {

        if (comparewithnumberone(matrix)) {
            return 1;
        } else if (comparewithnumbertwo(matrix)) {
            return 2;
        } else if (comparewithnumberthree(matrix)) {

            return 3;
        } else if (comparewithnumberfour(matrix)) {

            return 4;
        } else if (comparewithnumberfive(matrix)) {

            return 5;
        } else if (comparewithnumbersix(matrix)) {

            return 6;
        } else if (comparewithnumberseven(matrix)) {

            return 7;
        } else if (comparewithnumbereigth(matrix)) {

            return 8;
        } else if (comparewithnumbernine(matrix)) {

            return 9;
        } else if (comparewithnumberzero(matrix)) {

            return 0;
        }

        return (Integer) null;

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
        if (counter == numbers.length) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean checkifitisavalidaccount(int []nros) {
        int mul = 1;
        int aux = 0;
        int condition = 11;
        boolean cond = false;
        for (int ind= 8; ind >= 0; ind--)
        {
            aux = aux + nros[ind] * mul;
            mul++;
        }
        if (aux % condition == 0) {
            System.out.println("Es numero valido");
            return !cond;


        } else {
            System.out.println("no es nro valido");
            return cond;
        }
    }
}
