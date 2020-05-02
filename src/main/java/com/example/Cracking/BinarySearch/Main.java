package com.example.Cracking.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 4; i++) {

            int value = random.nextInt(100);
            integerArrayList.add(1);
            integerArrayList.add(3);
            integerArrayList.add(4);
            Collections.sort(integerArrayList);
        }

        integerArrayList.forEach(x -> System.out.print(x + " "));
        System.out.println();

;
        InputStream in = null;
        System.out.println("enter data to search");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int data = Integer.parseInt(bufferedReader.readLine());


        System.out.println("First Index: " + BinarySearch.binarySearchFirstIndex(integerArrayList, data));
        System.out.println();
        System.out.println("Second Index: " + BinarySearch.binarySearchLastIndex(integerArrayList, data));
        System.out.println();
        System.out.println("# of occurences: " + BinarySearch.binarySearchMaxOccurence(integerArrayList, data));

    }
}
