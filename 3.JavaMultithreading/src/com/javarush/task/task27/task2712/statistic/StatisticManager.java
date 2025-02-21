package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.*;

public class StatisticManager {

    private static StatisticManager instance = new StatisticManager();
    private StatisticStorage statisticStorage = new StatisticStorage();

    private StatisticManager() {
    }

    public void register(EventDataRow data) {
        statisticStorage.put(data);
    }

    public static StatisticManager getInstance() {
        return instance;
    }

    private class StatisticStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        private StatisticStorage() {
            Arrays.stream(EventType.values())
                    .forEach(type -> storage.put(type, new ArrayList<>()));
        }

        private void put(EventDataRow data){
//            EventType type = data.getType();
//            List<EventDataRow> eventDataRows = storage.get(type);
//            eventDataRows.add(data);
            storage.get(data.getType()).add(data);
        }
    }
}
