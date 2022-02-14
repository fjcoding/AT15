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

    public String getNumber() {
        switch (this.content) {
            case PATTERN_0:
                return "0";
            case PATTERN_1:
                return "1";
            case PATTERN_2:
                return "2";
            case PATTERN_3:
                return "3";
            case PATTERN_4:
                return "4";
            case PATTERN_5:
                return "5";
            case PATTERN_6:
                return "6";
            case PATTERN_7:
                return "7";
            case PATTERN_8:
                return "8";
            case PATTERN_9:
                return "9";
            default:
                return "?";
        }
    }
}
