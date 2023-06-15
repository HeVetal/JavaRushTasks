package com.javarush.task.pro.task15.task1518;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
А что же внутри папки?
*/

public class Solution {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)){
            for (Path file : files) {
                if(Files.isRegularFile(file)){
                    System.out.println(file + THIS_IS_FILE);
                } else if (Files.isDirectory(file)) {
                    System.out.println(file + THIS_IS_DIR);
                }
            }
        }
    }
}

