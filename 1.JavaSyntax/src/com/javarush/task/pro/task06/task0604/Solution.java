package com.javarush.task.pro.task06.task0604;

/* 
Ливерпульская четверка
*/

public class Solution {
    public static void main(String[] args) {
        String navigator = "Джон";
        String pilot = "Пол";
        String secondPilot = "Джордж";
        String flightEngineer = "Ринго";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String name1, String name2, String name3, String name4){
        System.out.println("Четвёрка, которой предстоит покорить космос:");
        System.out.println("Штурман: " + name1);
        System.out.println("Пилот: " + name2);
        System.out.println("Второй пилот: " + name3);
        System.out.println("Бортинженер: " + name4);
    }
}
