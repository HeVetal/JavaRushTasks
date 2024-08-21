package com.javarush.task.jdk13.task42.task4203;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/* 
10 плюс 20 будет 20
*/

public class Solution {
    private static final int THREAD_POOL_SIZE = 10;
    private static final int COUNT = 20;
    private static final int TIMEOUT = 10;

    private static final Integer[] ARRAY = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final CopyOnWriteArrayList<Integer> LIST = new CopyOnWriteArrayList<>(List.of(ARRAY));

    public static void main(String[] args) throws InterruptedException {
        System.out.print("List before: ");
        printList(LIST);

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        IntStream.rangeClosed(1, COUNT).forEach(i -> executor.submit(() -> LIST.addIfAbsent(i)));

        executor.awaitTermination(TIMEOUT, TimeUnit.MILLISECONDS);

        executor.shutdown();

        System.out.print("List  after: ");
        printList(LIST);
    }

    private static void printList(List<Integer> list) {
        String delimiter = "";
        for (Integer integer : list) {
            System.out.print(delimiter + integer);
            delimiter = ", ";
        }
        System.out.println();
    }
}
