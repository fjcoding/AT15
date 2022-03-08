package org.fundacionjala.at15.katas.calculator;

public abstract class Operation {

    public abstract int run(int leftOperand, int rightOperand);
    public abstract int run(int numA, int numB, int numC);
    public abstract int run(int numA, int numB, int numC, int numD);
    public abstract int run(int numA, int numB, int numC, int numD, int numE);
    public abstract int run(int numA, int numB, int numC, int numD, int numE, int numF);
    public abstract int run(int numA, int numB, int numC, int numD, int numE, int numF, int numG);
    public abstract int run(int numA, int numB, int numC, int numD, int numE, int numF, int numG, int numH);
}
