package org.fundacionjala.at15.katas.bankocr.adhemar;

public class Entry {
    private String origin;
    private String[] digitPatterns;
    private static final int DIGITS_LINE = 9;
    private static final int CHARS_DIGIT = 3;

    public Entry(String origin) {
        this.origin = origin;
        this.digitPatterns = new String[DIGITS_LINE];
        for (int index = 0; index < this.digitPatterns.length; index++) {
            this.digitPatterns[index] = "";
        }
    }

    public String getOrigin() {
        return this.origin;
    }

    public String[] getDigitPatterns() {
        return this.digitPatterns;
    }

    public void splitDigitPatterns() {
        char[] chars = this.origin.toCharArray();
        int index2 = 0;
        for (int index1 = 0; index1 < chars.length; index1++) {
            this.digitPatterns[index2] += String.valueOf(chars[index1]);
            if ((index1 + 1) % CHARS_DIGIT == 0) {
                if (index2 + 1 == DIGITS_LINE) {
                    index2 = 0;
                } else {
                    this.digitPatterns[index2] += "\n";
                    index2++;
                }
            }
        }
    }
}
