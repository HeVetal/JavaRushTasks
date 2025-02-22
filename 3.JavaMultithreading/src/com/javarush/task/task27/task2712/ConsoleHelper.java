package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return console.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
//        writeMessage("Выберете блюдо из списка " + Dish.allDishesToString());
//        writeMessage("Введите 'exit' для завершения заказа");
        writeMessage("Please choose a dish from the list: " + Dish.allDishesToString()
                + "\n or type 'exit' to complete the order");
        List<Dish> dishes = new ArrayList<>();
        while (true) {
            String dishName = readString().trim();
            if ("exit".equals(dishName)) {
                break;
            }
            try {
                Dish dish = Dish.valueOf(dishName);
                dishes.add(dish);
                writeMessage(dishName + " has been successfully added to your order");
            } catch (IllegalArgumentException e) {
                writeMessage(dishName + " hasn't been detected");
            }
        }
        return dishes;
    }
}
