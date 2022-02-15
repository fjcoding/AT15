package org.fundacionjala.at15.katas.bankocr.mauricio;

import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import java.io.File;

public class DigitsTest {
    static final int ROWS = 3;
    static final int COLUMNS = 27;
    @Test
    public void matrixCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 27; j++) {
                cells[i][j] = " ";
            }
        }
        String[][] cells2 = new String[3][27];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 27; j++) {
                cells2[i][j] = " ";
            }
        }
        assertEquals(cells2, digits.getCells());
    }

    @Test
    public void numberOneCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        cells[0][1] = " ";
        cells[1][0] = " ";
        cells[1][1] = " ";
        cells[1][2] = "|";
        cells[2][0] = " ";
        cells[2][1] = " ";
        cells[2][2] = "|";

        String auxNumber = "1";
        assertEquals(auxNumber, digits.guessDigit(cells[0][1], cells[1][0], cells[1][1], cells[1][2], cells[2][0],
                cells[2][1], cells[2][2]));
    }

    @Test
    public void numberTwoCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        cells[0][1] = "_";
        cells[1][0] = " ";
        cells[1][1] = "_";
        cells[1][2] = "|";
        cells[2][0] = "|";
        cells[2][1] = "_";
        cells[2][2] = " ";

        String auxNumber = "2";
        assertEquals(auxNumber, digits.guessDigit(cells[0][1], cells[1][0], cells[1][1], cells[1][2], cells[2][0],
                cells[2][1], cells[2][2]));
    }

    @Test
    public void numberThreeCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        cells[0][1] = "_";
        cells[1][0] = " ";
        cells[1][1] = "_";
        cells[1][2] = "|";
        cells[2][0] = " ";
        cells[2][1] = "_";
        cells[2][2] = "|";

        String auxNumber = "3";
        assertEquals(auxNumber, digits.guessDigit(cells[0][1], cells[1][0], cells[1][1], cells[1][2], cells[2][0],
                cells[2][1], cells[2][2]));
    }

    @Test
    public void numberFourCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        cells[0][1] = " ";
        cells[1][0] = "|";
        cells[1][1] = "_";
        cells[1][2] = "|";
        cells[2][0] = " ";
        cells[2][1] = " ";
        cells[2][2] = "|";

        String auxNumber = "4";
        assertEquals(auxNumber, digits.guessDigit(cells[0][1], cells[1][0], cells[1][1], cells[1][2], cells[2][0],
                cells[2][1], cells[2][2]));
    }

    @Test
    public void numberFiveCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        cells[0][1] = "_";
        cells[1][0] = "|";
        cells[1][1] = "_";
        cells[1][2] = " ";
        cells[2][0] = " ";
        cells[2][1] = "_";
        cells[2][2] = "|";

        String auxNumber = "5";
        assertEquals(auxNumber, digits.guessDigit(cells[0][1], cells[1][0], cells[1][1], cells[1][2], cells[2][0],
                cells[2][1], cells[2][2]));
    }

    public void numberSixCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        cells[0][1] = "_";
        cells[1][0] = "|";
        cells[1][1] = "_";
        cells[1][2] = " ";
        cells[2][0] = "|";
        cells[2][1] = "_";
        cells[2][2] = "|";

        String auxNumber = "6";
        assertEquals(auxNumber, digits.guessDigit(cells[0][1], cells[1][0], cells[1][1], cells[1][2], cells[2][0],
                cells[2][1], cells[2][2]));
    }

    public void numberSevenCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        cells[0][1] = "_";
        cells[1][0] = " ";
        cells[1][1] = " ";
        cells[1][2] = "|";
        cells[2][0] = " ";
        cells[2][1] = " ";
        cells[2][2] = "|";

        String auxNumber = "7";
        assertEquals(auxNumber, digits.guessDigit(cells[0][1], cells[1][0], cells[1][1], cells[1][2], cells[2][0],
                cells[2][1], cells[2][2]));
    }

    public void numberEightCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        cells[0][1] = "_";
        cells[1][0] = "|";
        cells[1][1] = "_";
        cells[1][2] = "|";
        cells[2][0] = "|";
        cells[2][1] = "_";
        cells[2][2] = "|";

        String auxNumber = "8";
        assertEquals(auxNumber, digits.guessDigit(cells[0][1], cells[1][0], cells[1][1], cells[1][2], cells[2][0],
                cells[2][1], cells[2][2]));
    }

    public void numberNineCreation() {
        Digits digits = new Digits(3, 27);
        String[][] cells = digits.getCells();
        cells[0][1] = "_";
        cells[1][0] = "|";
        cells[1][1] = "_";
        cells[1][2] = "|";
        cells[2][0] = " ";
        cells[2][1] = "_";
        cells[2][2] = "|";

        String auxNumber = "9";
        assertEquals(auxNumber, digits.guessDigit(cells[0][1], cells[1][0], cells[1][1], cells[1][2], cells[2][0],
                cells[2][1], cells[2][2]));
    }

    public void digitsValidation() {

        Digits digits = new Digits(ROWS, COLUMNS);
        String[][] auxCells = digits.getCells();
        String[] arrOfStr;
        int rows = 0;
        try {
            Scanner input = new Scanner(
                    new File("src/main/java/org/fundacionjala/at15/katas/bankocr/mauricio/Number3.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
                arrOfStr = line.split("");
                for (int vari = 0; vari < arrOfStr.length; vari++) {
                    auxCells[rows][vari] = arrOfStr[vari];
                }
                rows++;
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int validation = digits.isAccountValid();
        String numbers = "123456789";

        assertEquals(1, validation);
        // assertEquals(numbers, digits.printCells());
        // assertEquals(numbers, digits.printCells());
    }
}