package org.fundacionjala.at15.katas.bankocr.sergio;

public class Main {
    public static void main(String[] args){
        String lineOne = "    _  _     _  _  _  _  _ ";
        String lineTwo = "  | _| _||_||_ |_   ||_||_|";
        String lineTre = "  ||_  _|  | _||_|  ||_| _|";

        Spliter test = new Spliter(lineOne,lineTwo,lineTre);
        System.out.println(test.completeDigit());
    }

}
