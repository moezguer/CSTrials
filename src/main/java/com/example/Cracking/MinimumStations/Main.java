package com.example.Cracking.MinimumStations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(reader.readLine());

        for (int t = 0; t < testCaseCount; t++) {
            int countOfTrain = Integer.parseInt(reader.readLine());
            String[] firstArray = reader.readLine().replace("  ", " ").split(" ");
            String[] secondArray = reader.readLine().replace("  ", " ").split(" ");



            int[] arrivals = new int[countOfTrain];
            int[] departures = new int[countOfTrain];

            for (int i = 0; i < countOfTrain; i++) {
                arrivals[i] = Integer.parseInt(firstArray[i]);
                departures[i] = Integer.parseInt(secondArray[i]);
            }
            System.out.println(MinimumStations.getMinStations(arrivals, departures));
        }
    }
}
