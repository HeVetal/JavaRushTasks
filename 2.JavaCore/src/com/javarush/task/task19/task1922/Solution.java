package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(console.readLine()))) {
            while (fileReader.ready()) {
                String str = fileReader.readLine();
                String[] split = str.split(" ");
                int count = 0;
//                for (String s : split) {
//                    for (String word : words) {
//                        if (s.equals(word)) {
//                            count++;
//                        }
//                    }
//                }
                for (String s : split) {
                    if(words.contains(s)){
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(str);
                }
            }
        }
    }
}
