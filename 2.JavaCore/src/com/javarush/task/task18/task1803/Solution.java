package com.javarush.task.task18.task1803;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                if (map.containsKey(read)) {
                    Integer i = map.get(read);
                    map.put(read, ++i);
                } else {
                    map.put(read, 1);
                }
            }
        }
        int max = 0;
        for (Integer value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main1(String[] args) throws IOException {
//        Map<Integer, Integer> map = new HashMap<>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        byte[] bytes = Files.readAllBytes(Path.of(reader.readLine()));
//        IntStream.range(0, bytes.length).forEach(i -> map.merge((int) bytes[i], 1, Integer::sum));
//        map.entrySet().stream()
//                .filter(pair -> Objects.equals(pair.getValue(), map.values().stream().max(Integer::compareTo).get()))
//                .forEach(pair -> System.out.print(pair.getKey() + " "));

        byte[] bytes = Files.readAllBytes(Path.of(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        HashMap<Byte, Integer> map = IntStream.range(0, bytes.length).boxed().collect(Collectors.toMap(i -> bytes[i], i -> 1, Integer::sum, HashMap::new));
        map.entrySet().stream().filter(pair -> Objects.equals(pair.getValue(), map.values().stream().max(Integer::compareTo).orElseThrow()))
                .forEach(pair -> System.out.print(pair.getKey() + " "));
    }
}
