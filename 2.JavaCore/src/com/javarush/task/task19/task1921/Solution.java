package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String str = reader.readLine();
            String[] person = str.split(" ");
            int year = Integer.parseInt(person[person.length - 1]);
            int month = Integer.parseInt(person[person.length - 2]);
            int day = Integer.parseInt(person[person.length - 3]);
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < person.length - 3; i++) {
                name.append(person[i]);
            }
        }
    }
}
