package com.example.Cracking.MinimumOperations;

import java.util.HashMap;

public class MinOp {

    public static int getMinOp(int data, HashMap<Integer, Integer> hashMap) {
        hashMap.put(0, 0);
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        int result = 0;
        if (hashMap.containsKey(data)) {
            return hashMap.get(data);
        }
        if (data % 2 == 0) {
            result = getMinOp(data / 2, hashMap) + 1;
        } else {
            result = getMinOp(data - 1, hashMap) + 1;
        }
        hashMap.put(data, result);
        return result;
    }
}

