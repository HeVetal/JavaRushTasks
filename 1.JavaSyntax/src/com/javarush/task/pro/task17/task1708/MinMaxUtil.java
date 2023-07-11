package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public static int max(int one, int two){
        return Math.max(one, two);
    }

    public static int max(int one, int two, int three){
        return Math.max(one, Math.max(two, three));
    }

    public static int max(int one, int two, int three, int four){
        return Math.max(Math.max(one,four), Math.max(two, three));
    }

    public static int max(int one, int two, int three, int four, int five){
        return Math.max(Math.max(Math.max(one,four), Math.max(two, three)), five);
    }

    public static int min(int one, int two){
        return Math.min(one, two);
    }

    public static int min(int one, int two, int three){
        return Math.min(one, Math.min(two, three));
    }

    public static int min(int one, int two, int three, int four){
        return Math.min(Math.min(one,four), Math.min(two, three));
    }

    public static int min(int one, int two, int three, int four, int five){
        return Math.min(Math.min(Math.min(one,four), Math.min(two, three)), five);
    }
}
