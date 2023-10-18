package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = new File("C:\\Users\\User\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2002\\test");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            User user2 = new User();
            Date date = new Date();
            user.setBirthDate(date);
            user.setCountry(User.Country.UKRAINE);
            user.setFirstName("Ivan");
            user.setLastName("Petrov");
            user.setMale(true);
            javaRush.users.add(user);


            user2.setBirthDate(new Date());
            user2.setCountry(User.Country.RUSSIA);
            user2.setFirstName("Bob");
            user2.setLastName("Jonson");
            user2.setMale(false);


            javaRush.users.add(user2);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            List<User> users = loadedObject.users;
            for (User user1 : users) {
                System.out.println(user1.getFirstName());
                System.out.println(user1.getLastName());
                System.out.println(user1.getCountry());
                System.out.println(user1.getBirthDate());
                System.out.println(user1.isMale());
            }
            if (javaRush.equals(loadedObject)) {
                System.out.println("Equals");
            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream, true);

            if (this.users.size() > 0) {
                for (User user : users) {

                    if (user != null) {
                        writer.println(user.getFirstName());
                        writer.println(user.getLastName());
                        writer.println(user.getCountry());
                        writer.println(user.isMale());
                        writer.println(user.getBirthDate().getTime());
                    }
                }
            }
            writer.close();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                User newUser = new User();
                String name = reader.readLine();
                newUser.setFirstName(name);
                String lastName = reader.readLine();
                newUser.setLastName(lastName);
                newUser.setCountry(User.Country.valueOf(reader.readLine()));
                String isMale = reader.readLine();
                if (isMale.equals("true")) {
                    newUser.setMale(true);
                } else {
                    newUser.setMale(false);
                }
                newUser.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                this.users.add(newUser);
            }
            reader.close();
            //implement this method - реализуйте этот метод
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
