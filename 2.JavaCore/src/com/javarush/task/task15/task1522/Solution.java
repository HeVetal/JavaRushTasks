package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String planet = reader.readLine();
        if(planet.equalsIgnoreCase("sun")){
            thePlanet = Sun.getInstance();
        } else if (planet.equalsIgnoreCase("moon")) {
            thePlanet = Moon.getInstance();
        } else if (planet.equalsIgnoreCase("earth")) {
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
