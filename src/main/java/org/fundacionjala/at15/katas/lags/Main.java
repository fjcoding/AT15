package org.fundacionjala.at15.katas.lags;

public class Main {
    public static void main(String[] args) {
        //System.out.println("aloha");

        rentRequest r1 = new rentRequest(0, 5, 10, "AF514");
        rentRequest r2 = new rentRequest(3, 7, 14, "CO5");
        rentRequest r3 = new rentRequest(5, 9, 7, "AF515");
        rentRequest r4 = new rentRequest(6, 9, 8, "BA01");

        rentRequest[] array = {r1, r2, r3, r4};

        System.out.println(bestCombination(array));
    }

    public static int bestCombination(rentRequest[] array){
        int bestCombination = 0;

        
        // put your code here

        return bestCombination;
    }

}
