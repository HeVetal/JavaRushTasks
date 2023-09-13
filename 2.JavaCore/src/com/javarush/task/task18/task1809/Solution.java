package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        List<Byte> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            while (inputStream.available() > 0) {
                list.add((byte) inputStream.read());
            }
            Collections.reverse(list);
            FileOutputStream outputStream = new FileOutputStream(reader.readLine());
            list.forEach(s -> {
                try {
                    outputStream.write(s);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
