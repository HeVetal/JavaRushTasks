package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countDigits = 0;
        char[] masChar = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(masChar[i])){
                countDigits++;
            }
        }
        return countDigits;
    }

    public static int countLetters(String string) {
        int countLetters= 0;
        char[] masChar = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(masChar[i])){
                countLetters++;
            }
        }
        return countLetters;
    }

    public static int countSpaces(String string) {
        int countSpaces= 0;
        char[] masChar = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isSpaceChar(masChar[i])){
                countSpaces++;
            }
        }
        return countSpaces;

    }
}
