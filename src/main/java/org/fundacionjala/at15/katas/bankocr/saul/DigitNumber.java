package org.fundacionjala.at15.katas.bankocr.saul;

import java.util.Arrays;

public class DigitNumber {
    private int number;
    private String[] segments;

    private final String[] ZERO = new String[] {
        " _ ",
        "| |",
        "|_|"
    };

    private final String[] ONE = new String[] {
        "   ",
        "  |",
        "  |"
    };

    private final String[] TWO = new String[] {
        " _ ",
        " _|",
        "|_ "
    };

    private final String[] THREE = new String[] {
        " _ ",
        " _|",
        " _|"
    };

    private final String[] FOUR = new String[] {
        "   ",
        "|_|",
        "  |"
    };

    private final String[] FIVE = new String[] {
        " _ ",
        "|_ ",
        " _|"
    };

    private final String[] SIX = new String[] {
        " _ ",
        "|_ ",
        "|_|"
    };

    private final String[] SEVEN = new String[] {
        " _ ",
        "  |",
        "  |"
    };

    private final String[] EIGHT = new String[] {
        " _ ",
        "|_|",
        "|_|"
    };

    private final String[] NINE = new String[] {
        " _ ",
        "|_|",
        " _|"
    };

    public DigitNumber(int number) {
        this.number = number;
        makeSegments(number);
    }

    public DigitNumber(String digitScanned) {
        this.number = segmentToNumber(digitScanned);
        this.segments = toSegment(digitScanned);
    }

    public void makeSegments(int theNumber) {

        switch (theNumber) {
            case 0:
                segments = ZERO;
                break;

            case 1:
                segments = ONE;
                break;

            case 2:
                segments = TWO;
                break;

            case 3:
                segments = THREE;
                break;

            case 4:
                segments = FOUR;
                break;

            case 5:
                segments = FIVE;
                break;

            case 6:
                segments = SIX;
                break;

            case 7:
                segments = SEVEN;
                break;

            case 8:
                segments = EIGHT;
                break;

            case 9:
                segments = NINE;
                break;

            default:
                break;
        }
    }

    public void printSegments() {
        for (int indexI = 0; indexI < segments.length; indexI++) {
            System.out.print(segments[indexI]);
            System.out.println();
        }
    }

    public int segmentToNumber(String inputString) {
        String theSegmentNumber[] = toSegment(inputString);
        int result;

        if (Arrays.equals(theSegmentNumber, ZERO)) {
            result = 0;
        } else if (Arrays.equals(theSegmentNumber, ONE)) {
            result = 1;
        } else if (Arrays.equals(theSegmentNumber, TWO)) {
            result = 2;
        } else if (Arrays.equals(theSegmentNumber, THREE)) {
            result = 3;
        } else if (Arrays.equals(theSegmentNumber, FOUR)) {
            result = 4;
        } else if (Arrays.equals(theSegmentNumber, FIVE)) {
            result = 5;
        } else if (Arrays.equals(theSegmentNumber, SIX)) {
            result = 6;
        } else if (Arrays.equals(theSegmentNumber, SEVEN)) {
            result = 7;
        } else if (Arrays.equals(theSegmentNumber, EIGHT)) {
            result = 8;
        } else if (Arrays.equals(theSegmentNumber, NINE)) {
            result = 9;
        } else {
            result = -1;
        }
        return result;
    }

    public String[] toSegment(String numberScanned) {
        final int third = 3;
        String theSegmentNumber[] = new String[third];
        String inputLine = "";
        int indexJ = 0;
        for (int indexI = 0; indexI < numberScanned.length(); indexI++) {
            if (numberScanned.charAt(indexI) == '\n') {
                theSegmentNumber[indexJ] = inputLine;
                indexJ += 1;
                inputLine = "";
            } else {
                inputLine += numberScanned.charAt(indexI);
            }
        }
        theSegmentNumber[indexJ] = inputLine;

        return theSegmentNumber;
    }

    public int getNumber() {
        return number;
    }
}