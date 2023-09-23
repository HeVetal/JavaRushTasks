package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String output = reader.readLine();
            FileInputStream inputStream = new FileInputStream(reader.readLine());
            FileInputStream inputStream1 = new FileInputStream(reader.readLine());
            FileOutputStream outputStream = new FileOutputStream(output);
            while (inputStream.available() > 0) {
                list.add(inputStream.read());
            }
            for (int i = 0; i < list.size(); i++) {
                outputStream.write(list.get(i));
            }
            outputStream = new FileOutputStream(output, true);
            list.clear();
            while (inputStream1.available() > 0) {
                list.add(inputStream1.read());
            }
            for (int i = 0; i < list.size(); i++) {
                outputStream.write(list.get(i));
            }
            outputStream.close();
            inputStream.close();
            inputStream1.close();
        }
    }
}
