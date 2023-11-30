package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileReader.ready()) {
                builder.append(fileReader.readLine()).append(" ");
            }
        }
        System.out.println(builder);
        String[] split = builder.toString().split(" ");
        List<String> list = new ArrayList<>(List.of(split));
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(list.get(i));
            for (int j = 0; j < list.size(); j++) {
                if (new StringBuilder(list.get(j)).reverse().toString().equals(list.get(i))) {
                    //System.out.println(list.get(j) + j + sb.reverse());
                    Pair pair = new Pair();
                    pair.second = list.get(j);
                    pair.first = list.get(i);
                    list.remove(j);
                    result.add(pair);
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
