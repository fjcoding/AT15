package org.fundacionjala.at15.katas.langtonant.adrian;

public class Board {
    int width;
    int height;
    int[][] tablero;

    public Board(int width, int height){
        this.width=width;
        this.height=height;
        tablero = new int[height][width];
        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero[i].length;j++){
                tablero[i][j]=0;
                //System.out.print(tablero[i][j]+" ");
            }
            //System.out.println();
        }
    }
    
    public void print(){
        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero[i].length;j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] getTablero() {
        return tablero;
    }
    public int getPosTablero(int y, int x) {
        return tablero[y][x];
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    public void setPos0(int y, int x){
        tablero[y][x]=0;
    }
    public void setPos1(int y, int x){
        tablero[y][x]=1;
    }
}
