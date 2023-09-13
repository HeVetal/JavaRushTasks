package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        List<Byte> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine());
             FileOutputStream outputStream = new FileOutputStream(reader.readLine());
             FileOutputStream outputStream1 = new FileOutputStream(reader.readLine())) {
            while (inputStream.available() > 0) {
                list.add((byte) inputStream.read());
            }
            int half = list.size() % 2 == 0 ? list.size() / 2 : list.size() / 2 + 1;

            for (int i = 0; i < list.size(); i++) {

                if (i < half) {
                    outputStream.write(list.get(i));
                } else {
                    outputStream1.write(list.get(i));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
