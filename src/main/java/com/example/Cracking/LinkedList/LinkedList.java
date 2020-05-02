package com.example.Cracking.LinkedList;

import java.util.HashSet;
import java.util.Stack;

public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    public void addFirst(int data) {

        Node node = new Node(data);

        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        Node runner = new Node();
        runner = head;
        if (head == null) {
            head = node;
        } else {
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = node;
        }
    }

    public void changeLastPointer() throws Exception {

        Node runner = new Node();
        runner = head;

        if (head == null) {
            throw new Exception("No element");
        } else {
            while (runner.next != null) {
                runner = runner.next;
            }

            runner.next = head.next;
        }

    }

    public void printLinkedList() throws Exception {
        Node runner = new Node();
        runner = head;

        if (head == null) {
            throw new Exception("No element");
        } else {
            while (runner != null) {
                System.out.print(runner.data + " ");
                runner = runner.next;
            }
        }

        System.out.println();

    }

    public boolean detectCycles() throws Exception {
        HashSet<Integer> visited = new HashSet<>();
        Node runner = head;

        if (head == null) {
            throw new Exception("No element");
        } else {

            while (runner != null && !visited.contains(runner.data)) {
                visited.add(runner.data);
                runner = runner.next;
            }
            return runner != null;
        }

    }

    public boolean detectCyclesFaster() throws Exception {

        if (head == null) {
            throw new Exception("No element");
        } else {
            Node runner = head;
            Node fastRunner = head.next;

            while (fastRunner.next != null && fastRunner.next.next != null) {
                if (fastRunner.equals(runner)) {
                    return true;
                } else {
                    runner = runner.next;
                    fastRunner = fastRunner.next.next;
                }
            }
            return false;
        }

    }

    public static boolean isPalindrome(Node head){
        Node node = head;
        int counter = 1;
        Stack<Integer> stack = new Stack<>();

        if (node == null) {
            return false;
        }

        while (node != null) {
            stack.push(node.data);
            node = node.next;
        }

        node= head;

        while (node != null) {
            if (node.data == stack.peek()) {
                stack.pop();
            } else {
                return false;
            }
            node = node.next;
        }

        return true;
    }

    public int getNthFromLast(Node head, int n){
        Node nodeSlow = head;
        Node nodeFast = head;
        for (int i = 0; i < n ; i++) {
            if (nodeFast.next != null) {
                nodeFast = nodeFast.next;
            } else {
                return -1;
            }
        }

        while (nodeFast != null) {
            nodeSlow = nodeSlow.next;
            nodeFast = nodeFast.next;
        }
        return nodeSlow.data;
    }

    public void getNthFromLastRemoveLoop(Node head, int n){
        Node nodeSlow = head;
        Node nodeFast = head;
        for (int i = 0; i < n ; i++) {
            if (nodeFast.next != null) {
                nodeFast = nodeFast.next;
            } else {
                return;
            }
        }

        while (nodeFast.next != nodeSlow) {
            nodeSlow = nodeSlow.next;
            nodeFast = nodeFast.next;
        }

        if (nodeFast.next == nodeSlow) {
            nodeFast.next = null;
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public Node rotate(Node head, int k) {
        Node node = head;
        Node runner = head;
        Node last = head;
        int counter = 1;

        while (runner != null) {

            if (runner.next == null) {
                if (counter == k) {
                    return head;
                }

            } else {

                if (counter == k) {

                    node = runner.next;
                    last = runner;
                }
                runner = runner.next;

            }
        }

        runner.next = head;
        last.next = null;
        head = node;
        return head;
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            next = null;

        }

        public Node() {
            next = null;

        }
    }


}
