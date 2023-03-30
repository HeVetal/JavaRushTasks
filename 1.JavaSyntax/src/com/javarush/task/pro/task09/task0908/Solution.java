package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if(binaryNumber == null || binaryNumber.isBlank() || !binaryNumber.matches("[01]+")){
            return "";
        }
        while (binaryNumber.length() % 4 != 0){
            binaryNumber = "0" + binaryNumber;
        }
        String hexNumber = "";
        while (binaryNumber.length() > 0) {
            String fourByt = binaryNumber.substring(0, 4);
            String oneHex = "";
            if (fourByt.equals("0000")) {
                oneHex = "0";
            } else if (fourByt.equals("0001")) {
                oneHex = "1";
            } else if (fourByt.equals("0010")) {
                oneHex = "2";
            } else if (fourByt.equals("0011")) {
                oneHex = "3";
            } else if (fourByt.equals("0100")) {
                oneHex = "4";
            } else if (fourByt.equals("0101")) {
                oneHex = "5";
            } else if (fourByt.equals("0110")) {
                oneHex = "6";
            } else if (fourByt.equals("0111")) {
                oneHex = "7";
            } else if (fourByt.equals("1000")) {
                oneHex = "8";
            } else if (fourByt.equals("1001")) {
                oneHex = "9";
            } else if (fourByt.equals("1010")) {
                oneHex = "a";
            } else if (fourByt.equals("1011")) {
                oneHex = "b";
            } else if (fourByt.equals("1100")) {
                oneHex = "c";
            } else if (fourByt.equals("1101")) {
                oneHex = "d";
            } else if (fourByt.equals("1110")) {
                oneHex = "e";
            } else if (fourByt.equals("1111")) {
                oneHex = "f";
            }
            hexNumber += oneHex;
            binaryNumber = binaryNumber.substring(4);
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        if(hexNumber == null || hexNumber.isBlank() || !hexNumber.matches("[0-9a-f]+")){
            return "";
        }
        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            String oneHex = String.valueOf(hexNumber.charAt(i));
            String fourByt = "";
            if (oneHex.equals("0")) {
                fourByt = "0000";
            } else if (oneHex.equals("1")) {
                fourByt = "0001";
            } else if (oneHex.equals("2")) {
                fourByt = "0010";
            } else if (oneHex.equals("3")) {
                fourByt = "0011";
            } else if (oneHex.equals("4")) {
                fourByt = "0100";
            } else if (oneHex.equals("5")) {
                fourByt = "0101";
            } else if (oneHex.equals("6")) {
                fourByt = "0110";
            } else if (oneHex.equals("7")) {
                fourByt = "0111";
            } else if (oneHex.equals("8")) {
                fourByt = "1000";
            } else if (oneHex.equals("9")) {
                fourByt = "1001";
            } else if (oneHex.equals("a")) {
                fourByt = "1010";
            } else if (oneHex.equals("b")) {
                fourByt = "1011";
            } else if (oneHex.equals("c")) {
                fourByt = "1100";
            } else if (oneHex.equals("d")) {
                fourByt = "1101";
            } else if (oneHex.equals("e")) {
                fourByt = "1110";
            } else if (oneHex.equals("f")) {
                fourByt = "1111";
            }
            binaryNumber += fourByt;

        }

        return binaryNumber;
    }
}
