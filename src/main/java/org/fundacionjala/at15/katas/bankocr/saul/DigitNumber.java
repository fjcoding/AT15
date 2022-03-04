package org.fundacionjala.at15.katas.bankocr.saul;

import java.util.Arrays;

public class DigitNumber {
    private int number;
    private String[] segments;

    private final String[] zero = new String[] {
        " _ ",
        "| |",
        "|_|"
    };

    private final String[] one = new String[] {
        "   ",
        "  |",
        "  |"
    };

    private final String[] two = new String[] {
        " _ ",
        " _|",
        "|_ "
    };

    private final String[] three = new String[] {
        " _ ",
        " _|",
        " _|"
    };

    private final String[] four = new String[] {
        "   ",
        "|_|",
        "  |"
    };

    private final String[] five = new String[] {
        " _ ",
        "|_ ",
        " _|"
    };

    private final String[] six = new String[] {
        " _ ",
        "|_ ",
        "|_|"
    };

    private final String[] seven = new String[] {
        " _ ",
        "  |",
        "  |"
    };

    private final String[] eight = new String[] {
        " _ ",
        "|_|",
        "|_|"
    };

    private final String[] nine = new String[] {
        " _ ",
        "|_|",
        " _|"
    };

    public DigitNumber(int number) {
        this.number = number;
    }

    public DigitNumber(String digitScanned) {
        this.number = segmentToNumber(digitScanned);
        this.segments = toSegment(digitScanned);
    }

    public void printSegments() {
        for (int indexI = 0; indexI < segments.length; indexI++) {
            System.out.print(segments[indexI]);
            System.out.println();
        }
    }

    public int segmentToNumber(String inputString) {
        String[] theSegmentNumber = toSegment(inputString);
        int result;
        final int third = 3;
        final int fourth = 4;
        final int fifth = 5;
        final int sixth = 6;
        final int seventh = 7;
        final int eighth = 8;
        final int ninth = 9;

        if (Arrays.equals(theSegmentNumber, zero)) {
            result = 0;
        } else if (Arrays.equals(theSegmentNumber, one)) {
            result = 1;
        } else if (Arrays.equals(theSegmentNumber, two)) {
            result = 2;
        } else if (Arrays.equals(theSegmentNumber, three)) {
            result = third;
        } else if (Arrays.equals(theSegmentNumber, four)) {
            result = fourth;
        } else if (Arrays.equals(theSegmentNumber, five)) {
            result = fifth;
        } else if (Arrays.equals(theSegmentNumber, six)) {
            result = sixth;
        } else if (Arrays.equals(theSegmentNumber, seven)) {
            result = seventh;
        } else if (Arrays.equals(theSegmentNumber, eight)) {
            result = eighth;
        } else if (Arrays.equals(theSegmentNumber, nine)) {
            result = ninth;
        } else {
            result = -1;
        }
        return result;
    }

    public String[] toSegment(String numberScanned) {
        final int third = 3;
        String[] theSegmentNumber = new String[third];
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