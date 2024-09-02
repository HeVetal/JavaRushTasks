package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) {
//        Path path = Path.of(args[0]);
//        Path resultFileAbsolutePath = Paths.get(args[1]);
//        FileUtils.renameFile(resultFileAbsolutePath, Paths.get(allFilesContent.txt));
        String path = args[0];
        String resultFileAbsolutePath = args[1];
        try {
            File resultFile = new File(resultFileAbsolutePath);
            File dest = new File(resultFile.getParentFile() + "/allFilesContent.txt ");
            FileUtils.renameFile(resultFile, dest);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
