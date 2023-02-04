package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 5;i++){
            int answer = scanner.nextInt();
            sum += answer;
        }
        System.out.println(sum / 5);
    }
}
