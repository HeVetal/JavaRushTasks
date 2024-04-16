package com.javarush.task.task27.task2709;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() {
        try {
            while (!isValuePresent) {
                wait();
            }
        } catch (InterruptedException e) {
        }
        isValuePresent = false;
        System.out.println("Got: " + value);
        notify();
        return value;
    }

    public synchronized void put(int value) {
        try {
            while (isValuePresent) {
                wait();
            }
        } catch (InterruptedException e) {
        }
        this.value = value;
        isValuePresent = true;
        System.out.println("Put: " + value);
        notify();
    }
}
