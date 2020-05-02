package com.example.Cracking.NextGreater;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 5, 2, 25};
        //int[] array2 = {4, 2, 2, 1};
        //int[] array3 = {2, 8, 3, 5};
        printNextGreater(array);
        System.out.println();
        //printNextGreater(array2);
        System.out.println();
        //printNextGreater(array3);
    }

    public static void printNextGreater(int[] array) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int arrayValue;

        for (int i = 0 ; i < array.length ; i++) {
            stack.push(array[i]);
        }

        for (int i = array.length -1 ; i >= 0  ; i--) {

            arrayValue = array[i];

            while (!stack.isEmpty()) {
                if (arrayValue == stack.peek()) {
                    System.out.print((-1) + " ");
                    break;
                } else if (arrayValue < stack.peek()) {
                    System.out.print(stack.peek() + " ");
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.print((-1) + " ");
            }
        }
    }
}
