package com.javarush.task.task15.task1522;

public class Moon implements Planet{
    private static volatile Moon instance;
    private Moon(){}
    public static Moon getInstance() {
        Moon localMoon = instance;
        if (localMoon == null) {
            synchronized ((Moon.class)) {
                localMoon = instance;
                if (localMoon == null) {
                    instance = localMoon = new Moon();
                }
            }
        }
        return localMoon;
    }
}
