package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] numbers = new int[3];
            numbers[4] = 3;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\"));
            String firstLine = reader.readLine();
        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            Object o = new Object();
            o = null;
            System.out.println(o.toString());
         } catch (Exception e){
            exceptions.add(e);
            exceptions.add(new RuntimeException());
            exceptions.add(new IOException());
            exceptions.add(new InterruptedIOException());
            exceptions.add(new ArrayStoreException());
            exceptions.add(new ClassNotFoundException());
            exceptions.add(new NumberFormatException());
        }



    }
}
