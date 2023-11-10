package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse hors : horses) {
            hors.move();
        }
    }

    void print() {
        for (Horse hors : horses) {
            hors.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse horse = null;
        for (int i = 0; i < horses.size(); i++) {
            if (i == 0) {
                horse = horses.get(i);
            }
            if (horses.get(i).getDistance() > horse.getDistance()) {
                horse = horses.get(i);
            }
        }
        return horse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().name + "!");
    }


    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        Horse horse1 = new Horse("Marusya", 3, 0);
        Horse horse2 = new Horse("Loshad", 3, 0);
        Horse horse3 = new Horse("Burka", 3, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        Hippodrome hippodrome = new Hippodrome(horses);
        game = hippodrome;
        game.run();
        game.printWinner();
    }
}
