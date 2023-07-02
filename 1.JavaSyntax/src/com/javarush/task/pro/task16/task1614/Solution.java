package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишите тут ваш код
        Instant time = Instant.ofEpochMilli(Long.MAX_VALUE);

        return time;
    }

    static Instant getMaxFromSeconds() {
        //напишите тут ваш код
        Instant time = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());

        return time;
    }

    static Instant getMaxFromSecondsAndNanos() {
        //напишите тут ваш код
        Instant time = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());

        return time;
    }
}
