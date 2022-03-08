package org.fundacionjala.at15.katas.calculator;

public class SumOperation extends Operation {

    public int run(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }

    public int run(int numA, int numB, int numC) {
        return numA + numB + numC;
    }

    public int run(int numA, int numB, int numC, int numD) {
        return numA + numB + numC + numD;
    }

    public int run(int numA, int numB, int numC, int numD, int numE) {
        return numA + numB + numC + numD + numE;
    }

    public int run(int numA, int numB, int numC, int numD, int numE, int numF) {
        return numA + numB + numC + numD + numE + numF;
    }

    public int run(int numA, int numB, int numC, int numD, int numE, int numF, int numG) {
        return numA + numB + numC + numD + numE + numF + numG;
    }

    public int run(int numA, int numB, int numC, int numD, int numE, int numF, int numG, int numH) {
        return numA + numB + numC + numD + numE + numF + numG + numH;
    }
}
