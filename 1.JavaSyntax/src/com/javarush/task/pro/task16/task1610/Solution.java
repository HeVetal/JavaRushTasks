package com.javarush.task.pro.task16.task1610;

import java.time.LocalTime;

/* 
Тренировка на время
*/

public class Solution {

    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.of(14,00);
    static LocalTime time2 = LocalTime.of(7,0,8);
    static LocalTime time3 = LocalTime.of(0,45,00,61);
    static LocalTime time4 = LocalTime.of(14,00,45, 1001);

    public static void main(String[] args) {
        //напишите тут ваш код
        LocalTime now = LocalTime.of(time1.getHour(), time2.getMinute(), time3.getSecond(), time4.getNano());
        System.out.println(now);

    }
}
