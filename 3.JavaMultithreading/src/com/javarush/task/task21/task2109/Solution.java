package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/

public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            B b = (B) super.clone();
            if (!(b instanceof C)) {
                throw new CloneNotSupportedException();
            }
            return super.clone();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B(1, 2, "dfgf");
        B clone1 = null;
        //clone1 = (B) b.clone();
        C c = new C(2, 4, "fgf");
        System.out.println(c);
        C clone = null;
        clone = (C) c.clone();
        System.out.println(clone);

    }
}
