package com.javarush.task.pro.task05.task0505;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result[] = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = scanner.nextInt();
        }
        if(n % 2 == 0){
            for (int i = result.length - 1; i >= 0; i--) {
                System.out.println(result[i]);
            }
        }else{
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }
}
