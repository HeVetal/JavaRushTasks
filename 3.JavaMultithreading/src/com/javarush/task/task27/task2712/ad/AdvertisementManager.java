package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AdvertisementManager {
    private AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;

    private List<Advertisement> optimalVideoSet;
    private long bestAmount;
    private int bestDuration = Integer.MAX_VALUE;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        if (storage.list().isEmpty()) {
            throw new NoVideoAvailableException("");
        }

        List<Advertisement> advertisements = storage.list().stream()
                .filter(adv -> adv.getDuration() <= timeSeconds)
                .filter(adv -> adv.getAmountPerOneDisplaying() > 0)
                .collect(Collectors.toList());

        make(advertisements);

        optimalVideoSet.sort(
                Comparator.comparingLong(Advertisement::getAmountPerOneDisplaying)
                        .thenComparingInt(Advertisement::getDuration)
                        .reversed());

        for (Advertisement advertisement : optimalVideoSet) {
            ConsoleHelper.writeMessage(advertisement.toString());
            advertisement.revalidate();
        }

    }

    private long calcAmount(List<Advertisement> advertisements) {
        return advertisements.stream().mapToLong(Advertisement::getAmountPerOneDisplaying).sum();
    }

    private int calcDuration(List<Advertisement> advertisements) {
        return advertisements.stream().mapToInt(Advertisement::getDuration).sum();
    }

    private void updateOptimalVideoSet(List<Advertisement> advertisements) {
        long amount = calcAmount(advertisements);
        int duration = calcDuration(advertisements);

        if (Objects.isNull(optimalVideoSet) && duration <= timeSeconds) {
            optimalVideoSet = advertisements;
            bestAmount = amount;
            bestDuration = duration;
        } else {
            if (duration <= timeSeconds) {
                if (amount > bestAmount) {
                    optimalVideoSet = advertisements;
                    bestAmount = amount;
                    bestDuration = duration;
                }

                if (amount == bestAmount) {
                    if (duration > bestDuration) {
                        optimalVideoSet = advertisements;
                        bestAmount = amount;
                        bestDuration = duration;
                    }
                    if (duration == bestDuration && advertisements.size() < optimalVideoSet.size()) {
                        optimalVideoSet = advertisements;
                        bestAmount = amount;
                        bestDuration = duration;
                    }
                }
            }
        }
    }

    private void make(List<Advertisement> advertisements) {
        if (!advertisements.isEmpty()) {
            updateOptimalVideoSet(advertisements);
        }
        for (Advertisement advertisement : advertisements) {
            List<Advertisement> newAdvertisements = new ArrayList<>(advertisements);
            newAdvertisements.remove(advertisement);
            make(newAdvertisements);
        }
    }
}
