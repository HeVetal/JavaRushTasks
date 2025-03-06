package com.javarush.task.sql.task07.task0704;

import java.sql.*;

/* 
task0704
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                "root",
                "root")) {

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM employee");
            while (result.next()) {
                System.out.println(result.getString("name"));
            }
        }
    }
}
