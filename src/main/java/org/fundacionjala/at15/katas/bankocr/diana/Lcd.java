package org.fundacionjala.at15.katas.bankocr.diana;

public class Lcd {
    static final int ZERO = 0;
    static final int ONE = 1;
    static final int TWO = 2;
    static final int THREE = 3;
    static final int FOUR = 4;
    static final int FIVE = 5;
    static final int SIX = 6;
    static final int SEVEN = 7;
    static final int EIGHT = 8;
    static final int NINE = 9;
    static final int ROWS = 4;
    static final int COLUMNS = 3;
    static final int ARRAY = 9;
    static final int INDEX_ZERO = 0;
    static final int INDEX_ONE = 1;
    static final int INDEX_TWO = 2;
    static final int INDEX_THREE = 3;

    public Object[] processNumberInput(int numberInput) { // Read de file.txt and data processing
        String numberInputString = String.valueOf(numberInput);
        Object[] arrayOfMatrixes = new Object[ARRAY];
        for (int indexInput = 0; indexInput < numberInputString.length(); indexInput++) {
            String[][] matrixNumber = new String[ROWS][COLUMNS];
            String number = String.valueOf(numberInputString.charAt(indexInput));
            int position = indexInput;

            switch (number) {
                case "0":
                    matrixNumber = numberZero(matrixNumber);
                    break;
                case "1":
                    matrixNumber = numberOne(matrixNumber);
                    break;
                case "2":
                    matrixNumber = numberTwo(matrixNumber);
                    break;
                case "3":
                    matrixNumber = numberThree(matrixNumber);
                    break;
                case "4":
                    matrixNumber = numberFour(matrixNumber);
                    break;
                case "5":
                    matrixNumber = numberFive(matrixNumber);
                    break;
                case "6":
                    matrixNumber = numberSix(matrixNumber);
                    break;
                case "7":
                    matrixNumber = numberSeven(matrixNumber);
                    break;
                case "8":
                    matrixNumber = numberEight(matrixNumber);
                    break;
                default:
                    matrixNumber = numberNine(matrixNumber);
                    break;
            }
            arrayOfMatrixes[position] = matrixNumber;
        }
        return arrayOfMatrixes;
    }

    public String[][] numberZero(String[][] matrixNumbers) { // create number zero on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public String[][] numberOne(String[][] matrixNumbers) { // create number one on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = " ";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public String[][] numberTwo(String[][] matrixNumbers) { // create number two on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public String[][] numberThree(String[][] matrixNumbers) { // create number three on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public String[][] numberFour(String[][] matrixNumbers) { // create number four on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = " ";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public String[][] numberFive(String[][] matrixNumbers) { // create number five on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = " ";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public String[][] numberSix(String[][] matrixNumbers) { // create number six on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = " ";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public String[][] numberSeven(String[][] matrixNumbers) { // create number seven on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = " ";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public String[][] numberEight(String[][] matrixNumbers) { // create number eight on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public String[][] numberNine(String[][] matrixNumbers) { // create number nine on a matrix 4x3
        matrixNumbers[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumbers[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumbers[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumbers[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumbers[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumbers[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumbers[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumbers[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumbers[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumbers;
    }

    public void printLcd(Object[] arrayOfMatrixes) {
        for (int fila = 0; fila < ROWS; fila++) {
            for (int matriz = 0; matriz < arrayOfMatrixes.length; matriz++) {
                String[][] matrizToCheck = (String[][]) arrayOfMatrixes[matriz];
                for (int columna = 0; columna < COLUMNS; columna++) {
                    System.out.print(matrizToCheck[fila][columna] + " ");
                }
            }
            System.out.println();
        }
    }
}
