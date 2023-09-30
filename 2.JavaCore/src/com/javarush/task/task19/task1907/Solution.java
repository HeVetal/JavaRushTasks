package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String str = "";
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(console.readLine()))) {
            while (fileReader.ready()) {
                str = str + " " + fileReader.readLine();
            }
        }
        str = str.replaceAll("\\p{Punct}", " ");
        String[] split = str.split("\\s");
        int count = 0;
        for (String s : split) {
            if (s.trim().equalsIgnoreCase("world")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
