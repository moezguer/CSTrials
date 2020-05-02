package com.example.Cracking.InPlaceQuickSort;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    @Test public void testInPlaceQuickSort() {

        //ArrayList<Integer> list = generateRandomList(4, 10);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(5);
        list.add(9);
        list.forEach(x -> System.out.print(x + " "));

        System.out.println();
        InPlaceQuickSort.inPlaceQuickSort(list, 0, list.size()-1);

        list.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    private ArrayList<Integer> generateRandomList(int size, int max) {

        final ArrayList<Integer> list = new ArrayList<>();

        final Random rand = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(max));
        }

        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        return list;
    }
}
