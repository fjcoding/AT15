package org.fundacionjala.at15.katas.bankocr.mauricio;

public class Number {
    private int num;

    static final int NUM_AUX_3 = 3;
    static final int NUM_AUX_4 = 4;

    static final int NUM_0 = 0;
    static final int NUM_1 = 1;
    static final int NUM_2 = 2;
    static final int NUM_3 = 3;
    static final int NUM_4 = 4;
    static final int NUM_5 = 5;
    static final int NUM_6 = 6;
    static final int NUM_7 = 7;
    static final int NUM_8 = 8;
    static final int NUM_9 = 9;

    private char[][] zero = new char[][] {
        {' ', ' ', ' ' },
        {' ', '_', ' ' },
        {'|', ' ', '|' },
        {'|', '_', '|' }
    };
    private char[][] one = new char[][] {
        {' ', ' ', ' ' },
        {' ', ' ', ' ' },
        {' ', ' ', '|' },
        {' ', ' ', '|' }
    };
    private char[][] two = new char[][] {
        {' ', ' ', ' ' },
        {' ', '_', ' ' },
        {' ', '_', '|' },
        {'|', '_', ' ' }
    };
    private char[][] three = new char[][] {
        {' ', ' ', ' ' },
        {' ', '_', ' ' },
        {' ', '_', '|' },
        {' ', '_', '|' }
    };
    private char[][] four = new char[][] {
        {' ', ' ', ' ' },
        {' ', ' ', ' ' },
        {'|', '_', '|' },
        {' ', ' ', '|' }
    };
    private char[][] five = new char[][] {
        {' ', ' ', ' ' },
        {' ', '_', ' ' },
        {'|', '_', ' ' },
        {' ', '_', '|' }
    };
    private char[][] six = new char[][] {
        {' ', ' ', ' ' },
        {' ', '_', ' ' },
        {'|', '_', ' ' },
        {'|', '_', '|' }
    };
    private char[][] seven = new char[][] {
        {' ', ' ', ' ' },
        {' ', '_', ' ' },
        {' ', ' ', '|' },
        {' ', ' ', '|' }
    };
    private char[][] eight = new char[][] {
        {' ', ' ', ' ' },
        {' ', '_', ' ' },
        {' ', ' ', '|' },
        {' ', ' ', '|' }
    };
    private char[][] nine = new char[][] {
        {' ', ' ', ' ' },
        {' ', '_', ' ' },
        {'|', '_', '|' },
        {' ', '_', '|' }
    };
    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void printNumber() {
        switch (num) {
            case NUM_0:
                print(zero);
                break;
            case NUM_1:
                print(one);
                break;
            case NUM_2:
                print(two);
                break;
            case NUM_3:
                print(three);
                break;
            case NUM_4:
                print(four);
                break;
            case NUM_5:
                print(five);
                break;
            case NUM_6:
                print(six);
                break;
            case NUM_7:
                print(seven);
                break;
            case NUM_8:
                print(eight);
                break;
            case NUM_9:
                print(nine);
                break;
            default:
                break;
        }
    }

    public void print(char[][] numAux) {
        for (int vari = 0; vari < NUM_AUX_4; vari++) {
            for (int varj = 0; varj < NUM_AUX_3; varj++) {
                System.out.print(numAux[vari][varj]);
            }
            System.out.println();
        }
    }
}