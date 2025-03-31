package com.javarush.task.task29.task2901;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/* 
Рефакторинг в соответствии с Naming and Code Convention
*/

public class Solution {
    public static final String defaultFileName = "C:/tmp/strange_file_name.tmp";

    private final String localFileName;
    private List<String> contentAslines;
    private boolean fileLoaded;

    public Solution(String firstFileName) {
        localFileName = firstFileName == null ? defaultFileName : firstFileName;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = Solution.class.getResource("Solution.java").getPath();

        Solution solution = new Solution(fileName);
        solution.DownloadFileContent();
        if (solution.getFileLoaded()) {
            System.out.println(solution.isexpectedline("public class Solution {"));   // Expected true
            System.out.println(solution.isexpectedline(" public class Solution {"));  // Expected false
        }
    }

    public boolean getFileLoaded() {
        return fileLoaded;
    }

    public void DownloadFileContent() {
        try {
            contentAslines = Files.readAllLines((new File(localFileName)).toPath(), Charset.defaultCharset());
            fileLoaded = true;
        } catch (IOException e) {
            System.out.println("Unsuccessful. What a surprise!");
        }
    }

    public boolean isexpectedline(String expectedline) {
        return contentAslines.contains(expectedline);
    }
}
