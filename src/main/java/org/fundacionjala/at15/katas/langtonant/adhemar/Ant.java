package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Ant {
    int row;
    int column;

    public Ant(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void move(int steps, Grid grid) {
        for (int i = 0; i < steps; i++) {
            System.out.println(grid.getCurrentColor(row, column));
            //turn
            //Change color
            //check border
            //move
        }
    }
}
