package com.javarush.task.task16.task1626;

/* 
Создание по образцу
*/

import java.sql.SQLOutput;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();

        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {

        private int countIndexUp = 1;

        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(500);
                    System.out.println(toStringUp());
                    countIndexUp += 1;
                    if (countIndexUp == Solution.number + 1) return;


                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public String toStringUp() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
        //Add your code here - добавь код тут
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
