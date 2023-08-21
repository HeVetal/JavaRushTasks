package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = console.readLine();
            //String fileName = "C:\\Users\\User\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1828\\test";
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                StringBuilder builder = new StringBuilder();
                if (args.length != 0) {

                    if (args[0].equals("-u")) {
                        while (reader.ready()) {
                            String str = reader.readLine();
                            int indexArg = Integer.parseInt(checkLength(args[1], 8).trim());
                            int indexFile = Integer.parseInt(str.substring(0, 8).trim());
                            if (indexFile == indexArg) {
                                String index = checkLength(String.valueOf(indexArg), 8);
                                String productName = checkLength(args[2], 30);
                                String price = checkLength(args[3], 8);
                                String quantity = checkLength(args[4], 4);
                                builder.append(System.lineSeparator()).append(index).append(productName).append(price).append(quantity);
                            } else {
                                builder.append(System.lineSeparator()).append(str);
                            }
                        }
                    } else if (args[0].equals("-d")) {
                        while (reader.ready()) {
                            String str = reader.readLine();
                            int indexArg = Integer.parseInt(checkLength(args[1], 8).trim());
                            int indexFile = Integer.parseInt(str.substring(0, 8).trim());
                            if (indexFile != indexArg) {
                                builder.append(System.lineSeparator()).append(str);
                            }
                        }
                    }
                }
                try (BufferedWriter writer = new BufferedWriter( new FileWriter(fileName))){
                    writer.write(builder.toString().trim());
                }
            }
        }

    }

    private static String checkLength(String string, int limit) {

        if (string.length() < limit) {
            StringBuilder builder = new StringBuilder(string);
            while (builder.length() != limit) {
                builder.append(" ");
            }
            return builder.toString();
        } else {
            return string.substring(0, limit);
        }

    }
}
