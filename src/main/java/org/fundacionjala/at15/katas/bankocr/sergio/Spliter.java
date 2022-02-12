package org.fundacionjala.at15.katas.bankocr.sergio;

public class Spliter {
    private String lineOne;
    private String lineTwo;
    private String lineThree;
    private String lineOneArray[];
    private String lineTwoArray[];
    private String lineThreeArray[];

    public Spliter (String line1Code, String line2Code, String line3Code){
        this.lineOne = line1Code;
        this.lineTwo = line2Code;
        this.lineThree = line3Code;
    }

    public String[] getLineOneArray(){
        return lineOneArray;
    }

    public String[] getLineTwoArray(){
        return lineTwoArray;
    }

    public String[] getLineThreeArray(){
        return lineThreeArray;
    }

    public void theSplit(){
        lineOneArray = lineOne.split("(?!^)");
        lineTwoArray = lineTwo.split("(?!^)");
        lineThreeArray = lineThree.split("(?!^)");
    }

    private String [][] matrixDigit(int start){

        String [][] resp = new String[3][3];
        int pos1 = start;
        int pos2 = start +1;
        int pos3 = start +2;

        resp[0][0] = lineOneArray[pos1];
        resp[0][1] = lineOneArray[pos2];
        resp[0][2] = lineOneArray[pos3];

        resp[1][0] = lineTwoArray[pos1];
        resp[1][1] = lineTwoArray[pos2];
        resp[1][2] = lineTwoArray[pos3];

        resp[2][0] = lineThreeArray[pos1];
        resp[2][1] = lineThreeArray[pos2];
        resp[2][2] = lineThreeArray[pos3];

        return resp;
    }

    private String loneDigit(String [][] digit){
        String numberDef;
        if(digit[0][0].equals(" ") && digit[0][1].equals(" ") && digit[0][2].equals(" ")
                && digit[1][0].equals(" ") && digit[1][1].equals(" ") && digit[1][2].equals("|")
                && digit[2][0].equals(" ") && digit[2][1].equals(" ") && digit[2][2].equals("|")){
            numberDef = "1";
        //return "1";
        } else if (digit[0][0].equals(" ") && digit[0][1].equals("_") && digit[0][2].equals(" ")
                && digit[1][0].equals(" ") && digit[1][1].equals("_") && digit[1][2].equals("|")
                && digit[2][0].equals("|") && digit[2][1].equals("_") && digit[2][2].equals(" ")){
            numberDef = "2";
        //return "2";
        } else if (digit[0][0].equals(" ") && digit[0][1].equals("_") && digit[0][2].equals(" ")
                && digit[1][0].equals(" ") && digit[1][1].equals("_") && digit[1][2].equals("|")
                && digit[2][0].equals(" ") && digit[2][1].equals("_") && digit[2][2].equals("|")){
            numberDef = "3";
        //return "3";
        } else if (digit[0][0].equals(" ") && digit[0][1].equals(" ") && digit[0][2].equals(" ")
                && digit[1][0].equals("|") && digit[1][1].equals("_") && digit[1][2].equals("|")
                && digit[2][0].equals(" ") && digit[2][1].equals(" ") && digit[2][2].equals("|")){
            numberDef = "4";
        //return "4";
        } else if (digit[0][0].equals(" ") && digit[0][1].equals("_") && digit[0][2].equals(" ")
                && digit[1][0].equals("|") && digit[1][1].equals("_") && digit[1][2].equals(" ")
                && digit[2][0].equals(" ") && digit[2][1].equals("_") && digit[2][2].equals("|")){
            numberDef = "5";
        //return "5";
        } else if (digit[0][0].equals(" ") && digit[0][1].equals("_") && digit[0][2].equals(" ")
                && digit[1][0].equals("|") && digit[1][1].equals("_") && digit[1][2].equals(" ")
                && digit[2][0].equals("|") && digit[2][1].equals("_") && digit[2][2].equals("|")){
            numberDef = "6";
        //return "6";
        } else if (digit[0][0].equals(" ") && digit[0][1].equals("_") && digit[0][2].equals(" ")
                && digit[1][0].equals(" ") && digit[1][1].equals(" ") && digit[1][2].equals("|")
                && digit[2][0].equals(" ") && digit[2][1].equals(" ") && digit[2][2].equals("|")){
            numberDef = "7";
        //return "7";
        } else if (digit[0][0].equals(" ") && digit[0][1].equals("_") && digit[0][2].equals(" ")
                && digit[1][0].equals("|") && digit[1][1].equals("_") && digit[1][2].equals("|")
                && digit[2][0].equals("|") && digit[2][1].equals("_") && digit[2][2].equals("|")){
            numberDef = "8";
        //return "8";
        } else if (digit[0][0].equals(" ") && digit[0][1].equals("_") && digit[0][2].equals(" ")
                && digit[1][0].equals("|") && digit[1][1].equals("_") && digit[1][2].equals("|")
                && digit[2][0].equals(" ") && digit[2][1].equals("_") && digit[2][2].equals("|")){
            numberDef = "9";
        //return "9";
        } else {
            numberDef = "?";
        }
        return numberDef;
    }
    public String completeDigit(){
        theSplit();
        String number = "";
        for (int i=0;i<=24;i=i+3){
            number = number + loneDigit(matrixDigit(i)) ;

        }
        return number;

    }

}
