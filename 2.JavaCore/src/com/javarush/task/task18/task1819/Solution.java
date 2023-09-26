package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> file1 = new ArrayList<>();
        String firstFile;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            firstFile = reader.readLine();
            String secondFile = reader.readLine();

            BufferedReader reader1 = new BufferedReader(new FileReader(firstFile));
            BufferedReader reader2 = new BufferedReader(new FileReader(secondFile));

            while (reader2.ready()){
                file1.add(reader2.readLine());
            }
            while (reader1.ready()){
                file1.add(reader1.readLine());
            }
            reader1.close();
            reader2.close();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(firstFile));
        for (String s : file1) {
            writer.write(s);
        }
        writer.close();

    }
}
