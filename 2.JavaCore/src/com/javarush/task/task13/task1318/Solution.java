package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try (InputStream ins = new FileInputStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(ins)))
        {

            while (reader.ready()) {
                System.out.println(reader.readLine());
            }


        } catch(IOException e){
            throw new RuntimeException(e);
        }

    }
}