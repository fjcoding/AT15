package org.fundacionjala.at15.katas.bankocr.diana;

import java.util.Scanner;

public class Main {
    public static void name(String[] args) {
        System.out.println("WELCOME TO THE BANK OCR");

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the serial number:");
        int serialNumber = read.nextInt();

        Display lcd = new Display(serialNumber);

    }
}
