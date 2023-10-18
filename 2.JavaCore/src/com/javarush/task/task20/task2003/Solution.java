package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        for (Map.Entry<String, String> string : runtimeStorage.entrySet()) {
            properties.setProperty(string.getKey(), string.getValue());
        }
        properties.store(outputStream, null);
        outputStream.close();
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties propertiesLoad = new Properties();
        propertiesLoad.load(inputStream);
        for (String s : propertiesLoad.stringPropertyNames()) {
            runtimeStorage.put(s, propertiesLoad.getProperty(s));
        }
        inputStream.close();

    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream("C:\\Users\\User\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2003\\test")) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
