package com.javarush.task.task23.task2312;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
        game = this;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Основной цикл программы.
     * Тут происходят все важные действия
     */
    public void run() {
        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //пока змея жива
        while (snake.isAlive()) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                //Если равно символу 'q' - выйти из игры.
                if (event.getKeyChar() == 'q') return;

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                    //Если "стрелка вверх" - сдвинуть фигурку вверх
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                    //Если "стрелка вниз" - сдвинуть фигурку вниз
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();   //двигаем змею
            print();        //отображаем текущее состояние игры
            sleep();        //пауза между ходами
        }

        System.out.println("Game Over!");
    }

    public void print() {
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        int[][] matrix = new int[height][width];

        //Рисуем все кусочки змеи
        ArrayList<SnakeSection> sections = new ArrayList<SnakeSection>(snake.getSections());
        for (SnakeSection snakeSection : sections) {
            matrix[snakeSection.getY()][snakeSection.getX()] = 1;
        }

        //Рисуем голову змеи (4 - если змея мертвая)
        matrix[snake.getY()][snake.getX()] = snake.isAlive() ? 2 : 4;

        //Рисуем мышь
        matrix[mouse.getY()][mouse.getX()] = 3;

        //Выводим все это на экран
        String[] symbols = {".", "x", "X", "^", "*"};
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(symbols[matrix[y][x]]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public void eatMouse() {
        createMouse();
    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }

    public static void main(String[] args) {
        game = new Room(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }

    public void sleep() {
        // делаем паузу, длинна которой зависит от длинны змеи
        int initDelay = 520;
        int delayStep = 20;
        int level = snake.getSections().size();
        int delay = level < 15 ? initDelay - delayStep * level : 200;
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        switch (snake.getSections().size()) {
//            case 1:
//                Thread.sleep(500);
//            case 2:
//                Thread.sleep(480);
//            case 3:
//                Thread.sleep(460);
//            case 4:
//                Thread.sleep(440);
//            case 5:
//                Thread.sleep(420);
//            case 6:
//                Thread.sleep(400);
//            case 7:
//                Thread.sleep(380);
//            case 8:
//                Thread.sleep(360);
//            case 9:
//                Thread.sleep(340);
//            case 10:
//                Thread.sleep(320);
//            case 11:
//                Thread.sleep(300);
//            case 12:
//                Thread.sleep(275);
//            case 13:
//                Thread.sleep(250);
//            case 14:
//                Thread.sleep(225);
//            case 15:
//                Thread.sleep(200);
//            default:
//                Thread.sleep(200);
//        }
    }
}
