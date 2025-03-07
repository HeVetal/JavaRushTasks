package com.javarush.task.sql.task07.task0709;

import java.sql.*;

/* 
Метод getObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root")) {
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery("SELECT name, weight, birthday, inn FROM employee");

            while (result.next()) {
                String name = result.getString("name");
                float weight = result.getFloat("weight");
                Date birthday = result.getDate("birthday");
                long inn = result.getLong("inn");
                System.out.println(name + " " + weight + " " + birthday + " " + inn);
            }
        }
    }
}
