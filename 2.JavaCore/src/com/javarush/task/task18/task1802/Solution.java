package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
             FileInputStream input = new FileInputStream(reader.readLine())) {
            int minByte = Integer.MAX_VALUE;
            while (input.available() > 0) {
                int currentByte = input.read();
                minByte = Math.min(minByte, currentByte);
            }
            System.out.println(minByte);
        }
    }
}
