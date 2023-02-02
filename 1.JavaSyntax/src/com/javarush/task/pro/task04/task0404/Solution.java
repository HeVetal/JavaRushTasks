package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String letterQ = "Q";
        int countVertical = 0;
        while (countVertical < 5){
            int countHorizon = 0;
            while (countHorizon < 10){
                System.out.print(letterQ);
                countHorizon++;
            }
            System.out.println();
            countVertical++;
        }

    }
}