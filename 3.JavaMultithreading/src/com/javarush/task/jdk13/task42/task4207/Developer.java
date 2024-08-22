package com.javarush.task.jdk13.task42.task4207;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Developer implements Callable<Boolean> {
    private AtomicInteger codeLines;
    private CountDownLatch countDownLatch;

    public Developer(AtomicInteger codeLines, CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.codeLines = codeLines;
    }

    @Override
    public Boolean call() {
        while (countDownLatch.getCount() > 0) {
            System.out.printf("Написано %d строк кода.\n", codeLines.addAndGet(1000));
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException ignored) {
            }
            countDownLatch.countDown();
        }
        return true;
    }
}
