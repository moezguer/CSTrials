package com.example.Cracking.MergeSort;

import java.util.ArrayList;

public class MergeSort {

    public static ArrayList<Integer> sortByMerging(ArrayList<Integer> arrayList) throws Exception {

        if (arrayList.isEmpty()) {
            throw new Exception("No element");
        } else if (arrayList.size() == 1) {
            return arrayList;
        } else {
            ArrayList<Integer> firstArrayList = new ArrayList<>();
            ArrayList<Integer> secondArrayList = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {

                if (i < arrayList.size() / 2) {
                    firstArrayList.add(arrayList.get(i));
                } else {
                    secondArrayList.add(arrayList.get(i));
                }
            }
            return mergeArrays(sortByMerging(firstArrayList), sortByMerging(secondArrayList));
        }

    }


    protected static ArrayList<Integer> mergeArrays(ArrayList<Integer> integerArrayList1,
                                                    ArrayList<Integer> integerArrayList2) {
        int index1 = 0;
        int index2 = 0;
        ArrayList<Integer> combinedArraylist = new ArrayList<>();

        while (index1 < integerArrayList1.size() && index2 < integerArrayList2.size()) {
            if (integerArrayList1.get(index1) <= integerArrayList2.get(index2)) {
                combinedArraylist.add(integerArrayList1.get(index1));
                index1++;
            } else {
                combinedArraylist.add(integerArrayList2.get(index2));
                index2++;
            }
        }

        if (integerArrayList1.size() > index1) {
            for (int i = index1; i < integerArrayList1.size(); i++) {
                combinedArraylist.add(integerArrayList1.get(i));
            }
        } else if (integerArrayList2.size() > index2) {
            for (int i = index2; i < integerArrayList2.size(); i++) {
                combinedArraylist.add(integerArrayList2.get(i));
            }

        }
        System.out.println("Merge Result: ");
        combinedArraylist.forEach(x -> System.out.print(x + " "));
        System.out.println();

        return combinedArraylist;

    }
}
