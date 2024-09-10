package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File sourceDirectory = new File(args[0]);
        File resultFile = new File(args[1]);
        File allFilesContent = new File(resultFile.getParent() + "/allFilesContent.txt");
        if (FileUtils.isExist(allFilesContent)) {
            FileUtils.deleteFile(allFilesContent);
        }
        FileUtils.renameFile(resultFile, allFilesContent);
        List<File> list = new ArrayList<>();
        getFiles(sourceDirectory, list);
        try (FileOutputStream outputStream = new FileOutputStream(allFilesContent, true)) {
            for (File file : list) {
                if (file.length() <= 50) {
                    outputStream.write(Files.readAllBytes(file.toPath()));
                    outputStream.write("\n".getBytes());
                }
            }
        }
    }

    private static void getFiles(File sourceDirectory, List<File> list) {
        File[] files = sourceDirectory.listFiles();
        if (Objects.isNull(files)) {
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                getFiles(file, list);
            } else {
                list.add(file);
            }
        }
    }
}
