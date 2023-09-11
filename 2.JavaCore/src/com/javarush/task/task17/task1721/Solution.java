package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        String pathOne;
        String pathTwo;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            pathOne = reader.readLine();
            pathTwo = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(pathOne))) {
            while (reader.ready()) {
                allLines.add(reader.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(pathTwo))) {
            while (reader.ready()) {
                forRemoveLines.add(reader.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Solution solution = new Solution();
        solution.joinData();

//        for (String line : allLines) {
//            System.out.println(line);
//        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
