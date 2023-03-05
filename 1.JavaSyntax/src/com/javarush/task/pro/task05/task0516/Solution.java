package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
//        for (int i = 0; i < array.length; i++) {
//            if(i <= array.length / 2){
//                array[i] = valueStart;
//            }else{
//                array[i] = valueEnd;
//            }
//        }
        //Arrays.fill(array,);
        System.out.println(Arrays.toString(array));
    }
}
