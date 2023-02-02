package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        int number = 0;
        while (!answer.equalsIgnoreCase( "ENTER")){
            int var = Integer.parseInt(answer);
            number += var;
            answer = scanner.nextLine();
            //System.out.println(number);
        }
        System.out.println(number);
    }
}