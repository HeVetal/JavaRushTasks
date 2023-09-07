package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    private static SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException, RuntimeException {

        try {
            switch (args[0]) {

                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3) {
                           Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 2]);
                            String name = args[i];
                            String sex = args[i + 1];
                            //Date date = inputFormat.parse(args[i + 2]);
                            Person person = sex.equals("м") ? Person.createMale(name, date) : Person.createFemale(name, date);
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));
                        }
                        break;
                    }

                case "-u":
                    synchronized (allPeople) {
                        if (Integer.parseInt(args[1]) <= allPeople.size()) {
                            for (int i = 0; i < args.length - 2; i += 4) {
                                String name = args[i + 2] ;
                                int id = Integer.parseInt(args[1 + i]);
                                Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+4]);
                                Person person = null;
                                if (args[i + 3].equals("м")) {
                                    person = Person.createMale(name, date);
                                } else if (args[i + 3].equals("ж")) {
                                    person = Person.createFemale(name, date);
                                }
                                allPeople.set(id, person);
                            }
    //                        for (Person person : allPeople) {
    //                            System.out.println(person.getName());
    //                            System.out.println(person.getSex());
    //                            System.out.println(person.getBirthDate());
    //                        }
                        }
                        break;
                    }

                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            if (Integer.parseInt(args[i]) < allPeople.size()) {
                                int id = Integer.parseInt(args[i]);
                                allPeople.get(id).setName(null);
                                allPeople.get(id).setSex(null);
                                allPeople.get(id).setBirthDate(null);
                            }
                        }
                        break;
                    }

                case "-i":
                    synchronized (allPeople) {
                        for (int i = 0; i < args.length - 1; i++) {
                            int id = Integer.parseInt(args[i + 1]);
                            Person person = allPeople.get(id);
                            //String name = person.getName();
                            String lastName = person.getName();
                            //String[] s = name.split(" ");
                            //String lastName = s[0];
                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                            if (person.getSex().equals(Sex.MALE)) {
                                System.out.print(lastName + " м " + sdf.format(person.getBirthDate()));
                                System.out.println();
                            } else if (person.getSex().equals(Sex.FEMALE)) {
                                System.out.print(lastName + " ж " + sdf.format(person.getBirthDate()));
                                System.out.println();
                            }
                        }
                        break;
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
