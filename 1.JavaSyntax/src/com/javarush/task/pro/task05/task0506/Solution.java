package com.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();

        }
        Arrays.sort(array);
        System.out.println(array[0]);

    }
}
