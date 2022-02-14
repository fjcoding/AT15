package org.fundacionjala.at15.katas.bankocr.diana;

public class Display {
    static final int ROWS = 4;
    static final int COLUMNS = 3;
    static final int ARRAY = 9;
    static final int INDEX_ZERO = 0;
    static final int INDEX_ONE = 1;
    static final int INDEX_TWO = 2;
    static final int INDEX_THREE = 3;
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
    private int numberInput; // number of de fle.txt
    private String[][] matrixNumber = new String[ROWS][COLUMNS];
    private Object[] arrayOfMatrixes = new Object[ARRAY];

    public Display(int numberInput) {
        this.numberInput = numberInput;
    }

    public void processNumberInput() { // Read de file.txt and data processing
        String numberInputString = String.valueOf(numberInput);
        for (int indexInput = 0; indexInput < numberInputString.length(); indexInput++) {
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
    }

    private String[][] numberZero(String[][] matrixNumbers) { // create number zero on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumber[INDEX_ONE][INDEX_ONE] = " ";
        matrixNumber[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumber[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    private String[][] numberOne(String[][] matrixNumbers) { // create number one on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = " ";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ONE] = " ";
        matrixNumber[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_TWO][INDEX_ONE] = " ";
        matrixNumber[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    private String[][] numberTwo(String[][] matrixNumbers) { // create number two on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumber[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumber[INDEX_TWO][INDEX_TWO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    private String[][] numberThree(String[][] matrixNumbers) { // create number three on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumber[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumber[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    private String[][] numberFour(String[][] matrixNumbers) { // create number four on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = " ";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumber[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumber[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_TWO][INDEX_ONE] = " ";
        matrixNumber[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    private String[][] numberFive(String[][] matrixNumbers) { // create number five on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumber[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumber[INDEX_ONE][INDEX_TWO] = " ";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumber[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    private String[][] numberSix(String[][] matrixNumbers) { // create number six on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumber[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumber[INDEX_ONE][INDEX_TWO] = " ";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumber[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    private String[][] numberSeven(String[][] matrixNumbers) { // create number seven on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ONE] = " ";
        matrixNumber[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_TWO][INDEX_ONE] = " ";
        matrixNumber[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    private String[][] numberEight(String[][] matrixNumbers) { // create number eight on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumber[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumber[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumber[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    private String[][] numberNine(String[][] matrixNumbers) { // create number nine on a matrix 4x3
        matrixNumber[INDEX_ZERO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_ZERO][INDEX_ONE] = "_";
        matrixNumber[INDEX_ZERO][INDEX_TWO] = " ";
        matrixNumber[INDEX_ONE][INDEX_ZERO] = "|";
        matrixNumber[INDEX_ONE][INDEX_ONE] = "_";
        matrixNumber[INDEX_ONE][INDEX_TWO] = "|";
        matrixNumber[INDEX_TWO][INDEX_ZERO] = " ";
        matrixNumber[INDEX_TWO][INDEX_ONE] = "_";
        matrixNumber[INDEX_TWO][INDEX_TWO] = "|";
        matrixNumber[INDEX_THREE][INDEX_ZERO] = " ";
        matrixNumber[INDEX_THREE][INDEX_ONE] = " ";
        matrixNumber[INDEX_THREE][INDEX_TWO] = " ";
        return matrixNumber;
    }

    public void printLcd() {
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

    private boolean determinateIfMatrixIsZero(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == " ") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == "|") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    private boolean determinateIfMatrixIsOne(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == " ") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == " ")
                && (matrixToCheck[1][1] == " ") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == " ") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    private boolean determinateIfMatrixIsTwo(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == " ")
                && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == "|") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == " ")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    private boolean determinateIfMatrixIsThree(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == " ") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    private boolean determinateIfMatrixIsFour(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == " ") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == " ") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    private boolean determinateIfMatrixIsFive(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == " ")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    private boolean determinateIfMatrixIsSix(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == " ")
                && (matrixToCheck[2][0] == "|") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    private boolean determinateIfMatrixIsSeven(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == " ") && (matrixToCheck[1][1] == " ") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == " ") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    private boolean determinateIfMatrixIsEight(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == "|") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    private int getNumber(String[][] matrix) {
        if (determinateIfMatrixIsZero(matrix)) {
            return ZERO;
        }
        if (determinateIfMatrixIsOne(matrix)) {
            return ONE;
        }
        if (determinateIfMatrixIsTwo(matrix)) {
            return TWO;
        }
        if (determinateIfMatrixIsThree(matrix)) {
            return THREE;
        }
        if (determinateIfMatrixIsFour(matrix)) {
            return FOUR;
        }
        if (determinateIfMatrixIsFive(matrix)) {
            return FIVE;
        }
        if (determinateIfMatrixIsSix(matrix)) {
            return SIX;
        }
        if (determinateIfMatrixIsSeven(matrix)) {
            return SEVEN;
        }
        if (determinateIfMatrixIsEight(matrix)) {
            return EIGHT;
        } else {
            return NINE;
        }
    }

    public void convertLcdToNumber() {
        String finalResult = " ";
        for (int position = 0; position < arrayOfMatrixes.length; position++) {

            int result = getNumber((String[][]) arrayOfMatrixes[position]);
            finalResult = finalResult + String.valueOf(result);
        }
        System.out.print("THE ACCOUNT NUMBER IS: " + finalResult);
    }

}
