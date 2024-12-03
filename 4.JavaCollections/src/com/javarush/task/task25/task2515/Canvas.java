package com.javarush.task.task25.task2515;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setPoint(double x, double y, char c) {
        int roundX = (int) Math.round(x);
        int roundY = (int) Math.round(y);
        if (0 <= x  && x < matrix[0].length && 0 <= y && y < matrix.length){
            // matrix[y][x] = c;
        }
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c) {
    }

}