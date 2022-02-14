package org.fundacionjala.at15.katas.bankocr.adrian;


public class UserCases extends Numbers {
    //numbers that I for the checksum ecuation
    private final int threes = 3;
    private final int fours = 4;
    private final int fives = 5;
    private final int sixs = 6;
    private final int sevens = 7;
    private final int eight = 8;
    private final int nine = 9;
    private final int eleven = 11;
    private final int twentyseven = 27;

    public UserCases(int rows, int columns) {
        super(rows, columns);
    }

    public Boolean checksum() {
        boolean check = false;
        if (ill()) {
            check = false;
        } else {
            int dd9 = Integer.parseInt(number()[0]);
            int dd8 = Integer.parseInt(number()[1]);
            int dd7 = Integer.parseInt(number()[2]);
            int dd6 = Integer.parseInt(number()[threes]);
            int dd5 = Integer.parseInt(number()[fours]);
            int dd4 = Integer.parseInt(number()[fives]);
            int dd3 = Integer.parseInt(number()[sixs]);
            int dd2 = Integer.parseInt(number()[sevens]);
            int dd1 = Integer.parseInt(number()[eight]);
            if ((dd1 + 2 * dd2 + threes * dd3 + fours * dd4 + fives * dd5 + sixs * dd6 + sevens * dd7 + eight * dd8 + nine * dd9) % eleven == 0) {
                check = true;
            }
        }
        return check;
    }
    public boolean ill() {
        boolean bool = false;
        for (int ind = 0; ind < nine; ind++) {
            if (number()[ind].equals("?")) {
                bool = true;
            }
        }
        return bool;
    }
    public void case3() {
        if (checksum()) {
            print();
        } else if (ill()) {
            print();
            System.out.print(" ILL");
        } else {
            print();
            System.out.print(" ERR");
        }
    }

    public void case4() {
        final String[][] backupMatrix = new String[threes][twentyseven];
        for (int ind = 0; ind < threes; ind++) {
            for (int jnd = 0; jnd < twentyseven; jnd++) {
                backupMatrix[ind][jnd] = getStrings()[ind][jnd];
            }
        }
        for (int ind = 0; ind < threes; ind++) {
            for (int jnd = 0; jnd < twentyseven; jnd++) {
                getStrings()[ind][jnd] = replaceCharAtPosition(getStrings()[ind][jnd]);
                if (checksum()) {
                    print();
                    getStrings()[ind][jnd] = backupMatrix[ind][jnd];
                } else {
                    getStrings()[ind][jnd] = backupMatrix[ind][jnd];
                }
            }
        }
    }

    public String replaceCharAtPosition(String character) {
        String result = "";
        if (character.equals("_") || character.equals("|")) {
            result = " ";
            return result;
        } else {
            return character;
        }
    }
}
