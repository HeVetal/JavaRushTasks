package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            int count = 0;
            while (inputStream.available() > 0 ){
                if(inputStream.read() == 44){
                    count++;
                }
            }
            System.out.println(count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
