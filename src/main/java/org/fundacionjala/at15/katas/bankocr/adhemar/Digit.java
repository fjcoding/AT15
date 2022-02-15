package org.fundacionjala.at15.katas.bankocr.adhemar;

public class Digit {
    public static final String PATTERN_0 = " _ \n" + "| |\n" + "|_|\n";
    public static final String PATTERN_1 = "   \n" + "  |\n" + "  |\n";
    public static final String PATTERN_2 = " _ \n" + " _|\n" + "|_ \n";
    public static final String PATTERN_3 = " _ \n" + " _|\n" + " _|\n";
    public static final String PATTERN_4 = "   \n" + "|_|\n" + "  |\n";
    public static final String PATTERN_5 = " _ \n" + "|_ \n" + " _|\n";
    public static final String PATTERN_6 = " _ \n" + "|_ \n" + "|_|\n";
    public static final String PATTERN_7 = " _ \n" + "  |\n" + "  |\n";
    public static final String PATTERN_8 = " _ \n" + "|_|\n" + "|_|\n";
    public static final String PATTERN_9 = " _ \n" + "|_|\n" + " _|\n";

    private String content;
    private String number;

    public Digit(String content) {
        this.content = content;
        this.calculateNumber();
    }

    public String getContent() {
        return this.content;
    }

    public String getNumber() {
        return this.number;
    }

    public void calculateNumber() {
        switch (this.content) {
            case PATTERN_0:
                this.number = "0";
                break;
            case PATTERN_1:
                this.number = "1";
                break;
            case PATTERN_2:
                this.number = "2";
                break;
            case PATTERN_3:
                this.number = "3";
                break;
            case PATTERN_4:
                this.number = "4";
                break;
            case PATTERN_5:
                this.number = "5";
                break;
            case PATTERN_6:
                this.number = "6";
                break;
            case PATTERN_7:
                this.number = "7";
                break;
            case PATTERN_8:
                this.number = "8";
                break;
            case PATTERN_9:
                this.number = "9";
                break;
            default:
                this.number = "?";
        }
    }
}
