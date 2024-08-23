package com.javarush.task.jdk13.task42.task4208;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* 
Потоки в очередь!
*/

public class MyQueue extends AbstractQueue<String> {
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock writeLock = lock.writeLock();
    private Lock readLock = lock.readLock();

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        throw new UnsupportedOperationException();
    }


    @Override
    public int size() {

        try {
            lock.readLock().lock();
            readLock.lock();
            return values.size();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean offer(String o) {
        try {
            writeLock.lock();
            values.add(o);
            return true;
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public String poll() {

        try {
            writeLock.lock();
            return values.size() > 0 ? values.remove(0) : null;
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public String peek() {

        try {
            readLock.lock();
            return values.size() > 0 ? values.get(0) : null;
        } finally {
            readLock.unlock();
        }
    }
}
