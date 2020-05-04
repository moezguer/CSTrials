package com.example.Cracking.TrappinRainWater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTest = Integer.parseInt(bufferedReader.readLine());

        for (int t = 0; t < numberOfTest; t++) {

            int arraySize = Integer.parseInt(bufferedReader.readLine());

            String[] arrayStr = bufferedReader.readLine()
                                              .replace("  ", " ")
                                              .split(" ");

            int[] ar = new int[arraySize];

            for (int j = 0; j < arraySize; j++) {
                ar[j] = Integer.parseInt(arrayStr[j]);
            }

            System.out.println();
            System.out.println(findTrapperWater(ar));
        }
    }

    public static int findTrapperWater(int[] array) {
        int trappedWater = 0;
        int[] reverseMaximum = new int[array.length];
        int max = Integer.MIN_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                reverseMaximum[i] = max;
            }
            reverseMaximum[i] = max;
        }

        max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            trappedWater += Math.min(max, reverseMaximum[i]) - array[i];
        }
        return trappedWater;
    }

}
