package org.fundacionjala.at15.katas.bankocr;

public class Main {

    public static void main(String[] args) {
        ReadTXT numberTest= new ReadTXT();
        numberTest.readTxtFile("enter file location");
        System.out.print(numberTest);
    }
}