package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //...
        String[] array = null;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                String text = reader.readLine();
                array = text.split(" ");
            }
        }
        StringBuilder result = getLine(array);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder builder = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            String firstStart = builder.substring(0, 1);
            String firstEnd = builder.substring(builder.length() - 1);

            String secondStart = words[i].substring(0, 1);
            String secondEnd = words[i].substring(words[i].length() - 1);

            if (firstEnd.equalsIgnoreCase(secondStart)) {
                builder.append(" ").append(words[i]);
            } else if (firstStart.equalsIgnoreCase(secondEnd)) {
                builder.insert(0, words[i] + " ");
            }
        }
        return builder;
    }
}
