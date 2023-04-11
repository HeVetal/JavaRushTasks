package com.javarush.task.pro.task09.task0921;

/* 
Пиратский разворот
*/

import java.util.Arrays;

public class NimrodAi {

    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (PastryLoader pastryLoader : pastryLoaders) {
            for (int j = 0; j < pastryLoader.memory.length; j++) {
                for (int k = 0; k < pastryLoader.memory[j].length; k++) {
                    for (int l = 0; l < pastryLoader.memory[j][k].length; l++) {
                        if (pastryLoader.memory[j][k][l].toLowerCase().contains("nimrod")) {
                            pastryLoader.memory[j][k][l] =
                                    pastryLoader.memory[j][k][l].toLowerCase().replaceAll("nimrod", "pirate ship");
                        }
                    }
                }
            }
        }
    }
}
