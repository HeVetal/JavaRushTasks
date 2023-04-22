package com.javarush.task.pro.task11.task1101;

/* 
Солнечная система — наш дом
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println("Человечество живет в Солнечной системе.");
        System.out.printf("Ее возраст около %d лет.%n", SolarSystem.age);
        System.out.printf("В Солнечной системе %d известных планет.%n", SolarSystem.planetsCount);
        System.out.printf("Как и большинство звездных систем, состоит из %d звезды.%n", SolarSystem.starsCount);
        System.out.printf("Звезды по имени %s.%n", SolarSystem.starName);
        System.out.printf("Расстояние к центру галактики составляет %d световых лет.%n", SolarSystem.galacticCenterDistance);
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
