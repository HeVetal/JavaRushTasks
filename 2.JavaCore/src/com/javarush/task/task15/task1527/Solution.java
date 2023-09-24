package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        int index = url.lastIndexOf("?");
        String substring = url.substring(index + 1);
        String[] strings = substring.split("&");
        for (String string : strings) {
            String[] attribute = string.split("=");
            System.out.print(attribute[0] + " ");

        }
        System.out.println();
        for (String string : strings) {
            String[] attribute = string.split("=");
            if (string.contains("obj")) {
                try {
                    alert(Double.parseDouble(attribute[1]));
                } catch (NumberFormatException e) {
                    alert(attribute[1]);
                }
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
