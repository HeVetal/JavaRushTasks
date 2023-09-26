package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader(args[0])) {
            double countSpaces = 0;
            double countLetters = 0;
            while (reader.ready()) {
                int bytes = reader.read();
                if (bytes == ' ') {
                    countSpaces++;
                }
                countLetters++;
            }
            System.out.println(Math.round(((countSpaces / countLetters * 100.0)) * 100.0) /100.0 );
        }

    }
}
