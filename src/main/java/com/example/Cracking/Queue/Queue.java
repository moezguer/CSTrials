package com.example.Cracking.Queue;

public class Queue<T> {

    Node head;
    Node tail;

    public Queue() {
        head = tail = null;
    }

    public void enqueue(T data) {
        Node node = new Node(data);

        if (tail == null) {
            tail = node;
            head = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    public T dequeue() throws Exception {

        T data = null;

        if (head == null) {
            throw new Exception("No element");
        } else {
            data = (T) head.data;
            head = head.next;
            return data;
        }
    }

    public T peek() throws Exception {

        T data = null;

        if (head == null) {
            throw new Exception("No element");
        } else {
            data = (T) head.data;
            return data;
        }


    }

    public void printQueue() throws Exception {
        Node runner = new Node();
        runner = head;

        if (tail == null) {
            throw new Exception("No element");
        } else {
            while (runner != null) {
                System.out.print(runner.data + " ");
                runner = runner.next;
            }
        }

        System.out.println();

    }

    public boolean isEmpty(){
        return head == null;
    }

    protected class Node<T> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        Node() {
            this.next = null;
        }
    }
}
