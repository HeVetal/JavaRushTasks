package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream(args[1]);
             FileOutputStream outputStream = new FileOutputStream(args[2])) {
            byte[] buff = new byte[inputStream.available()];
            while (inputStream.available() > 0){
                inputStream.read(buff);
            }
            if (args[0].equals("-e")) {
                revers(outputStream, buff);
            } else if (args[0].equals("-d")) {
                revers(outputStream, buff);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void revers(FileOutputStream outputStream, byte[] buff) throws IOException {
        for (int i = 0; i < buff.length / 2; i++) {
            int temp = buff[i];
            buff[i] = buff[buff.length - 1 - i];
            buff[buff.length - 1 - i] = (byte) temp;
        }
        outputStream.write(buff);
    }

}
