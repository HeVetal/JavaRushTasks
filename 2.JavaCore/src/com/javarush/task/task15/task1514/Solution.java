package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>(){{
        put(994.43, "sg");
        put(548.22,"we");
        put(48.22,"wa");
        put(58.22,"wr");
        put(54.22,"wh");

    }};


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
