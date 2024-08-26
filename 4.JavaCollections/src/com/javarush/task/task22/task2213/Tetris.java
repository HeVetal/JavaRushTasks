package com.javarush.task.task22.task2213;

public class Tetris {
    private Field field;
    private Figure figure;
    static Tetris game;

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    public void run(){}

    public void step(){}

    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        game = tetris;
        game.run();
    }
}
