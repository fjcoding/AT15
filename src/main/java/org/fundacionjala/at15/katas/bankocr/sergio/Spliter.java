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

    public void theSplit(){
        lineOneArray = lineOne.split("(?!^");
        lineTwoArray = lineTwo.split("(?!^)");
        lineThreeArray = lineThree.split("(?!^)");
    }

    private String [][] matrixDigit(int start){

        String [][] resp = new String[3][3];
        for(int i= start; i<start+3; i++){
            for(int j = 0; j < 3;j++){
                resp[j][0] = lineOneArray[i];
                resp[j][1] = lineTwoArray[i];
                resp[j][2] = lineThreeArray[i];
            }
        }
        return resp;
    }

    public String loneDigit(String [][] digit){
        String numberDef;
        if (digit[0][0]== " " && digit[0][1]== " " && digit[0][2]== " " && digit[1][0]== " " && digit[1][1]== " " && digit[1][2]== "|" && digit[2][0]== " " && digit[2][1]== " " && digit[2][2]== "|"){
            numberDef = "1";
        //return "1";
        } else if (digit[0][0]== " " && digit[0][1]== "_" && digit[0][2]== " " && digit[1][0]== " " && digit[1][1]== "_" && digit[1][2]== "|" && digit[2][0]== "|" && digit[2][1]== "_" && digit[2][2]== ""){
            numberDef = "2";
        //return "2";
        } else if (digit[0][0]== " " && digit[0][1]== "_" && digit[0][2]== " " && digit[1][0]== " " && digit[1][1]== "_" && digit[1][2]== "|" && digit[2][0]== " " && digit[2][1]== "_" && digit[2][2]== "|"){
            numberDef = "3";
        //return "3";
        } else if (digit[0][0]== " " && digit[0][1]== " " && digit[0][2]== " " && digit[1][0]== "|" && digit[1][1]== "_" && digit[1][2]== "|" && digit[2][0]== " " && digit[2][1]== " " && digit[2][2]== "|"){
            numberDef = "4";
        //return "4";
        } else if (digit[0][0]== " " && digit[0][1]== "_" && digit[0][2]== " " && digit[1][0]== "|" && digit[1][1]== "_" && digit[1][2]== " " && digit[2][0]== " " && digit[2][1]== "_" && digit[2][2]== "|"){
            numberDef = "5";
        //return "5";
        } else if (digit[0][0]== " " && digit[0][1]== "_" && digit[0][2]== " " && digit[1][0]== "|" && digit[1][1]== "_" && digit[1][2]== " " && digit[2][0]== "|" && digit[2][1]== "_" && digit[2][2]== "|"){
            numberDef = "6";
        //return "6";
        } else if (digit[0][0]== " " && digit[0][1]== "_" && digit[0][2]== " " && digit[1][0]== " " && digit[1][1]== " " && digit[1][2]== "|" && digit[2][0]== " " && digit[2][1]== " " && digit[2][2]== "|"){
            numberDef = "7";
        //return "7";
        } else if (digit[0][0]== " " && digit[0][1]== "_" && digit[0][2]== " " && digit[1][0]== "|" && digit[1][1]== "_" && digit[1][2]== "|" && digit[2][0]== "|" && digit[2][1]== "_" && digit[2][2]== "|"){
            numberDef = "8";
        //return "8";
        } else if (digit[0][0]== " " && digit[0][1]== "_" && digit[0][2]== " " && digit[1][0]== "|" && digit[1][1]== "_" && digit[1][2]== "|" && digit[2][0]== " " && digit[2][1]== "_" && digit[2][2]== "|"){
            numberDef = "9";
        //return "9";
        } else {
            numberDef = "?";
        }
        return numberDef;

    }
    public String digitoCompleto(){
        theSplit();
        String number = "";
        for (int i=0;i<24;i=i+3){
            number = number + loneDigit(matrixDigit(i)) ;

        }
        return number;

    }

}
