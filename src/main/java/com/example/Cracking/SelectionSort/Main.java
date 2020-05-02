package com.example.Cracking.SelectionSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 40; i > 0; i--) {

            integerArrayList.add(i);

        }

        SelectionSort.sortBySelection(integerArrayList);

        System.out.println();

        for (int i : integerArrayList) {
            System.out.print(i + " ");
        }

    }
}
