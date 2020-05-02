package com.example.Cracking.BubbleSort;

import java.util.ArrayList;

public class BubbleSort {

    public static ArrayList<Integer> sortByBubble(ArrayList<Integer> arrayList) throws Exception {

        int runner = 1;
        int temp;

        if (arrayList.isEmpty()) {
            throw new Exception("No element");
        } else if (arrayList.size() == 1) {
            return arrayList;
        } else {
            while (runner < arrayList.size()) {

                for (int index = 0; index < arrayList.size() - 1; index++) {

                    if (arrayList.get(index) > arrayList.get(index + 1)) {
                        temp = arrayList.get(index);
                        arrayList.set(index, arrayList.get(index + 1));
                        arrayList.set(index + 1, temp);
                    }
                }
                runner++;

                for (int i : arrayList) {
                    System.out.print(i + " ");
                }

                System.out.println();
            }
            return arrayList;

        }
    }

    public static void sortByBubbleNew(ArrayList<Integer> arrayList) {

        int size = arrayList.size();
        int temp;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (arrayList.get(j) >= arrayList.get(j + 1)) {
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
    }

    public static void sortBySelection(ArrayList<Integer> arrayList) {
        int size = arrayList.size();
        int temp;

        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arrayList.get(j) < arrayList.get(minIndex)) {
                    minIndex = j;
                }
            }

            temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(minIndex));
            arrayList.set(minIndex, temp);

        }
    }

}
