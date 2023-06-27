package com.javarush.task.pro.task16.task1604;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
/*
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1990, Calendar.APRIL, 10);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));

    }

    static String getDayOfWeek(Calendar calendar) {
//        SimpleDateFormat formater = new SimpleDateFormat("EEEE");
//        Date date = calendar.getTime();
//        String dayOfWeek = formater.format(date);
        int numberDay = calendar.get(Calendar.DAY_OF_WEEK);
        String dayWeek = "";
        switch (numberDay) {
            case 1 -> dayWeek = "Воскресенье";
            case 2 -> dayWeek = "Понедельник";
            case 3 -> dayWeek = "Вторник";
            case 4 -> dayWeek = "Среда";
            case 5 -> dayWeek = "Четверг";
            case 6 -> dayWeek = "Пятница";
            case 7 -> dayWeek = "Суббота";
        }
        return dayWeek;
    }
}
