package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new TreeMap<>();
        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(args[0]))) {
            while (reader.available() > 0){
                char read = (char) reader.read();
                if(map.containsKey(read)){
                    map.put(read,map.get(read) + 1);
                } else {
                    map.put(read,1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
