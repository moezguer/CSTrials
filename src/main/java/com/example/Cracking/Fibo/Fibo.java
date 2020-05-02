package com.example.Cracking.Fibo;

import java.util.HashMap;

public class Fibo {

    public static int fiboRec(int data) {
        if (data == 0) {
            return 0;
        } else if (data == 1) {
            return 1;
        } else {
            return fiboRec(data - 1) + fiboRec(data - 2);
        }
    }

    public static int fiboRecMemo(int data, HashMap<Integer, Integer> hashMap) {

        hashMap.put(0, 0);
        hashMap.put(1, 1);

        if (data == 0) {
            return 0;
        } else if (data == 1) {
            return 1;
        } else {
            if (hashMap.containsKey(data)) {
               return hashMap.get(data);
            }
            int result = fiboRecMemo(data-1, hashMap) + fiboRecMemo(data - 2, hashMap);
            hashMap.put(data, result);
            return result;
        }
    }
}
