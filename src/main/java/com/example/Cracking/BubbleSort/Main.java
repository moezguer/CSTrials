package com.example.Cracking.BubbleSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 999; i > 0; i--) {

            integerArrayList.add(i);

        }

        //BubbleSort.sortByBubble(integerArrayList);
        //BubbleSort.sortByBubbleNew(integerArrayList);
        BubbleSort.sortBySelection(integerArrayList);

        System.out.println();

        for (int i : integerArrayList ) {
            System.out.print(i + " ");
        }


    }
}
