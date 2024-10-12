package com.javarush.task.task22.task2213;

public class Figure {
    private int x;
    private int y;
    private int[][] matrix;

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void left(){
        x--;
        if (!isCurrentPositionAvailable())
            x++;
    }

    public void right(){

        x++;
        if (!isCurrentPositionAvailable())
            x--;;
    }

    public void down(){

        y++;
    }

    public void up(){
        y--;
    }

    public void rotate(){
        int[][] matrix2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = matrix[j][i];
            }
        }
    }

    public void downMaximum(){}

    public boolean isCurrentPositionAvailable(){
        return true;
    }

    public void landed(){}
}
