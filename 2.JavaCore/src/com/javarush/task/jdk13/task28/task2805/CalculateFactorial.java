package com.javarush.task.jdk13.task28.task2805;

import java.util.concurrent.Callable;

public class CalculateFactorial implements Callable<Long> {

    private Long number;

    public CalculateFactorial(Long number) {
        this.number = number;
    }

    public static Long calculate(Long number) {
        long result = 1L;
        while (number > 1) {
            result *= number;
            number--;
        }
        return result;
    }

    @Override
    public Long call() throws Exception {
        long result = 1L;
        while (number > 1) {
            result *= number;
            number--;
        }
        return result;
    }
}
