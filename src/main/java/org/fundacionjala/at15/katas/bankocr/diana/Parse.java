package org.fundacionjala.at15.katas.bankocr.diana;

import java.util.ArrayList;

public class Parse {

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
    static final int INDEX_ZERO = 0;
    static final int INDEX_ONE = 1;
    static final int INDEX_TWO = 2;
    static final int INDEX_THREE = 3;
    static final int TEN = 10;
    static final int ELEVEN = 11;
    private int numberResult = 0;

    public boolean determinateIfMatrixIsZero(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == " ") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == "|") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    public boolean determinateIfMatrixIsOne(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == " ") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == " ")
                && (matrixToCheck[1][1] == " ") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == " ") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    public boolean determinateIfMatrixIsTwo(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == " ")
                && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == "|") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == " ")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    public boolean determinateIfMatrixIsThree(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == " ") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    public boolean determinateIfMatrixIsFour(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == " ") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == " ") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    public boolean determinateIfMatrixIsFive(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == " ")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    public boolean determinateIfMatrixIsSix(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == " ")
                && (matrixToCheck[2][0] == "|") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    public boolean determinateIfMatrixIsSeven(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == " ") && (matrixToCheck[1][1] == " ") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == " ") && (matrixToCheck[2][1] == " ") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    public boolean determinateIfMatrixIsEight(String[][] matrixToCheck) {
        return ((matrixToCheck[0][0] == " ") && (matrixToCheck[0][1] == "_") && (matrixToCheck[0][2] == " ")
                && (matrixToCheck[1][0] == "|") && (matrixToCheck[1][1] == "_") && (matrixToCheck[1][2] == "|")
                && (matrixToCheck[2][0] == "|") && (matrixToCheck[2][1] == "_") && (matrixToCheck[2][2] == "|")
                && (matrixToCheck[INDEX_THREE][0] == " ") && (matrixToCheck[INDEX_THREE][1] == " ")
                && (matrixToCheck[INDEX_THREE][2] == " "));
    }

    public int getNumber(String[][] matrix) {
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

    public void convertLcdToNumber(Object[] arrayOfMatrixes) {
        String finalResult = "";
        for (int position = 0; position < arrayOfMatrixes.length; position++) {

            int result = getNumber((String[][]) arrayOfMatrixes[position]);
            finalResult = finalResult + String.valueOf(result);
            numberResult = Integer.valueOf(finalResult);
        }
        System.out.print("THE LCD NUMBER IS: " + finalResult);
        System.out.println(" ");
    }

    public void validationAccountNumber() {
        int constant = TEN;
        int auxNumber;
        int auxVar;
        int numberAccount = numberResult;
        int currentNumber = numberAccount;
        int validation = 0;
        ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();

        for (int ind = 0; ind < NINE; ind++) {
            if (numberAccount >= TEN) {
                auxNumber = currentNumber / constant;
                auxVar = currentNumber - (auxNumber * constant);
                arrayOfNumbers.add(auxVar);
                currentNumber = auxNumber;
            }
        }
        for (int indexArray = 0; indexArray < arrayOfNumbers.size(); indexArray++) {
            validation = validation + ((indexArray + 1) * arrayOfNumbers.get(indexArray));
        }
        if (validation % ELEVEN == 0) {
            System.out.println("The number account is valid.");
        } else {
            System.out.println("The number account is NOT valid.");
        }

    }
}
