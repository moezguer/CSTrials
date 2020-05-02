package com.example.Cracking.GroupAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String[] strings = {
                "CARS", "REPAID", "DUES", "NOSE", "SIGNED", "LANE",
                "PAIRED", "ARCS", "GRAB", "USED", "ONES", "BRAG",
                "SUED", "LEAN", "SCAR", "DESIGN"
        };
        printGroupAnagram(strings);
    }

    public static void printGroupAnagram(String[] words) {

        TreeMap<String, ArrayList<String>> hashMap = new TreeMap<>();
        String key;

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            key = Arrays.toString(chars);
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(word);
        }

        for(Map.Entry<String, ArrayList<String>> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (ArrayList<String> s : hashMap.values()) {
            arrayList.add(s.size());
        }
        Collections.sort(arrayList);
        for (Integer i : arrayList) {
            System.out.print(i);
        }
    }

}
