package org.fundacionjala.at15.katas.bankocr.adhemar;

public class Digit {
    public static final String PATTERN_0 = " _ \n" + "| |\n" + "|_|\n" + "   \n";
    public static final String PATTERN_1 = "   \n" + "  |\n" + "  |\n" + "   \n";
    public static final String PATTERN_2 = " _ \n" + " _|\n" + "|_ \n" + "   \n";
    public static final String PATTERN_3 = " _ \n" + " _|\n" + " _|\n" + "   \n";
    public static final String PATTERN_4 = "   \n" + "|_|\n" + "  |\n" + "   \n";
    public static final String PATTERN_5 = " _ \n" + "|_ \n" + " _|\n" + "   \n";
    public static final String PATTERN_6 = " _ \n" + "|_ \n" + "|_|\n" + "   \n";
    public static final String PATTERN_7 = " _ \n" + "  |\n" + "  |\n" + "   \n";
    public static final String PATTERN_8 = " _ \n" + "|_|\n" + "|_|\n" + "   \n";
    public static final String PATTERN_9 = " _ \n" + "|_|\n" + " _|\n" + "   \n";

    private String content;

    Digit(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
