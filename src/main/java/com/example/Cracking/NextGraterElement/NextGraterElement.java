package com.example.Cracking.NextGraterElement;

import java.util.Stack;

public class NextGraterElement {

    public static void printNGE(int[] data) {
        int next = 1;
        Stack<Integer> stack = new Stack<>();
        if (data.length == 0) {
            System.out.println("No Element");
        } else if (data.length == 1) {
            System.out.println(data[0]);
        } else {
            while (next <= data.length) {
                if (next == data.length) {
                    stack.push(-1);
                    break;
                }
                if (data[next - 1] < data[next]) {
                    stack.push(data[next]);
                } else {
                    stack.push(data[next - 1]);
                }
                next++;
            }
        }
        stack.forEach(x -> System.out.print(x + " "));
    }
}
