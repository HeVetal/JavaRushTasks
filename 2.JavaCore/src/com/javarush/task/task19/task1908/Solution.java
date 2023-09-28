package com.javarush.task.task19.task1908;

import java.io.*;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(console.readLine()))) {
            while (fileReader.ready()) {
                String str = fileReader.readLine();
                stringBuilder.append(str).append(" ");
            }

            String[] s = stringBuilder.toString().split(" ");
            BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()));
            for (String string : s) {
                int num;
                try {
                    num = Integer.parseInt(string);
                    String num1 = num + " ";
                    writer.write(num1);
                } catch (NumberFormatException ignored) {
                }

            }
            writer.close();
        }
    }
}
