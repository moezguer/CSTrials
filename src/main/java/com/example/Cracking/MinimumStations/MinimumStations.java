package com.example.Cracking.MinimumStations;

import java.util.TreeMap;

public class MinimumStations {

    public static int getMinStations(int[] arrayArrivals, int[] arrayDepartures) {
        TreeMap<Integer, Station> treeMap = new TreeMap<>();

        for (int i = 0; i < arrayArrivals.length; i++) {
            if (treeMap.containsKey(arrayArrivals[i])) {
                treeMap.get(arrayArrivals[i])
                       .increaseArrival();
            } else {
                treeMap.put(arrayArrivals[i], new Station(1, 0));
            }
        }

        for (int i = 0; i < arrayDepartures.length; i++) {
            if (treeMap.containsKey(arrayDepartures[i])) {
                treeMap.get(arrayDepartures[i])
                       .increaseDeparture();
            } else {
                treeMap.put(arrayDepartures[i], new Station(0, 1));
            }
        }

        int stations = 0;
        int max = 0;
        for (Station s : treeMap.values()) {
            stations += s.arrival;
            if (max < stations) {
                max = stations;
            }
            stations -= s.departure;
        }
        return max;
    }

    public static class Station {
        int arrival = 0;
        int departure = 0;

        public Station(int arrival, int departure) {
            this.arrival = arrival;
            this.departure = departure;

        }

        public void increaseArrival() {
            this.arrival++;
        }

        public void increaseDeparture() {
            this.departure++;
        }

    }


}
