package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) throws IOException, ClassNotFoundException, RuntimeException {
        A a = new A();
        try {
            a = (A) objectStream.readObject();
            if(!(a instanceof A)){
                return null;
            }

        } catch (Exception e) {
            System.out.println("Exception");
            return null;
        }

        return a;
    }

    public class A implements Serializable{
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
