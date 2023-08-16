package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        LatteMaker latte = new LatteMaker();
        TeaMaker tea = new TeaMaker();
        latte.makeDrink();
        tea.makeDrink();
    }
}
