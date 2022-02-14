package org.fundacionjala.at15.katas.bankocr.agustin;

public class Numbers {

    private final String digit;

    public static final String ZERO = " _ \n" + "| |\n" + "|_|\n" + "   \n";
    public static final String ONE = "   \n" + "  |\n" + "  |\n" + "   \n";
    public static final String TWO = " _ \n" + " _|\n" + "|_ \n" + "   \n";
    public static final String THREE = " _ \n" + " _|\n" + " _|\n" + "   \n";
    public static final String FOUR = "   \n" + "|_|\n" + "  |\n" + "   \n";
    public static final String FIVE = " _ \n" + "|_ \n" + " _|\n" + "   \n";
    public static final String SIX = " _ \n" + "|_ \n" + "|_|\n" + "   \n";
    public static final String SEVEN = " _ \n" + "  |\n" + "  |\n" + "   \n";
    public static final String EIGHT = " _ \n" + "|_|\n" + "|_|\n" + "   \n";
    public static final String NINE = " _ \n" + "|_|\n" + " _|\n" + "   \n";

    public Numbers(String digit) {
        this.digit = digit;
    }

    public String getDigit() {
        return this.digit;
    }


    public String getNumber() {
        switch (this.digit) {
            case ZERO:
                return "0";
            case ONE:
                return "1";
            case TWO:
                return "2";
            case THREE:
                return "3";
            case FOUR:
                return "4";
            case FIVE:
                return "5";
            case SIX:
                return "6";
            case SEVEN:
                return "7";
            case EIGHT:
                return "8";
            case NINE:
                return "9";
            default:
                return "?";
        }
    }

}
