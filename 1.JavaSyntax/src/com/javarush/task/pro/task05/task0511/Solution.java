package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number;
        multiArray = new int[n][];

        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            multiArray[i] = new int[number];
        }
    }
}
