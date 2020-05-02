package com.example.Cracking.NonRepeated;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeated {
    public static Character getNonrepeatedFirstChar(String data) {
        HashMap<Character, Integer> characterHashSet = new LinkedHashMap<>();
        for (int i = 0; i < data.length(); i++) {
            if (!characterHashSet.containsKey(data.charAt(i))) {
                characterHashSet.put(data.charAt(i), 1);
            } else {
                characterHashSet.put(data.charAt(i), characterHashSet.get(data.charAt(i)) + 1);
            }
        }
        return getMinFreq(characterHashSet);
    }

    public static Character getMinFreq(HashMap<Character, Integer> hashMap) {

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}
