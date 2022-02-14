package org.fundacionjala.at15.katas.bankocr.diana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE BANK OCR");

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the serial number:");
        int serialNumber = read.nextInt();

        Display numberInput = new Display(serialNumber);
        numberInput.processNumberInput();
        numberInput.printLcd();
        numberInput.convertLcdToNumber();

        numberInput.validationAccountNumber();

    }
}
