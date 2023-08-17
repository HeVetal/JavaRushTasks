package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    public Solution(int a, int b){}
    private Solution(String s, String t){}
    Solution(int a, String s){}

    protected Solution(String s, int a){}
}

