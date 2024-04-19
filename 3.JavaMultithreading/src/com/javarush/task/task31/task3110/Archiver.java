package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите полный путь архива");
            ZipFileManager zipFileManager = new ZipFileManager(Paths.get(reader.readLine()));

            System.out.println("Веведите путь к файлу для архивации");
            zipFileManager.createZip(Paths.get(reader.readLine()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
