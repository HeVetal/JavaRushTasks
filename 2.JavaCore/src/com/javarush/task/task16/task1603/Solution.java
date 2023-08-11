package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишите тут ваш код
//        SpecialThread sthread = new SpecialThread();
//        Thread thread = new Thread(sthread);
//
//        SpecialThread sthread1 = new SpecialThread();
//        Thread thread1 = new Thread(sthread1);
//
//        SpecialThread sthread2 = new SpecialThread();
//        Thread thread2 = new Thread(sthread2);
//
//        SpecialThread sthread3 = new SpecialThread();
//        Thread thread3 = new Thread(sthread3);
//
//        SpecialThread sthread4 = new SpecialThread();
//        Thread thread4 = new Thread(sthread4);
//
//        list.add(thread);
//        list.add(thread1);
//        list.add(thread2);
//        list.add(thread3);
//        list.add(thread4);
        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
        }

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
