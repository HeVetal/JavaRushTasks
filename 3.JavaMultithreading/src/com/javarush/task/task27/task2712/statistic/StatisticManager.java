package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.util.*;

public class StatisticManager {

    private static StatisticManager instance = new StatisticManager();
    private StatisticStorage statisticStorage = new StatisticStorage();
    private Set<Cook> cooks = new HashSet<Cook>();

    private StatisticManager() {
    }

    public void register(EventDataRow data) {
        statisticStorage.put(data);
    }

    public static StatisticManager getInstance() {
        return instance;
    }

    public void register(Cook cook) {
        cooks.add(cook);
    }

    public Map<Date, Double> getProffitMap() {
        Map<Date, Double> map = new TreeMap<>();
        Map<EventType, List<EventDataRow>> storage = statisticStorage.getStorage();
        List<EventDataRow> eventDataRows = storage.get(EventType.SELECTED_VIDEOS);
        //stream
        for (EventDataRow eventDataRow : eventDataRows) {
            VideoSelectedEventDataRow videoSelected = (VideoSelectedEventDataRow) eventDataRow;
            Double amount = videoSelected.getAmount() / 100.0;
            Date date = videoSelected.getDate();
            if (!map.containsKey(date)) {
                map.put(date, amount);
            } else {
                map.put(date, map.get(date) + amount);
            }
        }
        return map;
    }

    private class StatisticStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        private StatisticStorage() {
            Arrays.stream(EventType.values())
                    .forEach(type -> storage.put(type, new ArrayList<>()));
        }

        private void put(EventDataRow data) {
//            EventType type = data.getType();
//            List<EventDataRow> eventDataRows = storage.get(type);
//            eventDataRows.add(data);
            storage.get(data.getType()).add(data);
        }

        public Map<EventType, List<EventDataRow>> getStorage() {
            return storage;
        }
    }
}
