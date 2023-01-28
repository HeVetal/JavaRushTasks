package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age > 60 || age < 20)
        System.out.println("можно не работать");
    }
}
