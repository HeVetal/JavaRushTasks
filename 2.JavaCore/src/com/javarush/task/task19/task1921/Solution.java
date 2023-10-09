package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
//            LocalDate birthday;
//            Calendar calendar;
            int year = 0;
            int month = 0;
            int day = 0;
            while (reader.ready()) {
                String name = "";
                String str = reader.readLine();
                String[] men = str.split(" ");
                year = Integer.parseInt(men[men.length - 1]);
                month = Integer.parseInt(men[men.length - 2]);
                day = Integer.parseInt(men[men.length - 3]);
                Date date = new Date(year-1900, month - 1, day);
                for (int i = 0; i < men.length - 3; i++) {
                    name = name + men[i] + " ";
                }
                PEOPLE.add(new Person(name.trim(), date));
            }
        }
        for (Person person : PEOPLE) {
            System.out.println(person.getName() + person.getBirthDate());
        }
    }
}
