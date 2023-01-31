package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(secret.equalsIgnoreCase(answer)) {
            //напишите тут ваш код
            System.out.println("доступ разрешен");
        }else {
            //напишите тут ваш код
            System.out.println("доступ запрещен");
        }
    }
}
