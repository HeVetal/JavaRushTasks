package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String answer = scanner.nextLine();
        StringBuilder text = new StringBuilder();

        while (!(answer.equals("exit"))) {

            text.append(answer).append(System.lineSeparator());
            answer = scanner.nextLine();
        }
        text.append("exit");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(text.toString());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }


}
