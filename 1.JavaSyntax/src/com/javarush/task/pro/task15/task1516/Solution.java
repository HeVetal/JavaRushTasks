package com.javarush.task.pro.task15.task1516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        try (InputStream stream = System.in;
             InputStreamReader reader = new InputStreamReader(stream);
             BufferedReader buff = new BufferedReader(reader);
        ) {
            Path line;
            while (true){
                line = Path.of(buff.readLine());
                if(Files.isRegularFile(line)){
                    System.out.println(line + THIS_IS_FILE);
                } else if (Files.isDirectory(line)) {
                    System.out.println(line + THIS_IS_DIR);
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
