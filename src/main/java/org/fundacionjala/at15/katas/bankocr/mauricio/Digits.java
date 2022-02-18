package org.fundacionjala.at15.katas.bankocr.mauricio;

public class Digits {
    private String[][] cells;
    private int rows;
    private int columns;
    private final int nine = 9;
    private final int eigth = 8;
    private final int eleven = 11;
    private final int constThree = 3;

    public Digits(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        cells = new String[rows][columns];
    }

    public String[][] getCells() {
        return cells;
    }

    public String[] getDigits() {
        String[] digits = new String[nine];
        int columAuxOne = 1; // Initial value
        int columAuxTwo = 0; // Initial value
        int columAuxThree = 2; // Initial value
        for (int vari = 0; vari < digits.length; vari++) {
            digits[vari] = guessDigit(cells[0][columAuxOne], cells[1][columAuxTwo], cells[1][columAuxOne],
                    cells[1][columAuxThree], cells[2][columAuxTwo], cells[2][columAuxOne], cells[2][columAuxThree]);
            columAuxOne = columAuxOne + constThree; // Only the columns change
            columAuxTwo = columAuxTwo + constThree;
            columAuxThree = columAuxThree + constThree;
        }
        return digits;
    }

    public String guessDigit(String lineOne, String lineTwo, String lineThree, String lineFour, String lineFive,
            String lineSix, String lineSeven) { // A number has 7 characters that could be | OR _ OR " "
        if (lineOne.equals("_") && lineTwo.equals("|") && lineThree.equals(" ") && lineFour.equals("|")
                && lineFive.equals("|") && lineSix.equals("_") && lineSeven.equals("|")) {
            return "0";
        } else if (lineOne.equals(" ") && lineTwo.equals(" ") && lineThree.equals(" ") && lineFour.equals("|")
                && lineFive.equals(" ") && lineSix.equals(" ") && lineSeven.equals("|")) {
            return "1";
        } else if (lineOne.equals("_") && lineTwo.equals(" ") && lineThree.equals("_") && lineFour.equals("|")
                && lineFive.equals("|") && lineSix.equals("_") && lineSeven.equals(" ")) {
            return "2";
        } else if (lineOne.equals("_") && lineTwo.equals(" ") && lineThree.equals("_") && lineFour.equals("|")
                && lineFive.equals(" ") && lineSix.equals("_") && lineSeven.equals("|")) {
            return "3";
        } else if (lineOne.equals(" ") && lineTwo.equals("|") && lineThree.equals("_") && lineFour.equals("|")
                && lineFive.equals(" ") && lineSix.equals(" ") && lineSeven.equals("|")) {
            return "4";
        } else if (lineOne.equals("_") && lineTwo.equals("|") && lineThree.equals("_") && lineFour.equals(" ")
                && lineFive.equals(" ") && lineSix.equals("_") && lineSeven.equals("|")) {
            return "5";
        } else if (lineOne.equals("_") && lineTwo.equals("|") && lineThree.equals("_") && lineFour.equals(" ")
                && lineFive.equals("|") && lineSix.equals("_") && lineSeven.equals("|")) {
            return "6";
        } else if (lineOne.equals("_") && lineTwo.equals(" ") && lineThree.equals(" ") && lineFour.equals("|")
                && lineFive.equals(" ") && lineSix.equals(" ") && lineSeven.equals("|")) {
            return "7";
        } else if (lineOne.equals("_") && lineTwo.equals("|") && lineThree.equals("_") && lineFour.equals("|")
                && lineFive.equals("|") && lineSix.equals("_") && lineSeven.equals("|")) {
            return "8";
        } else if (lineOne.equals("_") && lineTwo.equals("|") && lineThree.equals("_") && lineFour.equals("|")
                && lineFive.equals(" ") && lineSix.equals("_") && lineSeven.equals("|")) {
            return "9";
        } else {
            return "?";
        }
    }

    public int checkSum() {
        int[] numbers = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1 }; // The array has 9 of size
        int validation2 = 0;
        int conter = 1;
        for (int vari = 0; vari < nine; vari++) {
            numbers[vari] = Integer.parseInt(getDigits()[vari]);
            System.out.println("Converting digits to integer: " + numbers[vari]);
        }
        for (int varj = eigth; varj <= 0; varj--) {
            validation2 = validation2 + numbers[varj] * conter;
            conter++;
        }
        // int validation = numbers[8] + numbers[7] * 2 + numbers[6] * 3 + numbers[5] *
        // 4 + numbers[4] * 5 + numbers[3] * 6
        // + numbers[2] * 7 + numbers[1] * 8 + numbers[0] * 9;

        if (validation2 % eleven == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int isAccountValid() {
        int checking = checkSum();
        if (checking == 1) {
            return 1;
            // System.out.println("The account number is valid!");
        } else {
            return 0;
            // System.out.println("The account number is not valid!");
        }
    }

    public String printCells() {
        String result = "";
        for (int vari = 0; vari < nine; vari++) {
            result += getDigits()[vari];
        }
        return result;
    }

}