package com.example.Cracking.InsertionSort;

import java.util.ArrayList;

public class InsertionSort {

    public static ArrayList<Integer> sortByInsertion(ArrayList<Integer> arrayList) throws Exception {

        int temp;
        int minValue;

        if (arrayList.isEmpty()) {
            throw new Exception("No element");
        } else if (arrayList.size() == 1) {
            return arrayList;
        } else {
            for (int start = 0; start < arrayList.size(); start++) {
                for (int runner = start; runner < arrayList.size(); runner++) {

                    if (arrayList.get(runner) < arrayList.get(start)){

                        temp = arrayList.get(start);
                        arrayList.set(start, arrayList.get(runner));
                        arrayList.set(runner, temp);

                    }

                }

                for (int i : arrayList) {

                    System.out.print(i + " ");

                }
                System.out.println();
            }

            return arrayList;
        }
    }
}
