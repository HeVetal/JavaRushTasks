package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);

    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        if(storage.contains(s)){
            return storage.indexOf(s);
        }else return -1;
    }

//    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//        myStack.push("fd");
//        myStack.push("2");
//        System.out.println(myStack.empty());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.peek());
//        System.out.println(myStack.search("fd"));
//
//    }
}
