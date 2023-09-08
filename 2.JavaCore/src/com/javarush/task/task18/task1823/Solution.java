package com.javarush.task.task18.task1823;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String str;
            while (!(str = reader.readLine()).equals("exit")){
                ReadThread readThread = new ReadThread(str);
                readThread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            Map<Integer,Integer> map = new HashMap<>();
            try (FileInputStream inputStream = new FileInputStream(fileName)){

                while (inputStream.available() > 0){
                    int read = inputStream.read();
                    map.merge(read,1, Integer::sum);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Integer max = map.values().stream().max(Comparator.comparingInt(x -> x)).get();
            for (Map.Entry<Integer, Integer> pr : map.entrySet()) {
                if(pr.getValue().equals(max)){
                    resultMap.put(fileName,pr.getKey());
                    break;
                }
            }
//            byte[] bytes = Files.readAllBytes(Path.of(fileName));
//            IntStream.range(0, bytes.length).forEach(i->map.merge((int) bytes[i],1,Integer::sum));
//            map.entrySet().stream().filter(pair -> Objects.equals(pair.getKey(),map.values().stream().max(Comparator.comparingInt(x -> x)).orElseThrow())).findFirst().ifPresent(e->resultMap.put(fileName,e.getKey()));
        }
    }
}
