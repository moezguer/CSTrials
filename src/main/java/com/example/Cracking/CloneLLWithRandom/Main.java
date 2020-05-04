package com.example.Cracking.CloneLLWithRandom;

public class Main {

    public static void main(String[] args) {

        // Pushing data in the linked list.
        CloneLLRandom.LinkedList list = new CloneLLRandom.LinkedList(new CloneLLRandom.Node(5));
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(2);

        // Setting up random references.
        list.head.random = list.head.next.next;
        list.head.next.random =
                list.head.next.next.next;
        list.head.next.next.random =
                list.head.next.next.next.next;
        list.head.next.next.next.random =
                list.head.next.next.next.next.next;
        list.head.next.next.next.next.random =
                list.head.next;

        // Making a clone of the original linked list.
        CloneLLRandom.LinkedList clone = list.clone();

        // Print the original and cloned linked list.
        System.out.println("Original linked list");
        list.print();
        CloneLLRandom.Node runner = list.head;
        while (runner != null) {
            runner.data = 0;
            runner = runner.next;
        }
        System.out.println("\nCloned linked list");
        clone.print();
        System.out.println();

        System.out.println("Original linked list");
        list.print();

        System.out.println();
    }

}
