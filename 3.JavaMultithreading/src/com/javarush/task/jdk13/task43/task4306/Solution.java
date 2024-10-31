package com.javarush.task.jdk13.task43.task4306;

/* 
В поиске ботана
*/

import org.apache.commons.lang3.ObjectUtils;

public class Solution {

    public static void main(String[] args) {
        Student studentOne = new Student("Joe", 10, 8, 7, 7, 5, 6, 9);
        Student studentTwo = new Student("Jane", 8, 9, 5, 6, 7, 7, 8);

        String result = compareStudentGrades(studentOne, studentTwo);
        System.out.println(result);
    }

    public static String compareStudentGrades(Student studentOne, Student studentTwo) {
        //напишите тут ваш код
        //if (ObjectUtils.anyNull(studentOne, studentTwo)) return "Make sure there are no null objects";
        int studentOneGrades = studentOne.getBiologyScore() + studentOne.getChemistryScore() + studentOne.getEnglishScore()
                + studentOne.getGeographyScore() + studentOne.getHistoryScore() + studentOne.getMathScore() + studentTwo.getPhysicsScore();

        int studentTwoGrades = studentTwo.getBiologyScore() + studentTwo.getChemistryScore() + studentTwo.getEnglishScore()
                + studentTwo.getGeographyScore() + studentTwo.getHistoryScore() + studentTwo.getMathScore() + studentTwo.getPhysicsScore();
        int compare = ObjectUtils.compare(studentOneGrades, studentTwoGrades);

        if (compare > 0) return studentOne.getName() + " has a higher grades score";
        else if (compare < 0) return studentTwo.getName() + "has a higher grades score";
        else return "Student grades scores are equal";
    }
}


