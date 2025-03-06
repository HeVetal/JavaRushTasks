package com.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
task0706
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                "root",
                "root")) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee LIMIT 1");
            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                String name = metaData.getColumnName(i);
                String typeName = metaData.getColumnTypeName(i);

                System.out.println(name + "(" + typeName + ")");
            }
        }
    }
}
