package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        List<String> file1 = new ArrayList<>();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader1 = new BufferedReader(new FileReader(console.readLine()));
             BufferedReader fileReader2 = new BufferedReader(new FileReader(console.readLine()))) {
            while (fileReader1.ready()) {
                file1.add(fileReader1.readLine());
            }
            System.out.println("файл 1 считан");
//            for (String s : file1) {
//                System.out.println(s);
//            }
            while (fileReader2.ready()) {
                // System.out.println("считываем файл 2");
                String str = fileReader2.readLine();
                //System.out.println(str);

                for (int i = 0; i < file1.size(); i++) {
                    if (file1.get(i).contains(str)) {
                        //      System.out.println("содержит");

                        lines.add(new LineItem(Type.SAME, str));
                    } else {
                        //    System.out.println("не содержит файл 1");

                        lines.add(new LineItem(Type.REMOVED, file1.get(i)));
                    }
                }
                lines.add(new LineItem(Type.ADDED, str));
                //System.out.println("только файл 2");

            }

            for (LineItem line : lines) {
                //System.out.println(" в цикле линий");
                System.out.print(line.type);
                System.out.println(line.line);
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
