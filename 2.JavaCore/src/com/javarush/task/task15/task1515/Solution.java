package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;

    static {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            A = Integer.parseInt(bf.readLine());
            B = Integer.parseInt(bf.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
