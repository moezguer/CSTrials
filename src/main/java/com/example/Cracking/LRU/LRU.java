package com.example.Cracking.LRU;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {
    private HashMap<Integer, Integer> hashMap;

    public LRU() {
        this.hashMap = new LinkedHashMap<>();
    }

    public void setLRU(int key, int value) {
        hashMap.put(key, value);
    }

    public int getLRU(int key) {
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        } else {
            return -1;
        }
    }

    public void printLRUList() {

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
