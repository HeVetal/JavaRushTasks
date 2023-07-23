//package com.javarush.task.pro.task16.task1612;
//
//import com.sun.source.tree.LiteralTree;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.util.*;
//import java.util.stream.Collectors;
//
///*
//Синтезируем LocalDateTime
//*/
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
//        printCollection(dateMap.entrySet());
//
//        Set<LocalDateTime> dateSet = convert(dateMap);
//        printCollection(dateSet);
//    }
//
//    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
//        Set<LocalDateTime> answer = new HashSet<>();
//        for (Map.Entry<LocalDate, List<LocalTime>> entry : sourceMap.entrySet()) {
//            for (var time: entry.getValue()) {
//                answer.add(LocalDateTime.of(entry.getKey(),time));
//            }
//        }
//
//        return answer;
//    }
//
//    static void printCollection(Collection<?> collection) {
//        System.out.println("-----------------------------------------------------");
//        collection.forEach(System.out::println);
//    }
//}