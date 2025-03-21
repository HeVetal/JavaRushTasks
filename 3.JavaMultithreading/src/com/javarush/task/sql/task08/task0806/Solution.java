package com.javarush.task.sql.task08.task0806;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/* 
task0806
*/

public class Solution {

    public static Set<Employee> employees = new HashSet<>();

    public static void main(String[] args) throws Exception {


        ResultSet resultSet;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
             Statement statement = connection.createStatement()) {

            resultSet = statement.executeQuery("SELECT * FROM employee");
        }

        while (resultSet.next()){
            Employee employee = new Employee();
            employee.setName(resultSet.getString("name"));
            employee.setId(resultSet.getInt("id"));
            employee.setAge(resultSet.getInt("age"));
            employee.setSmth(resultSet.getString("smth"));

            employees.add(employee);
        }

        employees.forEach(System.out::println);
    }
}
