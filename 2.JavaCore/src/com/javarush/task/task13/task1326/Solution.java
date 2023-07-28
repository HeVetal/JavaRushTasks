package com.javarush.task.task13.task1326;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        InputStream ins = new FileInputStream(scanner.nextLine());
        //BufferedReader bf = Files.newBufferedReader(Path.of(scanner.nextLine()));
        BufferedReader bf = new BufferedReader(new InputStreamReader(ins));
        ArrayList<Integer> numbers = new ArrayList<>();
        int var;
        while (bf.ready()){
            var = Integer.parseInt(bf.readLine());
            if(var % 2 == 0){
                numbers.add(var);
            }
        }
        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }

        scanner.close();
        bf.close();

    }
}
