package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(console.readLine()))) {
            while (fileReader.ready()) {
                builder.append(fileReader.readLine());
            }
            String str = builder.toString().replaceAll("\\.", "!");
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(console.readLine()));
            fileWriter.write(str);
            fileWriter.close();
        }
    }
}
