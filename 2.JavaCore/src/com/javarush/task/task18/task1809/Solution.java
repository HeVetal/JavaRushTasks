package com.javarush.task.task18.task1809;

import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    @SneakyThrows
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine());
             FileOutputStream outputStream = new FileOutputStream(reader.readLine())) {
            while (inputStream.available() > 0) {
                list.add(inputStream.read());
            }
            Collections.reverse(list);
            list.forEach(i -> write(outputStream, i));
        }
    }

    @SneakyThrows
    private static void write(OutputStream outputStream, int index) {
        outputStream.write(index);
    }
}
