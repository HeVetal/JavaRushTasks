package com.javarush.task.pro.task09.task0923;

/* 
Ранг доступа — Пиратский Капитан
*/


import static com.javarush.task.pro.task09.task0923.CaptainBridge.*;


public class Solution {
    public static void main(String[] args) {
        String[] ranks = {"Раб", "Гость", "Боец", "Ветеран", "Картографист", "Капитан", "Стив"};
        for (String rank : ranks) {
            if(debugAccess(rank)){
                checkAccess(rank);
                break;
            }
        }
    }
}
