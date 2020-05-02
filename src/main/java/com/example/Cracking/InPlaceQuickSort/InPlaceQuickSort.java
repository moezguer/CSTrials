package com.example.Cracking.InPlaceQuickSort;

import java.util.ArrayList;

public class InPlaceQuickSort {

    public static void inPlaceQuickSort(ArrayList<Integer> arrayList, int start, int end) {

        while (start < end) {

            int partition = partition(arrayList, start, end);
            if (start < partition) {
                inPlaceQuickSort(arrayList, start, partition);
            }
            if (partition + 1 < end) {
                inPlaceQuickSort(arrayList, partition + 1, end);
            }
        }

    }

    public static int partition(ArrayList<Integer> arrayList, int start, int end) {

        int pivot = start + (end - start) / 2;

        start = start - 1;
        end = end + 1;

        while (start < end) {
            do {
                start++;
            } while (arrayList.get(start) < arrayList.get(pivot));
            do {
                end--;
            } while (arrayList.get(end) > arrayList.get(pivot));

            if (start >= end) {
                return end;
            }

            int temp = arrayList.get(start);
            arrayList.set(start, arrayList.get(end));
            arrayList.set(end, temp);
            start++;
            end--;
        }

        return end;
    }
}
