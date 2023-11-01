package com.javarush.task.jdk13.task35.task3507;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
        List<String> list = newArrayList("First", "Second");
    }

    public static <T> List<T> newArrayList(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static <T> Set<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public static <K, V> Map<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        }
//        Map<K, V> map = new HashMap<>();
//        for (int i = 0; i < keys.size(); i++) {
//            map.put(keys.get(i), values.get(i));
//        }
//        return map;
        return IntStream.range(0, keys.size()).boxed().collect(Collectors.toMap(keys::get, values::get, (a, b) -> b, HashMap::new));
    }
}

