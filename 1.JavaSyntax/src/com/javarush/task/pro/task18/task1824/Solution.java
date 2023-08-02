package com.javarush.task.pro.task18.task1824;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/* 
Из потока данных — в map
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        //return stringStream.map(e -> e.split(",")).collect(Collectors.toMap(e -> e[0], e -> e[0].length()));
        return stringStream.collect(Collectors.toMap(e -> e, e -> e.length()));

        //stringStream.collect(toMap(word -> word, String::length));
    }
}
