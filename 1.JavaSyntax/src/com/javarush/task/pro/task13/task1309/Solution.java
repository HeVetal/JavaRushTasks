package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Vasa", 4.0);
        grades.put("Peta", 4.2);
        grades.put("Max", 3.9);
        grades.put("Bill", 4.5);
        grades.put("Ted", 4.3);
    }
}
