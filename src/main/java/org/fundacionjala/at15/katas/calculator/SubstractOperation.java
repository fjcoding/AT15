package org.fundacionjala.at15.katas.calculator;

public class SubstractOperation extends Operation {

    public int run(int []operands) {
        int aux = 0;
        for(int i =0;i<operands.length;i++){
            aux -= operands[i];
        }
        return aux;
    }
}
