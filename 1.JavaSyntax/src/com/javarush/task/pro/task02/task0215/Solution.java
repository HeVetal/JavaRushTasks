package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int one = console.nextInt();
        int two = console.nextInt();
        int three = console.nextInt();
        System.out.println((one + two + three)/3);
    }
}
