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
    void move(){

    }

    void print(){

    }



    public static void main(String[] args) {
        List<Horse> horses1 = new ArrayList<>();
        Horse horse1 = new Horse("Marusya", 3,0);
        Horse horse2 = new Horse("Loshad", 3,0);
        Horse horse3 = new Horse("Burka", 3,0);
        horses1.add(horse1);
        horses1.add(horse2);
        horses1.add(horse3);
        Hippodrome hippodrome = new Hippodrome(horses1);
        game = hippodrome;
    }
}
