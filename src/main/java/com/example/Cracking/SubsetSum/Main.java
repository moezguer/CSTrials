package com.example.Cracking.SubsetSum;

import com.example.Cracking.Kadane.Kadane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int numberOfTest;
        int arraySize;
        int targetSum;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        numberOfTest = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfTest; i++) {
            String[] array1 = bufferedReader.readLine()
                                           .split(" ");
            arraySize = Integer.parseInt(array1[0]);
            targetSum = Integer.parseInt(array1[1]);

            String[] array2 = bufferedReader.readLine()
                                           .split(" ");

            int[] integerArray = new int[arraySize];

            for (int j = 0; j < arraySize; j++) {
                integerArray[j] = Integer.parseInt(array2[j]);
            }
            SubsetSum.printSubsetWithSum(integerArray, targetSum);
        }
    }
}
