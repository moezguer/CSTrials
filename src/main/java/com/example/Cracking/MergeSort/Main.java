package com.example.Cracking.MergeSort;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i<= 10; i++) {

            int value= random.nextInt(100);
            arrayList1.add(value);
            int value2= random.nextInt(100);
            arrayList2.add(value2);
        }

        arrayList1.forEach(x -> System.out.print(x + " "));

        System.out.println();

        arrayList2.forEach(x -> System.out.print(x + " "));

        System.out.println();

        MergeSort.sortByMerging(arrayList1).forEach(x -> System.out.print(x + " "));
        System.out.println();

        //MergeSort.mergeArrays(arrayList1, arrayList2).forEach(x -> System.out.print(x + " "));

    }
}
