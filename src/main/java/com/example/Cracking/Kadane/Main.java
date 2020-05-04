package com.example.Cracking.Kadane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int numberOfTest;
        int arraySize;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        numberOfTest = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfTest; i++) {

            arraySize = Integer.parseInt(bufferedReader.readLine());
            String[] array = bufferedReader.readLine()
                                           .split(" ");

            int[] array2 = new int[arraySize];

            for (int j = 0; j < arraySize; j++) {
                array2[j] = Integer.parseInt(array[j]);
            }
            System.out.println(Kadane.getKadane(array2));
        }
    }


}
