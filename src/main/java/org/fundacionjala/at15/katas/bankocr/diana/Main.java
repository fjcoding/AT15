package org.fundacionjala.at15.katas.bankocr.diana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE BANK OCR");

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the serial number:");
        int serialNumber = read.nextInt();
        read.close();

        Parse numberInput = new Parse();
        Lcd lcd = new Lcd();
        Object[] lcdScreen = lcd.processNumberInput(serialNumber);
        lcd.printLcd(lcdScreen);
        numberInput.convertLcdToNumber(lcdScreen);
        numberInput.validationAccountNumber();

    }
}
