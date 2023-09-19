package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            while (inputStream.available() > 0) {
                int number = inputStream.read();
                if (map.containsKey(number)) {
                    map.put(number, map.get(number) + 1);
                } else {
                    map.put(number, 1);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (Integer value : map.values()) {
            if (min > value) {
                min = value;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(min)) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
