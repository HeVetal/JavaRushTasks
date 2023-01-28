package com.javarush.task.pro.task03.task0317;

import java.util.Scanner;

/* 
Пищевой конвеер
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <4; i++){
            int answer = scanner.nextInt();
            if(answer > 0){
                System.out.println(answer);
            }
        }
    }
}
