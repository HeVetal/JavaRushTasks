package com.javarush.task.task24.task2413;

import java.util.List;

public class Arkanoid {
    private Ball ball;

    private Stand stand;
    private List<Brick> bricks;
    private int width;
    private int height;
    static Arkanoid game;

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void run() {

    }

    public void move() {
        ball.move();
        stand.move();

    }

    public void draw(Canvas canvas) {
        ball.draw(canvas);
        stand.draw(canvas);
        for (Brick brick : bricks) {
            brick.draw(canvas);
        }
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
