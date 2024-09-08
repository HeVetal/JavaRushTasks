package com.javarush.task.task22.task2213;

public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("X");
            }
            System.out.println();
        }
    }

    public void removeFullLines() {
    }

    public Integer getValue(int x, int y) {
        return null;
    }

    void setValue(int x, int y, int value) {

    }
}
