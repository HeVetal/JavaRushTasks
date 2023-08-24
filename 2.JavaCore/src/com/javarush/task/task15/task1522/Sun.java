package com.javarush.task.task15.task1522;

public class Sun implements Planet {
    private static volatile Sun instance;
    private Sun() {
    }
    public static Sun getInstance() {
        Sun localSun = instance;
        if (localSun == null) {
            synchronized ((Sun.class)) {
                localSun = instance;
                if (localSun == null) {
                    instance = localSun = new Sun();
                }
            }
        }
        return localSun;
    }
}
