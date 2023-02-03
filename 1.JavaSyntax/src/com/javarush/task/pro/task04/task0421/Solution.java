package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

public class Solution {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        while (count <= 100) {
            if (count % 2 == 0) {
                sum += count;
            }
            count++;

        }
        System.out.println(sum);
    }
}