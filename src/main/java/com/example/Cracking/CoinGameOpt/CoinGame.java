package com.example.Cracking.CoinGameOpt;

import java.util.ArrayList;

public class CoinGame {

    public static int maxGain(ArrayList<Integer> arrayList) {

        if (arrayList.size() == 0) {
            return -1;
        } else if (arrayList.size() == 1) {
            return arrayList.get(0);
        } else {
            ArrayList<Integer> arrayList1 = arrayList;
            int count = 0;

            while (!arrayList.isEmpty()) {
                count += maxIndexValue(arrayList1);
                maxIndexValue(arrayList1);
            }
            return count;
        }
    }

    public static int maxIndexValue(ArrayList<Integer> arrayList) {

        if (arrayList.size() == 1) {
            int result = arrayList.get(0);
            arrayList.remove(0);
            return result;
        }

        int first = arrayList.get(0);
        int last = arrayList.get(arrayList.size() - 1);
        int beforeFirst = arrayList.get(1);
        int beforeLast = arrayList.get(arrayList.size() - 2);

        if (first <= last) {
            if (beforeLast <= last) {
                arrayList.remove(arrayList.size() - 1);
                return last;
            } else {
                arrayList.remove(0);
                return first;
            }
        } else {
            if (beforeFirst <= first) {
                arrayList.remove(0);
                return first;
            } else {
                arrayList.remove(arrayList.size() - 1);
                return last;
            }
        }
    }
}
