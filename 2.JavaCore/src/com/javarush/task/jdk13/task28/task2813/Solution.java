package com.javarush.task.jdk13.task28.task2813;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
Кеширование нитей
*/

public class Solution {

    public static BlockingQueue<String> queue = new ArrayBlockingQueue<>(32);
    public static ExecutorService executorService;

    public static void main(String[] args) throws Exception {
        executorService = Executors.newCachedThreadPool();

        submitProducers();
        submitConsumers();

        executorService.shutdownNow();
    }

    public static void submitProducers() throws InterruptedException {
        for (int i = 1; i < 101; i++) {
            Runnable task = new Producer("Task N " + i);
            executorService.submit(task);
        }

    }

    public static void submitConsumers() {
        Runnable task = new Consumer();
        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }
    }
}
