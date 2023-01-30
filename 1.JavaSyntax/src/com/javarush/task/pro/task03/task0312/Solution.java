package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String wordOne = scanner.nextLine();
        String wordTwo = scanner.nextLine();
        if(wordOne.equals(wordTwo)) {
            System.out.println("строки одинаковые");
        }else {
            //напишите тут ваш код
            System.out.println("строки разные");
        }
    }
}
