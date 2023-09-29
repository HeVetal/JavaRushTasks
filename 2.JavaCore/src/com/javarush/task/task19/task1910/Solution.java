package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(console.readLine()))) {
            while (fileReader.ready()) {
                list.add(fileReader.readLine());
            }
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(console.readLine()));
            for (String s : list) {
                s = s.replaceAll("\\p{Punct}", "");
                //s = s.replaceAll(System.lineSeparator(), "");
                fileWriter.write(s);
            }
            fileWriter.close();
        }
    }
}
