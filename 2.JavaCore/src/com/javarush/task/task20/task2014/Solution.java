package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable{
    public static void main(String[] args) throws RuntimeException {

        try {
            File myFile = new File("C:\\Users\\User\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2014\\test");
            ObjectOutputStream objectoutputStream = new ObjectOutputStream(new FileOutputStream(myFile));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(myFile));


            Solution savedObject = new Solution(5);
            objectoutputStream.writeObject(savedObject);
            Solution newSolution = (Solution) inputStream.readObject();

            System.out.println(savedObject.toString().equals(newSolution.toString()));

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
