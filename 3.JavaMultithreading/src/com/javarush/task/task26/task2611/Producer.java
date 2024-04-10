package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        int counter = 1;
        try {
            while (true) {
                map.put(String.valueOf(counter),
                        "Some text for " + counter++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.printf("[%s] thread was terminated%n", Thread.currentThread().getName());
        }
    }
}
