package com.javarush.task.sql.task08.task0802;

import java.sql.*;

/* 
Откат транзакции
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test" ,"root", "root");
        try (Statement statement = connection.createStatement();){
            connection.setAutoCommit(false);

            int rows1 = statement.executeUpdate("UPDATE employee SET salary = salary+2000 WHERE name='Diego'");
            int rows2 = statement.executeUpdate("UPDATE employee SET salary = salary+500 WHERE name='Amigo'");
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
        } finally {
            connection.close();
        }
    }
}
