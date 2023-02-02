package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        String letterB = "Б";
        String spase = " ";
        int height = 0;
        while (height < 10) {
            int wight = 0;
            while (wight < 20) {
                if (wight == 0 || wight == 19) {
                    System.out.print(letterB);
                } else if (height == 0 || height == 9) {
                    System.out.print(letterB);
                } else {
                    System.out.print(spase);
                }
                wight++;

            }
            System.out.println();
            height++;
        }

    }
}