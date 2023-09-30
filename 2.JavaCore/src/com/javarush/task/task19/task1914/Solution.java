package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testString.printSomething();

        String result = outputStream.toString();
        String[] strings = result.split(" ");
        System.setOut(consoleStream);
        int numberOne = Integer.parseInt(strings[0]);
        int numberTwo = Integer.parseInt(strings[2]);
        int res = 0;
        switch (strings[1]) {

            case "+":
                res = numberOne + numberTwo;
                break;
            case "-":
                res = numberOne - numberTwo;
                break;
            case "*":
                res = numberOne * numberTwo;
                break;
        }
        System.out.println(numberOne + " " + strings[1] + " " + numberTwo + " = " + res);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

