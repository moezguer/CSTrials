package com.example.Cracking.MinimumStations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int numberOfTest;
        int arraySize1;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        numberOfTest = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfTest; i++) {

            arraySize1 = Integer.parseInt(bufferedReader.readLine());

            String[] array = bufferedReader.readLine()
                                           .trim()
                                           .split(" ");
            String[] array2 = bufferedReader.readLine()
                                            .trim()
                                            .split(" ");

            int[] integerArray = new int[arraySize1];
            int[] integerArray2 = new int[arraySize1];

            for (int j = 0; j < arraySize1; j++) {
                integerArray[j] = Integer.parseInt(array[j]);
                integerArray2[j] = Integer.parseInt(array2[j]);
            }

            System.out.println(MinimumStations.getMinStations(integerArray, integerArray2));
        }
    }
}
