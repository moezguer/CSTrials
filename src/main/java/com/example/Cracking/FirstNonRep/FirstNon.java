package com.example.Cracking.FirstNonRep;

import java.util.ArrayList;
import java.util.HashSet;

public class FirstNon {
    public static void getFirstNon (ArrayList<Character> arrayList){
        HashSet<Character> characterHashSet = new HashSet<>();
        Character c;
        Character current = null;

        for (int i = 0; i < arrayList.size() ; i++) {
            c = arrayList.get(i);
            if (characterHashSet.contains(c)) {
                current = null;
            } else {
                current = c;
            }
        }

        if (current == null) {
            System.out.println("-1");
        } else {
            System.out.println(current);
        }
    }
}
