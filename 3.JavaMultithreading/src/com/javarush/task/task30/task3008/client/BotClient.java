package com.javarush.task.task30.task3008.client;

import java.util.Random;

public class BotClient extends Client {
    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return "date_bot_" + (0 + (int) (Math.random() * (99 - 0 + 1)));
    }

    public static void main(String[] args) {
        Client botClient = new BotClient();
        botClient.run();
    }

    public class BotSocketThread extends SocketThread {

    }
}
