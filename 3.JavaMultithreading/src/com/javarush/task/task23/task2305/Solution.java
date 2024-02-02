package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution array[] = new Solution[2];
        array[0] = new Solution();
        array[1] = new Solution();
        array[0].innerClasses[0] = array[0].new InnerClass();
        array[0].innerClasses[1] = array[0].new InnerClass();
        array[1].innerClasses[0] = array[1].new InnerClass();
        array[1].innerClasses[1] = array[1].new InnerClass();
        return array;
    }

    public static void main(String[] args) {

    }
}
