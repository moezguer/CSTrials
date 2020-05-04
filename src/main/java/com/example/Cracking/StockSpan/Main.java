package com.example.Cracking.StockSpan;

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

            getMaxProfit(integerArray);
            System.out.println();
        }
    }

    public static void getMaxProfit(int[] array) {
        int minima = 0;
        int maxima = 0;
        int count = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] >= array[maxima]) {
                maxima = i;
                if (maxima == array.length - 1) {
                    System.out.print("(" + minima + " " + maxima + ") ");
                    count++;
                }
            } else {
                if (maxima != minima) {
                    System.out.print("(" + minima + " " + maxima + ") ");
                    count++;
                }
                minima = i;
                maxima = i;
            }
        }

        if (count == 0) {
            System.out.print("No Profit");
        }
    }
}
