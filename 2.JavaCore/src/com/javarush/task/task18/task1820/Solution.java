package com.javarush.task.task18.task1820;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader readerFile = new BufferedReader(new FileReader(reader.readLine()))) {
            String number = "";
            while (readerFile.ready()) {
                number = readerFile.readLine();
            }
            String[] numbers = number.split(" ");
            BufferedWriter writerFile = new BufferedWriter(new FileWriter(reader.readLine(), true));
            for (String s : numbers) {
                int doub = (int) Math.round(Double.parseDouble(s));
                writerFile.write(doub + " ");
            }
            writerFile.close();
        }
    }
}
