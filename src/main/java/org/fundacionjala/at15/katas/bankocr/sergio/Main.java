package org.fundacionjala.at15.katas.bankocr.sergio;

public class Main {
    public static void main(String[] args) {
        String lineOne = "    _  _     _  _  _  _  _ ";
        String lineTwo = "  | _| _||_||_ |_   ||_||_|";
        String lineTre = "  ||_  _|  | _||_|  ||_| _|";

        Splitter splitTest = new Splitter(lineOne, lineTwo, lineTre);
        MatrixArch matrixTest = new MatrixArch(splitTest);
        NumberDef numberDefTest = new NumberDef(matrixTest);
        CompleteNumber completeNumberTest = new CompleteNumber(numberDefTest);
        SplitCompleteNumber splitCompleteNumberTest = new SplitCompleteNumber(completeNumberTest);
        ChangeToInt changeToIntTest = new ChangeToInt(splitCompleteNumberTest);
        Validation validationTest = new Validation(changeToIntTest);
        System.out.println(completeNumberTest.completeDigit());
        System.out.println(validationTest.theValidation());
    }
}
