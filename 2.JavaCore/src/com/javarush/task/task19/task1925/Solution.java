package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            while (reader.ready()) {
                String str = reader.readLine();
                String[] strings = str.split(" ");
                for (int i = 0; i < strings.length; i++) {
                    if (strings[i].length() > 6) {
                        list.add(strings[i]);
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i));
                if (i < list.size() - 1) {
                    writer.write(",");
                }
            }
        }
    }
}
