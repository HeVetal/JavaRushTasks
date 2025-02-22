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
        for (Map.Entry<Date, Double> dateDoubleEntry : proffitMap.entrySet()) {
            String format = String.format(Locale.ENGLISH, "%s - %.2f", dateFormat.format(dateDoubleEntry.getKey()), dateDoubleEntry.getValue());
            ConsoleHelper.writeMessage(format);

        }
        String format = String.format(Locale.ENGLISH, "Total - %.2f", proffitMap.values().stream().mapToDouble(Double::valueOf).sum());
        ConsoleHelper.writeMessage(format);
    }

    public void printCookWorkloading() {
    }

    public void printActiveVideoSet() {
    }

    public void printArchivedVideoSet() {
    }
}
