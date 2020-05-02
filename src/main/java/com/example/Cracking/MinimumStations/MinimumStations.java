package com.example.Cracking.MinimumStations;

import java.util.TreeMap;

public class MinimumStations {

    public static int getMinStations(int[] arrayArrivals, int[] arrayDepartures) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i < arrayArrivals.length ; i++) {
            treeMap.put(arrayArrivals[i], "a");
        }

        for (int i = 0; i < arrayDepartures.length ; i++) {
            treeMap.put(arrayDepartures[i], "d");
        }
        int stations = 0;
        int max = 0;
        for (String s : treeMap.values()) {
            if (s == "a") {
                stations++;
                if (max < stations) {
                    max = stations;
                }
            } else {
                stations--;
            }
        }
        return max;
    }

}
