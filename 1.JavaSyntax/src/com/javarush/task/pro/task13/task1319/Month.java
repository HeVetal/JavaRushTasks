package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths(){
        Month[] winterMonths = {DECEMBER, JANUARY, FEBRUARY};
        return winterMonths;
    }

    public static Month[] getSpringMonths(){
        Month[] springMonths = {MARCH, APRIL, MAY};
        return springMonths;
    }

    public static Month[] getSummerMonths(){
        Month[] summerMonths = {JULY, JUNE, AUGUST};
        return summerMonths;
    }

    public static Month[] getAutumnMonths(){
        Month[] autumnMonths = {SEPTEMBER, NOVEMBER, OCTOBER};
        return autumnMonths;
    }



    //напишите тут ваш код

}
