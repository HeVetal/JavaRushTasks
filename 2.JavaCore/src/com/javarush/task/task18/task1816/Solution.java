package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        try (FileReader reader = new FileReader(args[0])) {
            int character = 0;
            while (reader.ready()) {
                character = reader.read();
                if ((character >= 'A' && character <= 'Z') ||
                        character >= 'a' && character <= 'z') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
