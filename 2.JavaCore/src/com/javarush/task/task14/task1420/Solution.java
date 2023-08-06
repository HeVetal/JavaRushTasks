package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOne = Integer.parseInt(reader.readLine());
        int numberTwo = Integer.parseInt(reader.readLine());
        for (int i = Math.min(numberOne,numberTwo); i > 0 ; i--) {
            if(numberOne % i == 0 && numberTwo % i == 0){
                System.out.println(i);
                break;
            }
        }
//        BigInteger bigInteger1 = new BigInteger(numberOne + "");
//        BigInteger bigInteger2 = new BigInteger(numberTwo + "");
//        System.out.println(bigInteger1.gcd(bigInteger2));

    }
}
