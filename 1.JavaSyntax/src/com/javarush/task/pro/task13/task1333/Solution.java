package com.javarush.task.pro.task13.task1333;

/* 
Спасти рядового Компиляена
*/

import java.util.*;

public class Solution {

    public static List<Integer> ratingsList = new ArrayList<>();

    public static void main(String[] args) {
        setRatings();
        printList(); // before
        improveRatings();
        printList(); // after
    }

    public static void changeNegativeNumbers() {
        List<Integer> copy = new ArrayList<>(ratingsList);

        for (Integer num: copy) {
            if(num < 0){
                Collections.replaceAll(ratingsList, num, num * -1);
            }
        }
    }

    public static void changeZerosToMaximumNumber() {
        List<Integer> copy = new ArrayList<>(ratingsList);

        for (Integer num: copy) {
            if(num == 0){
                Collections.replaceAll(ratingsList, num, Collections.max(ratingsList));
            }
        }
    }

    public static void reverseList() {
        ratingsList.sort(Collections.reverseOrder());
    }

    public static void improveRatings() {
        changeNegativeNumbers();
        changeZerosToMaximumNumber();
        reverseList();
    }

    private static void setRatings() {
        int rating;
        Random random = new Random();
        int min = -5;
        int max = 11;

        for (int i = 0; i < 20; i++) {
            rating = random.nextInt(max - min) + min;
            ratingsList.add(rating);
        }
    }

    private static void printList() {
        ratingsList.forEach((value) -> System.out.print(value + " "));
        System.out.println();
    }
}