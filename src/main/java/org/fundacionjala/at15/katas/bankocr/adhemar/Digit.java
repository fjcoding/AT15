package org.fundacionjala.at15.katas.bankocr.adhemar;

public class Digit {
    public static final String PATTERN_0 = " _ \n" + "| |\n" + "|_|\n" + "   \n";
    private String content;

    Digit(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
