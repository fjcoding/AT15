package org.fundacionjala.at15.katas.bankocr.alvaro;

import java.util.Arrays;
import java.util.Scanner;

public class Data {
    private static char[][] mat= new char[3][27];
    private Scanner scan = new Scanner(System.in);
    private final int numberData = 3;
    public int readData() {
        int counter = 0;
        for (int index = 0; index < numberData; index++) {
            //String stringText = scan.nextLine();
            counter++;
        }
        return numberData;
    }
    public boolean addToMatrix(String string, int index) {
        int counter = 0;
        boolean cond = true;
        char[] line = string.toCharArray();

        for (int ind = 0; ind < 27; ind++) {
            mat[index][ind] = line[ind];
            counter++;

        }
        if (counter == 27) {
            return cond;
        } else {
            return !cond;
        }
    }
    public static char[][] extractnumberin3x3matrix( int index)
    {
        int newindex = index;
        char [][] mat3x3 = new char[3][3];
        for(int ind = 0; ind < 3; ind++) {
            for(int j=0;j<3;j++) {
                mat3x3[ind][j] = mat[ind][newindex];
                newindex++;
            }
            newindex = index;
        }
        return mat3x3;
    }
    public static int comparemat(int index, int y, char [][]matriz1)
    {
        char [][] one = {{' ',' ',' '},
                         {'|',' ',' '},
                         {'|',' ',' '}};

        char [][] two = {{' ','_',' '},
                         {' ','_','|'},
                         {'|','_',' '}};

        char [][] three = {{' ','_',' '},
                         {' ','_','|'},
                         {' ','_','|'}};

        char [][] four = {{' ',' ',' '},
                         {'|','_','|'},
                         {' ',' ','|'}};

        char [][] five = {{' ','_',' '},
                         {'|','_',' '},
                         {' ','_','|'}};

        char [][] six = {{' ','_',' '},
                         {'|','_',' '},
                         {'|','_','|'}};

        char [][] seven= {{' ','_',' '},
                         {' ',' ','|'},
                         {' ',' ','|'}};

        char [][] eigth = {{' ','_',' '},
                         {'|','_','|'},
                         {'|','_','|'}};

        char [][] nine = {{' ','_',' '},
                         {'|','_','|'},
                         {' ','_','|'}};

        char [][] zero = {{' ','_',' '},
                         {'|',' ','|'},
                         {'|','_','|'}};

        if (Arrays.deepEquals(matriz1, one)){
            System.out.println("Es uno");
            return 1;
        } else if (Arrays.deepEquals(matriz1, two)) {
            System.out.println("Es 2");
            return 2;
        } else if (Arrays.deepEquals(matriz1, three)) {
            System.out.println("Es 3");
            return 3;
        } else if (Arrays.deepEquals(matriz1, four)) {
            System.out.println("Es 4");
            return 4;
        } else if (Arrays.deepEquals(matriz1, five)) {
            System.out.println("Es 5");
            return 5;
        } else if (Arrays.deepEquals(matriz1, six)) {
            System.out.println("Es 6");
            return 6;
        } else if (Arrays.deepEquals(matriz1, seven)) {
            System.out.println("Es 7");
            return 7;
        } else if (Arrays.deepEquals(matriz1, eigth)) {
            System.out.println("Es 8");
            return 8;
        } else if (Arrays.deepEquals(matriz1, nine)) {
            System.out.println("Es 9");
            return 9;
        } else if (Arrays.deepEquals(matriz1, zero)) {
            System.out.println("Es 0");
            return 0;
        }


        return 0;
    }
    public static boolean comparewithnumberzero(char [][]matrix) {
        char [][] zero = {{' ','_',' '},
                         {'|',' ','|'},
                         {'|','_','|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, zero)) {
            return !cond;
        } else {
            return cond;
        }

    }
    public static boolean comparewithnumberone(char [][]matrix) {
        char [][] one = {{' ',' ',' '},
                         {'|',' ',' '},
                         {'|',' ',' '}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, one)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumbertwo(char [][]matrix) {
        char [][] two = {{' ','_',' '},
                         {' ','_','|'},
                         {'|','_',' '}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, two)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumberthree(char [][]matrix) {
        char [][] three = {{' ','_',' '},
        {' ','_','|'},
        {' ','_','|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, three)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumberfour(char [][]matrix) {
        char [][] four = {{' ',' ',' '},
        {'|','_','|'},
        {' ',' ','|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, four)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumberfive(char [][]matrix) {
        char [][] five = {{' ','_',' '},
                         {'|','_',' '},
                         {' ','_','|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, five)) {
            return !cond;
        } else {
            return cond;
        }
    }
    public static boolean comparewithnumbersix(char [][]matrix) {
        char [][] six = {{' ','_',' '},
        {'|','_',' '},
        {'|','_','|'}};
        boolean cond = false;
        if (Arrays.deepEquals(matrix, six)) {
            return !cond;
        } else {
            return cond;
        }
    }
}
