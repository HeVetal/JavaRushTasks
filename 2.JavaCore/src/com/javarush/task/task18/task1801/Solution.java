package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            int maxByte = 0;
            int currentByte;
            while (inputStream.available() > 0){
                currentByte = inputStream.read();
                if(maxByte < currentByte){
                    maxByte = currentByte;
                }
            }
            System.out.println(maxByte);
        }
    }
}
