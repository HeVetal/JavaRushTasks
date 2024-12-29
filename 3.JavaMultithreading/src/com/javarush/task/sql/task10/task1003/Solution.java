package com.javarush.task.sql.task10.task1003;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/* 
task1003
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        promoteAll();
    }

    public static void promoteAll() {
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory()) {
            Query<Employee> query = sessionFactory.getCurrentSession().createQuery(
                    "update Employee set smth = 'senior ' + smth");
            query.executeUpdate();
        }
    }
}