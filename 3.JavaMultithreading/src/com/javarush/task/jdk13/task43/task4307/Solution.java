package com.javarush.task.jdk13.task43.task4307;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.Objects;

/* 
Шило на мыло
*/

public class Solution {

    public static void main(String[] args) {
        String[] array1 = {null, "hello", "ok", null, "bye"};

        printFirstNonNull(array1);
        System.out.println("----------");
        printDefaultValueIfNullObject(array1, "oops");
    }

    public static void printFirstNonNull(final String... values) {
//        if(!Objects.isNull(values)){
//            for (String value : values) {
//                if(Objects.nonNull(value)){
//                    System.out.println(value);
//                    break;
//                }
//            }
//        }
        System.out.println(Arrays.stream(values).filter(Objects::nonNull).findFirst().get());
    }

    public static void printDefaultValueIfNullObject(final String[] values, final String defaultValue) {
//        for (String o : values) {
//            System.out.println(ObjectUtils.defaultIfNull(o, defaultValue));
//        }
//        for (String value : values) {
//            System.out.println(Objects.requireNonNullElse(value, defaultValue));
////        }

//        Arrays.asList(values).replaceAll(s -> Objects.isNull(s) ? defaultValue : s);
//        Arrays.stream(values).forEach(System.out::println);
        Arrays.stream(values).map(s -> s != null ? s : defaultValue).forEach(System.out::println);
    }
}
