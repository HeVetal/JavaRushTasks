package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()){
            int answer = scanner.nextInt();
            if(min > answer){
                min = answer;
            }
        }
        System.out.println(min);
    }
}