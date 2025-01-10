package com.javarush.task.sql.task10.task1009;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
task1009
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Agerage age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        String hql = "select sum(salary) as sum from Employee group by salary";
        Query<Employee> query = session.createQuery(hql, Employee.class);

        return 0L;
    }

    public static Double getAverageAge() {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        String hql = "select avg(salary) as avg from Employee group by salary";
        Query<Employee> query = session.createQuery(hql, Employee.class);

        return 0.0;
    }
}