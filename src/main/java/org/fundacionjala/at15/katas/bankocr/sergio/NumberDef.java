package org.fundacionjala.at15.katas.bankocr.sergio;

public class NumberDef {
    private MatrixArch matrix;

    public NumberDef(MatrixArch currentMatrix) {
        this.matrix = currentMatrix;

    }

    public String loneDigit(int start) {

        String numberDef;
        if (this.matrix.matrixDigit(start)[0][0].equals(" ") && this.matrix.matrixDigit(start)[0][1].equals(" ")
                && this.matrix.matrixDigit(start)[0][2].equals(" ") && this.matrix.matrixDigit(start)[1][0].equals(" ")
                && this.matrix.matrixDigit(start)[1][1].equals(" ") && this.matrix.matrixDigit(start)[1][2].equals("|")
                && this.matrix.matrixDigit(start)[2][0].equals(" ") && this.matrix.matrixDigit(start)[2][1].equals(" ")
                && this.matrix.matrixDigit(start)[2][2].equals("|")) {
            numberDef = "1";
        } else if (this.matrix.matrixDigit(start)[0][0].equals(" ") && this.matrix.matrixDigit(start)[0][1].equals("_")
                && this.matrix.matrixDigit(start)[0][2].equals(" ") && this.matrix.matrixDigit(start)[1][0].equals(" ")
                && this.matrix.matrixDigit(start)[1][1].equals("_") && this.matrix.matrixDigit(start)[1][2].equals("|")
                && this.matrix.matrixDigit(start)[2][0].equals("|") && this.matrix.matrixDigit(start)[2][1].equals("_")
                && this.matrix.matrixDigit(start)[2][2].equals(" ")) {
            numberDef = "2";
        } else if (this.matrix.matrixDigit(start)[0][0].equals(" ") && this.matrix.matrixDigit(start)[0][1].equals("_")
                && this.matrix.matrixDigit(start)[0][2].equals(" ") && this.matrix.matrixDigit(start)[1][0].equals(" ")
                && this.matrix.matrixDigit(start)[1][1].equals("_") && this.matrix.matrixDigit(start)[1][2].equals("|")
                && this.matrix.matrixDigit(start)[2][0].equals(" ") && this.matrix.matrixDigit(start)[2][1].equals("_")
                && this.matrix.matrixDigit(start)[2][2].equals("|")) {
            numberDef = "3";
        } else if (this.matrix.matrixDigit(start)[0][0].equals(" ") && this.matrix.matrixDigit(start)[0][1].equals(" ")
                && this.matrix.matrixDigit(start)[0][2].equals(" ") && this.matrix.matrixDigit(start)[1][0].equals("|")
                && this.matrix.matrixDigit(start)[1][1].equals("_") && this.matrix.matrixDigit(start)[1][2].equals("|")
                && this.matrix.matrixDigit(start)[2][0].equals(" ") && this.matrix.matrixDigit(start)[2][1].equals(" ")
                && this.matrix.matrixDigit(start)[2][2].equals("|")) {
            numberDef = "4";
        } else if (this.matrix.matrixDigit(start)[0][0].equals(" ") && this.matrix.matrixDigit(start)[0][1].equals("_")
                && this.matrix.matrixDigit(start)[0][2].equals(" ") && this.matrix.matrixDigit(start)[1][0].equals("|")
                && this.matrix.matrixDigit(start)[1][1].equals("_") && this.matrix.matrixDigit(start)[1][2].equals(" ")
                && this.matrix.matrixDigit(start)[2][0].equals(" ") && this.matrix.matrixDigit(start)[2][1].equals("_")
                && this.matrix.matrixDigit(start)[2][2].equals("|")) {
            numberDef = "5";
        } else if (this.matrix.matrixDigit(start)[0][0].equals(" ") && this.matrix.matrixDigit(start)[0][1].equals("_")
                && this.matrix.matrixDigit(start)[0][2].equals(" ") && this.matrix.matrixDigit(start)[1][0].equals("|")
                && this.matrix.matrixDigit(start)[1][1].equals("_") && this.matrix.matrixDigit(start)[1][2].equals(" ")
                && this.matrix.matrixDigit(start)[2][0].equals("|") && this.matrix.matrixDigit(start)[2][1].equals("_")
                && this.matrix.matrixDigit(start)[2][2].equals("|")) {
            numberDef = "6";
        } else if (this.matrix.matrixDigit(start)[0][0].equals(" ") && this.matrix.matrixDigit(start)[0][1].equals("_")
                && this.matrix.matrixDigit(start)[0][2].equals(" ") && this.matrix.matrixDigit(start)[1][0].equals(" ")
                && this.matrix.matrixDigit(start)[1][1].equals(" ") && this.matrix.matrixDigit(start)[1][2].equals("|")
                && this.matrix.matrixDigit(start)[2][0].equals(" ") && this.matrix.matrixDigit(start)[2][1].equals(" ")
                && this.matrix.matrixDigit(start)[2][2].equals("|")) {
            numberDef = "7";
        } else if (this.matrix.matrixDigit(start)[0][0].equals(" ") && this.matrix.matrixDigit(start)[0][1].equals("_")
                && this.matrix.matrixDigit(start)[0][2].equals(" ") && this.matrix.matrixDigit(start)[1][0].equals("|")
                && this.matrix.matrixDigit(start)[1][1].equals("_") && this.matrix.matrixDigit(start)[1][2].equals("|")
                && this.matrix.matrixDigit(start)[2][0].equals("|") && this.matrix.matrixDigit(start)[2][1].equals("_")
                && this.matrix.matrixDigit(start)[2][2].equals("|")) {
            numberDef = "8";
        } else if (this.matrix.matrixDigit(start)[0][0].equals(" ") && this.matrix.matrixDigit(start)[0][1].equals("_")
                && this.matrix.matrixDigit(start)[0][2].equals(" ") && this.matrix.matrixDigit(start)[1][0].equals("|")
                && this.matrix.matrixDigit(start)[1][1].equals("_") && this.matrix.matrixDigit(start)[1][2].equals("|")
                && this.matrix.matrixDigit(start)[2][0].equals(" ") && this.matrix.matrixDigit(start)[2][1].equals("_")
                && this.matrix.matrixDigit(start)[2][2].equals("|")) {
            numberDef = "9";
        } else {
            numberDef = "?";
        }
        return numberDef;
    }
}
