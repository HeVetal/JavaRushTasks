package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

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
        if (words == null || words.length == 0) {
            return new StringBuilder();
        }
        List<StringBuilder> builderList = new ArrayList<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                String firstStart = builder.substring(0, 1);
                String firstEnd = builder.substring(builder.length() - 1);

                String secondStart = list.get(i).substring(0, 1);
                String secondEnd = list.get(i).substring(list.get(i).length() - 1);

                if (firstEnd.equalsIgnoreCase(secondStart)) {
                    builder.append(" ").append(list.get(i));
                } else if (firstStart.equalsIgnoreCase(secondEnd)) {
                    builder.insert(0, list.get(i) + " ");
                } else {
                    String string = list.get(i);
                    list.remove(string);
                    i--;
                    list.add(string);
                    count++;
                    if (count > 1000) {
                        break;
                    }
                }
            }
            builderList.add(builder);
        }
        return builderList.stream().max(Comparator.comparingInt(StringBuilder::length)).get();
    }
}
