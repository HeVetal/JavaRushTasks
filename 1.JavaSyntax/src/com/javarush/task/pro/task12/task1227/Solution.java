package com.javarush.task.pro.task12.task1227;

/* 
   Ох уж эта жуткая корзина
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Solution {

    public static List<Robot> cableContents = new ArrayList<>(Arrays.asList(new Robot("T1000"), new Robot("Amigo"),
            new Robot("B1"), new Robot("Diego"), new Robot("Zed")));

    public static void main(String[] args) {
    //напишите тут ваш код
        rescueRobots();
        emptyGarbageBin();
        printList(rescuedRobots);
    }

    private static List<Robot> rescuedRobots = new ArrayList<>();

    public static void rescueRobots(){
        String amigo = "Amigo";
        String diego = "Diego";

        for (Robot robot : cableContents) {
            if (robot.getName().equals(amigo) || robot.getName().equals(diego)) {
                rescuedRobots.add(robot);
            }
        }
        cableContents.removeIf(o -> o.getName().equals(amigo) || o.getName().equals(diego));
        }

    private static void emptyGarbageBin() {
        cableContents.clear();
        System.out.println("Garbage cleared");
    }

    public static void printList(List<Robot> list) {
        for (Robot o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
