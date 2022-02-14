package org.fundacionjala.at15.katas.bankocr.sergio;

public class MatrixArch {
    private Splitter splitA;
    private String lineOneArrayM[];
    private String lineTwoArrayM[];
    private String lineThreeArrayM[];

    public MatrixArch(Splitter currentSplitA){
        this.splitA = currentSplitA;
        splitA.theSplit();
        this.lineOneArrayM = splitA.getLineOneArray();
        this.lineTwoArrayM = splitA.getLineTwoArray();
        this.lineThreeArrayM = splitA.getLineThreeArray();
    }
    // public MatrixArch(String[] lineOneArray, String[] lineTwoArray, String[] lineThreeArray){
    //     this.lineOneArrayM = lineOneArray;
    //     this.lineTwoArrayM = lineTwoArray;
    //     this.lineThreeArrayM = lineThreeArray;
    // }

    public String [][] matrixDigit(int start){

        String [][] resp = new String[3][3];
        int pos1 = start;
        int pos2 = start +1;
        int pos3 = start +2;

        resp[0][0] = lineOneArrayM[pos1];
        resp[0][1] = lineOneArrayM[pos2];
        resp[0][2] = lineOneArrayM[pos3];

        resp[1][0] = lineTwoArrayM[pos1];
        resp[1][1] = lineTwoArrayM[pos2];
        resp[1][2] = lineTwoArrayM[pos3];

        resp[2][0] = lineThreeArrayM[pos1];
        resp[2][1] = lineThreeArrayM[pos2];
        resp[2][2] = lineThreeArrayM[pos3];

        return resp;
    }
}