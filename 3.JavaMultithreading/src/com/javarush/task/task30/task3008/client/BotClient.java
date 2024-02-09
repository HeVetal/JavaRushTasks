package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.SimpleFormatter;

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
        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            String[] split = message.split(":");
            String name = split[0];
            String text = split[1];
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf;
            switch (text) {
                case "дата":
                    sdf = new SimpleDateFormat("d.MM.yyyy");
                    BotClient.this.sendTextMessage("Информация для  " + name + ": " + sdf.format(calendar.getTime()));
                    break;
                case "день":
                    sdf = new SimpleDateFormat("d");
                    BotClient.this.sendTextMessage("Информация для  " + name + ": " + sdf.format(calendar.getTime()));
                    break;
                case "месяц":
                    sdf = new SimpleDateFormat("MMMM");
                    BotClient.this.sendTextMessage("Информация для  " + name + ": " + sdf.format(calendar.getTime()));
                    break;
                case "год":
                    sdf = new SimpleDateFormat("YYYY");
                    BotClient.this.sendTextMessage("Информация для  " + name + ": " + sdf.format(calendar.getTime()));
                    break;
                case "время":
                    sdf = new SimpleDateFormat("H:mm:ss");
                    BotClient.this.sendTextMessage("Информация для  " + name + ": " + sdf.format(calendar.getTime()));
                    break;
                case "час":
                    sdf = new SimpleDateFormat("H");
                    BotClient.this.sendTextMessage("Информация для  " + name + ": " + sdf.format(calendar.getTime()));
                    break;
                case "минуты":
                    sdf = new SimpleDateFormat("m");
                    BotClient.this.sendTextMessage("Информация для  " + name + ": " + sdf.format(calendar.getTime()));
                    break;
                case "секунды":
                    sdf = new SimpleDateFormat("s");
                    BotClient.this.sendTextMessage("Информация для  " + name + ": " + sdf.format(calendar.getTime()));
                    break;
                default:
                    ConsoleHelper.writeMessage("Неверная команда");

            }
        }

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            BotClient.this.sendTextMessage(
                    "Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }
    }
}
