package org.fundacionjala.at15.katas.langtonant.jimy;
public class Board {
    private int rows;
    private int columns;
    private int[][] board;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        board = new int[rows][columns];
        fillBoard();
    }

    //fill grid with "0"
    public void fillBoard() {
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                board[rowIndex][columnIndex] = 1;
            }
        }
    }

    public void printBoard() {
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                System.out.print(board[rowIndex][columnIndex] + "  ");
            }
            System.out.println();
        }
    }

    public int getPosition(int x, int y) {
        return board[x][y];
    }

    //change board´s cell state
    public void changeStatePosition(int x, int y) {
        if (board[x][y] == 1) {
            board[x][y] = 0;
        } else {
            board[x][y] = 1;
        }
    }

    public int getRows() {
        return board.length;
    }

    public int getColumns() {
        return board[0].length;
    }
}