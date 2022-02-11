package org.fundacionjala.at15.katas.bankocr.adrian;

public class Numbers {
    private String[][] matrix;
    private int rows;
    private int columns;
    private final int threes = 3;
    private final int fours = 4;
    private final int fives = 5;
    private final int sixs = 6;
    private final int sevens = 7;
    private final int eight = 8;
    private final int nine = 9;
    private final int ten = 10;
    private final int eleven = 11;
    private final int twelve = 12;
    private final int thirteen = 13;
    private final int fourteen = 14;
    private final int fifteen = 15;
    private final int sixteen = 16;
    private final int seventeen = 17;
    private final int eightteen = 18;
    private final int nineteen = 19;
    private final int twenty = 20;
    private final int twentyone = 21;
    private final int twentytwo = 22;
    private final int twentythree = 23;
    private final int twentyfour = 24;
    private final int twentyfive = 25;
    private final int twentysix = 26;

    public Numbers(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new String[rows][columns];
    }

    public String[][] getStrings() {
        return matrix;
    }

    public void print() {
        System.out.println();
        for (int ind = 0; ind < nine; ind++) {
            System.out.print(number()[ind]);
        }
    }
    public String[] number() {
        String[] number = new String[nine];
        number[0] = whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]);
        number[1] = whatNumber(matrix[0][fours], matrix[1][threes], matrix[1][fours], matrix[1][fives], matrix[2][threes],
            matrix[2][fours], matrix[2][fives]);
        number[2] = whatNumber(matrix[0][sevens], matrix[1][sixs], matrix[1][sevens], matrix[1][eight], matrix[2][sixs],
            matrix[2][sevens], matrix[2][eight]);
        number[threes] = whatNumber(matrix[0][ten], matrix[1][nine], matrix[1][ten], matrix[1][eleven], matrix[2][nine],
            matrix[2][ten], matrix[2][eleven]);
        number[fours] = whatNumber(matrix[0][thirteen], matrix[1][twelve], matrix[1][thirteen], matrix[1][fourteen], matrix[2][twelve],
            matrix[2][thirteen], matrix[2][fourteen]);
        number[fives] = whatNumber(matrix[0][sixteen], matrix[1][fifteen], matrix[1][sixteen], matrix[1][seventeen], matrix[2][fifteen],
            matrix[2][sixteen], matrix[2][seventeen]);
        number[sixs] = whatNumber(matrix[0][nineteen], matrix[1][eightteen], matrix[1][nineteen], matrix[1][twenty],
            matrix[2][eightteen], matrix[2][nineteen], matrix[2][twenty]);
        number[sevens] = whatNumber(matrix[0][twentytwo], matrix[1][twentyone], matrix[1][twentytwo], matrix[1][twentythree],
            matrix[2][twentyone], matrix[2][twentytwo], matrix[2][twentythree]);
        number[eight] = whatNumber(matrix[0][twentyfive], matrix[1][twentyfour], matrix[1][twentyfive], matrix[1][twentysix],
            matrix[2][twentyfour], matrix[2][twentyfive], matrix[2][twentysix]);
        return number;
    }

    public Boolean checksum() {
        int dd9 = Integer.parseInt(whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
        int dd8 = Integer.parseInt(whatNumber(matrix[0][fours], matrix[1][threes], matrix[1][fours], matrix[1][fives], matrix[2][threes],
            matrix[2][fours], matrix[2][fives]));
        int dd7 = Integer.parseInt(whatNumber(matrix[0][sevens], matrix[1][sixs], matrix[1][sevens], matrix[1][eight], matrix[2][sixs],
            matrix[2][sevens], matrix[2][eight]));
        int dd6 = Integer.parseInt(whatNumber(matrix[0][ten], matrix[1][nine], matrix[1][ten], matrix[1][eleven], matrix[2][nine],
            matrix[2][ten], matrix[2][eleven]));
        int dd5 = Integer.parseInt(whatNumber(matrix[0][thirteen], matrix[1][twelve], matrix[1][thirteen], matrix[1][fourteen], matrix[2][twelve],
            matrix[2][thirteen], matrix[2][fourteen]));
        int dd4 = Integer.parseInt(whatNumber(matrix[0][sixteen], matrix[1][fifteen], matrix[1][sixteen], matrix[1][seventeen], matrix[2][fifteen],
            matrix[2][sixteen], matrix[2][seventeen]));
        int dd3 = Integer.parseInt(whatNumber(matrix[0][nineteen], matrix[1][eightteen], matrix[1][nineteen], matrix[1][twenty],
            matrix[2][eightteen], matrix[2][nineteen], matrix[2][twenty]));
        int dd2 = Integer.parseInt(whatNumber(matrix[0][twentytwo], matrix[1][twentyone], matrix[1][twentytwo], matrix[1][twentythree],
            matrix[2][twentyone], matrix[2][twentytwo], matrix[2][twentythree]));
        int dd1 = Integer.parseInt(whatNumber(matrix[0][twentyfive], matrix[1][twentyfour], matrix[1][twentyfive], matrix[1][twentysix],
            matrix[2][twentyfour], matrix[2][twentyfive], matrix[2][twentysix]));
        return ((dd1 + 2 * dd2 + threes * dd3 + fours * dd4 + fives * dd5 + sixs * dd6 + sevens * dd7 + eight * dd8 + nine * dd9) % eleven == 0);
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

    public String whatNumber(String one, String two, String three, String four, String five, String six, String seven) {
        if (one.equals("_") && two.equals("|") && three.equals(" ") && four.equals("|") && five.equals("|") && six.equals("_") && seven.equals("|")) {
            return "0";
        } else if (one.equals(" ") && two.equals(" ") && three.equals(" ") && four.equals("|") && five.equals(" ") && six.equals(" ")
            && seven.equals("|")) {
            return "1";
        } else if (one.equals("_") && two.equals(" ") && three.equals("_") && four.equals("|") && five.equals("|") && six.equals("_")
            && seven.equals(" ")) {
            return "2";
        } else if (one.equals("_") && two.equals(" ") && three.equals("_") && four.equals("|") && five.equals(" ") && six.equals("_")
            && seven.equals("|")) {
            return "3";
        } else if (one.equals(" ") && two.equals("|") && three.equals("_") && four.equals("|") && five.equals(" ") && six.equals(" ")
            && seven.equals("|")) {
            return "4";
        } else if (one.equals("_") && two.equals("|") && three.equals("_") && four.equals(" ") && five.equals(" ") && six.equals("_")
            && seven.equals("|")) {
            return "5";
        } else if (one.equals("_") && two.equals("|") && three.equals("_") && four.equals(" ") && five.equals("|") && six.equals("_")
            && seven.equals("|")) {
            return "6";
        } else if (one.equals("_") && two.equals(" ") && three.equals(" ") && four.equals("|") && five.equals(" ") && six.equals(" ")
            && seven.equals("|")) {
            return "7";
        } else if (one.equals("_") && two.equals("|") && three.equals("_") && four.equals("|") && five.equals("|") && six.equals("_")
            && seven.equals("|")) {
            return "8";
        } else if (one.equals("_") && two.equals("|") && three.equals("_") && four.equals("|") && five.equals(" ") && six.equals("_")
            && seven.equals("|")) {
            return "9";
        } else {
            return "?";
        }
    }
}
