package com.javarush.task.task15.task1522;

public class Earth implements Planet{
    private static volatile Earth instance;
    private Earth(){}
    public static Earth getInstance() {
        Earth localEarth = instance;
        if (localEarth == null) {
            synchronized ((Earth.class)) {
                localEarth = instance;
                if (localEarth == null) {
                    instance = localEarth = new Earth();
                }
            }
        }
        return localEarth;
    }
}
