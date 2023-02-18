package com.javarush.task.pro.task06.task0603;

/* 
Любимое блюдо
*/

public class Solution {

    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        printPersonInfo(firstName, lastName, favouriteDish);
    }
    
    public static void printPersonInfo(String firstName, String lastName, String favouriteDish){
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Любимое блюдо: " + favouriteDish);
    }
    
}
