package org.fundacionjala.at15.katas.bankocr.adrian;

public class Main {
    public static void main(String[] args) {
        final int rows = 3;
        final int columns = 27;
        UserCases matrix = new UserCases(rows, columns);
        ReadFile fileToMatrix = new ReadFile(matrix);

        matrix.case3();
        matrix.case4();
    }
}
