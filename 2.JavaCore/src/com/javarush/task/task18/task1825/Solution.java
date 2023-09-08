package com.javarush.task.task18.task1825;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string;
            while (!(string = reader.readLine()).equals("end")) {
                int index = string.lastIndexOf("t");
                String str = string.substring(index + 1);
                int key = Integer.parseInt(str);
                if (!map.containsKey(key)) {
                    map.put(key, string);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String fileName : map.values()) {
            int index = fileName.lastIndexOf(".");
            String shortName = fileName.substring(0, index);
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
                 BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(shortName))) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
