package org.fundacionjala.at15.katas.bankocr.mauricio;

import java.io.File;
import java.util.Scanner;

public class Main {

    static final int ROWS = 3;
    static final int COLUMNS = 27;

    public static void main(String[] args) {
        Digits digits = new Digits(ROWS, COLUMNS);
        String[][] auxCells = digits.getCells();
        String[] arrOfStr;
        int rows = 0;

        try {
            Scanner input = new Scanner(
                    new File("src/main/java/org/fundacionjala/at15/katas/bankocr/mauricio/Numbers.txt"));
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
        digits.printCells(); // User 1
        System.out.println();
        digits.isAccountValid(); // User 2

    }
}
