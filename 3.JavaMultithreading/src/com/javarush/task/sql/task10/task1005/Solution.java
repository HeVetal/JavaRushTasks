package com.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books = null;
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory()) {
            Session session = sessionFactory.openSession();
            String hql = "from Book where Book.author = 'Mark Twain ' and Book.publisher = 'Фолио'";
            Query<Book> query = session.createQuery(hql);
        }

        books.forEach(System.out::println);
    }
}