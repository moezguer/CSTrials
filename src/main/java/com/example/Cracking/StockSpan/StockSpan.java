package com.example.Cracking.StockSpan;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {

    public static int getStockSpan(ArrayList<Integer> inputArrayList, int index){
        Stack<Integer> integerStack = new Stack<>();

        for (int i = 0; i < inputArrayList.size(); i++) {
            

            if (integerStack.isEmpty()) {
                return 1;
            } else {

            }
            integerStack.push(inputArrayList.get(i));
        }

        return 1;
    }
}
