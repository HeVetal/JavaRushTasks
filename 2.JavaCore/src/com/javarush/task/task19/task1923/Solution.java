package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            while ((file1.ready())) {
                String str = file1.readLine();
                String[] words = str.split(" ");
                for (String word : words) {
                    String regex = ".*\\d+.*";
                    if (word.matches(regex)) {
                        writer.write(word + " ");
                    }
                }
            }
        }
    }
}
