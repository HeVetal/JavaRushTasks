package com.javarush.task.pro.task11.task1129;

/* 
Био-Нано-Боты
*/

public class Solution {

    public static Human sysadmin = new Human();

    public static void main(String[] args) {
        Class[] music = {DoomMetal.class, HeavyMetal.class, GlamMetal.class,
                            ThrashMetal.class, SpeedMetal.class, PowerMetal.class,
                            DeathMetal.class, BlackMetal.class, ProgressiveMetal.class,
                            GothicMetal.class, SymphonicMetal.class, FolkMetal.class,
                            AlternativeMetal.class, IndustrialMetal.class, Metalcore.class};

        sysadmin.load(music);
    }
}
