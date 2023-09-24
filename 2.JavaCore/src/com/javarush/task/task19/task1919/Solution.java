package com.javarush.task.task19.task1919;

import java.io.*;
import java.nio.file.Files;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String str = reader.readLine();
                String[] strings = str.split(" ");
                String name = strings[0];
                Double value = Double.parseDouble(strings[1]);
                if (!map.containsKey(name)) {
                    map.put(name, value);
                } else {
                    map.put(name, map.get(name) + value);
                }
            }
        }
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

//    public static void main1(String[] args) throws IOException {
//        Files.readAllLines(Path.of(args[0]))
//                .stream()
//                .collect(Collectors.toMap(
//                        string -> string.split("\\s")[0],
//                        string -> Double.parseDouble(string.split("\\s")[1]),
//                        Double::sum,
//                        TreeMap::new))
//                .forEach((k, v) -> System.out.println(k + " " + v));
//    }
}
