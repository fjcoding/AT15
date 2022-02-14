package org.fundacionjala.at15.katas.bankocr.sergio;

public class Splitter {
    private String lineOne;
    private String lineTwo;
    private String lineThree;
    private String[] lineOneArray;
    private String[] lineTwoArray;
    private String[] lineThreeArray;

    public Splitter(String line1Code, String line2Code, String line3Code) {
        this.lineOne = line1Code;
        this.lineTwo = line2Code;
        this.lineThree = line3Code;
    }

    public String[] getLineOneArray() {
        return lineOneArray;
    }

    public String[] getLineTwoArray() {
        return lineTwoArray;
    }

    public String[] getLineThreeArray() {
        return lineThreeArray;
    }

    public void theSplit() {
        lineOneArray = lineOne.split("(?!^)");
        lineTwoArray = lineTwo.split("(?!^)");
        lineThreeArray = lineThree.split("(?!^)");
    }
}
