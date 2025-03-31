package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class DirectorTablet {

    public void printAdvertisementProfit() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Map<Date, Double> proffitMap = StatisticManager.getInstance().getProffitMap();
//stream
        proffitMap.entrySet().stream()
                .map(entry -> String.format(Locale.ENGLISH, "%s - %.2f", dateFormat.format(entry.getKey()), entry.getValue()))
                .forEach(ConsoleHelper::writeMessage);


//        for (Map.Entry<Date, Double> dateDoubleEntry : proffitMap.entrySet()) {
//            String format = String.format(Locale.ENGLISH, "%s - %.2f", dateFormat.format(dateDoubleEntry.getKey()), dateDoubleEntry.getValue());
//            ConsoleHelper.writeMessage(format);
//
//        }
        String format = String.format(Locale.ENGLISH, "Total - %.2f", proffitMap.values().stream().mapToDouble(Double::valueOf).sum());
        ConsoleHelper.writeMessage(format);
    }


    public void printCookWorkloading() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Map<Date, Map<String, Integer>> cookWorkLoadingMap = StatisticManager.getInstance().getCookWorkLoadingMap();
        for (Map.Entry<Date, Map<String, Integer>> dateMapEntry : cookWorkLoadingMap.entrySet()) {
            ConsoleHelper.writeMessage(dateFormat.format(dateMapEntry.getKey()));
            Map<String, Integer> value = dateMapEntry.getValue();
            for (Map.Entry<String, Integer> stringIntegerEntry : value.entrySet()) {
                ConsoleHelper.writeMessage(stringIntegerEntry.getKey() + " - " + stringIntegerEntry.getValue() + " min");
            }
            ConsoleHelper.writeMessage("");
        }
    }

    public void printActiveVideoSet() {
    }

    public void printArchivedVideoSet() {
    }
}
