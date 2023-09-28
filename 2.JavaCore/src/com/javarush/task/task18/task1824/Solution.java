package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = "";
            while ((fileName = reader.readLine()) != null) {
                try {
                    File file = new File(fileName);
                    FileInputStream fileReader = new FileInputStream(file);
                    fileReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println(fileName);
                    break;

                }
            }
            reader.close();
        }
    }
}
