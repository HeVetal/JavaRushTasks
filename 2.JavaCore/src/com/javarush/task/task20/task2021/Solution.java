package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream oos) throws IOException, InterruptedException{
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream ois) throws IOException{
            throw  new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}
