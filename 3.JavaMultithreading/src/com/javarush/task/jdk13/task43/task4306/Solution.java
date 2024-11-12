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
        if (!ObjectUtils.anyNotNull(studentOne, studentTwo)) return "Make sure there are no null objects";

        int compare = 0;
        compare = compare + ObjectUtils.compare(studentOne.getMathScore(), studentTwo.getMathScore());
        compare = compare + ObjectUtils.compare(studentOne.getBiologyScore(), studentTwo.getBiologyScore());
        compare = compare + ObjectUtils.compare(studentOne.getChemistryScore(), studentTwo.getChemistryScore());
        compare = compare + ObjectUtils.compare(studentOne.getHistoryScore(), studentTwo.getHistoryScore());
        compare = compare + ObjectUtils.compare(studentOne.getEnglishScore(), studentTwo.getEnglishScore());
        compare = compare + ObjectUtils.compare(studentOne.getGeographyScore(), studentTwo.getGeographyScore());
        compare = compare + ObjectUtils.compare(studentOne.getPhysicsScore(), studentTwo.getPhysicsScore());

        if (compare > 0) return studentOne.getName() + " has a higher grades score";
        else if (compare < 0) return studentTwo.getName() + "has a higher grades score";
        else return "Student grades scores are equal";
    }
}


