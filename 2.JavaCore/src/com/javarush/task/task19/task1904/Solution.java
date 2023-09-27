package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String s = fileScanner.nextLine();
            String[] strings = s.split(" ", 4);
            SimpleDateFormat dateFormat = new SimpleDateFormat();
            dateFormat.applyPattern("dd MM yyyy");
            Date dateBirthday = dateFormat.parse(strings[3]);

            return new Person(strings[1], strings[2], strings[0], dateBirthday);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
