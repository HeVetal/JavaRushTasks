package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        State state = thread.getState();
        System.out.println(state);

        State newState;
        do {
            if ((newState = thread.getState()) != state) {
                state = newState;
                System.out.println(newState);
            }
        } while (!(state.equals(State.TERMINATED)));
    }
}
