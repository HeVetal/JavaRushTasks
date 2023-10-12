package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                String str = reader.readLine();
                //String[] strings = str.split(" ");
                String[] strings = str.split("\\b");
                //String regex = "\\p{Punct}";
                for (String string : strings) {
                    try {
                        if (map.containsKey(Integer.parseInt(string))) {
                            String number = map.get(Integer.parseInt(string));
                            System.out.print(string.replaceAll(string, number));
                        } else {
                            System.out.print(string);
                        }
                    } catch (NumberFormatException e) {
                        System.out.print(string);
                    }
                }
                System.out.println();
//                for (String string : strings) {
//                    String s = string.replaceAll(regex, "");
//                    try {
//
//                        if (map.containsKey(Integer.parseInt(s))) {
//                            String number = map.get(Integer.parseInt(s));
//                            System.out.print(string.replaceAll(s, number) + " ");
//                        } else {
//                            System.out.print(string + " ");
//                        }
//                        Integer.parseInt(s);
//                    } catch (NumberFormatException e) {
//                        System.out.print(string + " ");
//
//                    }
//                }
                //System.out.println();
            }
        }
    }
}
