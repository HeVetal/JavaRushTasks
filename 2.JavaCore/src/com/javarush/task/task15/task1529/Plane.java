package com.javarush.task.task15.task1529;

public class Plane implements CanFly {

    private int passCount;

    @Override
    public void fly() {

    }

    public Plane(int passCount) {
        this.passCount = passCount;
    }
}
