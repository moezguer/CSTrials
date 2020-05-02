package com.example.Cracking.MaxProfit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        int numberOfTest;
        int arraySize;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        numberOfTest = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfTest; i++) {

            arraySize = Integer.parseInt(bufferedReader.readLine());

            String[] array = bufferedReader.readLine()
                                           .trim()
                                           .split(" ");

            int[] integerArray = new int[arraySize];

            for (int j = 0; j < arraySize; j++) {
                integerArray[j] = Integer.parseInt(array[j]);
            }

            MaxProfit.getMaxProfit(integerArray);

        }
    }
}
