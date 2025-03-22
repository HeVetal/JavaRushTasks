package com.javarush.task.task25.task2515;

public class Ufo extends BaseObject {
    public Ufo(double x, double y, double radius) {
        super(x, y, 3);
    }

    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 0, 1, 0, 1},
            {1, 1, 1, 1, 1},
    };

    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y - radius + 1, matrix, 'U');
    }

    public void move(){}

    public void fire(){}
}
