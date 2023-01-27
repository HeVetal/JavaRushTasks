package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String one = console.nextLine();
        String two = console.nextLine();
        String three = console.nextLine();

        System.out.println(three);
        System.out.println(two.toUpperCase());
        System.out.println(one.toLowerCase());
    }
}
