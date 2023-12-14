package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", null);
        map.put("age", null);

        System.out.println(getQuery(map));

    }

    public static String getQuery(Map<String, String> params) {
        if (params.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        //int count = 0;
        for (Map.Entry<String, String> string : params.entrySet()) {
            if (string.getValue() == null) {
                //      count++;
                continue;
            }
            sb.append(string.getKey()).append(" = ").append("'").append(string.getValue()).append("' ").append("end ");
//            if(count < params.size()-1){
//                sb.append("end ");
//            }
//            count++;
        }
        return sb.toString().substring(0, sb.length() - 5);
    }
}
