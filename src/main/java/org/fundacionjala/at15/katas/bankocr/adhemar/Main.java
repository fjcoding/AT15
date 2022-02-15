package org.fundacionjala.at15.katas.bankocr.adhemar;

public class Main {
    public static void main(String[] args) {
        IOFile theFile = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/ThreeEntryFile.txt");
        System.out.println("Input File:\n" + theFile.getStringContent());
        System.out.println("Account Numbers:\n" + theFile.getAccountNumbers());
    }
}
