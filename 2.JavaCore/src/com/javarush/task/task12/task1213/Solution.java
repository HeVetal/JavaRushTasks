package com.javarush.task.task12.task1213;

/* 
«Исправь код», часть 2
*/

public class Solution {
    public static void main(String[] args) {

    }

    abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        abstract Pet getChild();
    }

}
