package com.example.Cracking.CloneLLWithRandom;

import java.util.HashMap;
import java.util.LinkedList;

public class CloneLLRandom {

    static class Node {

        int data;//Node data
        Node next, random;//Next and random reference

        //Node constructor
        public Node(int data) {
            this.data = data;
            this.next = this.random = null;
        }

    }

    static class LinkedList {

        Node head;//Linked list head reference

        // Linked list constructor
        public LinkedList(Node head) {
            this.head = head;
        }

        // push method to put data always at the head
        // in the linked list.
        public void push(int data) {
            Node node = new Node(data);
            node.next = this.head;
            this.head = node;
        }

        // Method to print the list.
        void print() {
            Node temp = head;
            while (temp != null) {
                Node random = temp.random;
                int randomData = (random != null) ? random.data : -1;
                System.out.println("Data = " + temp.data + ", Random data = " + randomData);
                temp = temp.next;
            }
        }

        public LinkedList clone() {
            if (head == null) {
                return null;
            }

            HashMap<Node, Node> nodeNodeHashMap = new HashMap<>();
            Node cloneHead;
            Node runner = head;

            while (runner != null) {
                nodeNodeHashMap.put(runner, new Node(runner.data));

                runner = runner.next;
            }

            cloneHead = nodeNodeHashMap.get(head);
            runner = head;

            while (runner != null) {
                nodeNodeHashMap.get(runner).next = nodeNodeHashMap.get(runner.next);
                nodeNodeHashMap.get(runner).random = nodeNodeHashMap.get(runner.random);
                runner = runner.next;
            }
            //Implement here
            return new LinkedList(cloneHead);


        }

    }
}
