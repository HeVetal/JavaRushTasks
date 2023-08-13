package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new TreeMap<>();

            while (reader.ready()) {
                String[] strings = reader.readLine().split(" ");
                String key = strings[0];
                Double value = Double.parseDouble(strings[1]);
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + value);
                } else {
                    map.put(key, value);
                }
            }

            //map.forEach((key, value) -> System.out.println(key + " " + value));
            double max = Double.MIN_VALUE;
            Set<String> set = new TreeSet<>();
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    set.clear();
                    set.add(entry.getKey());
                } else if (entry.getValue() == max) {
                    set.add(entry.getKey());
                }
            }
            set.forEach(System.out::println);
        }
    }
}
//    public static void main(String[] args) throws IOException {
//        Map<String, Double> map = new TreeMap<>();
//        Files.readAllLines(Paths.get(args[0])).stream().map(str -> str.split(" "))
//                .forEach(strings -> map.merge(strings[0], Double.parseDouble(strings[1]), Double::sum));
//
//        map.entrySet().stream().filter(entry -> entry.getValue().equals(map.values().stream().max(Double::compare).get())).forEach(entry -> System.out.println(entry.getKey()));
//    }

//    public static void main2(String[] args) throws IOException {
//        TreeMap<String, Double> map = Files.readAllLines(Path.of(args[0])).stream().collect(Collectors
//                .toMap(k -> k.split("\\s")[0], k -> Double.parseDouble(k.split("\\s")[1]), Double::sum, TreeMap::new));
//
//        map.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), map.values().stream().max(Double::compare).orElseThrow()))
//                .forEach(entry -> System.out.println(entry.getKey()));
//    }


