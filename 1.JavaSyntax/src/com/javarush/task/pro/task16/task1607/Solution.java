package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код
        LocalDate today = LocalDate.now();

        return today;
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        LocalDate twelveSeptember = LocalDate.of(2020, Month.SEPTEMBER, 12);


        return twelveSeptember;
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        LocalDate twelveSeptemberOfYearDay = LocalDate.ofYearDay(2020, ofExample().getDayOfYear());

        return twelveSeptemberOfYearDay;
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        LocalDate twelveSeptemberOfYearDay = LocalDate.ofEpochDay(ofExample().toEpochDay());

        return twelveSeptemberOfYearDay;
    }
}
