package com.javarush.task.pro.task09.task0924;

/* 
Взлом Стального Стива
*/

import java.util.Arrays;

public class Solution {

    public static String[][] morals = {{"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };

    public static void main(String[] args) {
        cleanMorals();
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static void cleanMorals() {
        for (int i = 0; i < morals.length; i++) {
            for (int j = 0; j < morals[i].length; j++) {
                String var = morals[i][j].toLowerCase();
                System.out.println(var);
                if (var.contains("killer")) {
                    morals[i][j] = "compassion";
                } else if (var.contains("thief")) {
                    morals[i][j] = "fairness";
                } else if (var.contains("bully")) {
                    morals[i][j] = "respect";
                }

            }
        }

    }
}