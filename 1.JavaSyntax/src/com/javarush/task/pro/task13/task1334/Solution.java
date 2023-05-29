package com.javarush.task.pro.task13.task1334;

/* 
Антипирамида
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static Map<Voter, Map<String, String>> corporatePyramid = new HashMap<>();

    public static void main(String[] args) {
        setRewards();
        printMap(corporatePyramid);
    }

    public static void setRewards() {
        Rewards rewards = new Rewards();
        List<Voter> voterList = Voter.generateVoters();
        Voter votKey;
        Map votValue;
        for (int i = 0; i < voterList.size(); i++) {
            if (voterList.get(i).getPersonalQuality().equals("Good")) {
                votKey = voterList.get(i);
                votValue = rewards.getGoodRewardsMap();
                corporatePyramid.put(votKey, votValue);
            }
        }
        for (var voter : voterList) {
            if (voter.getPersonalQuality().equals("Holy")) {
                votKey = voter;
                votValue = rewards.getHolyRewardsMap();
                corporatePyramid.put(votKey, votValue);
            }
        }

        //List<Voter> voters = Voter.generateVoters(); правильное решение
        //        Rewards rewards = new Rewards();
        //
        //        for (Voter voter : voters) {
        //            boolean isGood = voter.getPersonalQuality().equals("Good");
        //            boolean isHoly = voter.getPersonalQuality().equals("Holy");
        //            if (isGood) {
        //                corporatePyramid.put(voter, rewards.getGoodRewardsMap());
        //            } else if (isHoly) {
        //                corporatePyramid.put(voter, rewards.getHolyRewardsMap());
        //            }
        //        }


    }

    public static void printMap(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}