package com.example.Cracking.Stack;

public class Stack {

    protected class Node {

        int data;
        Node next;

    }

    Node head;

    public Stack(){
        this.head = null;
    }

    public void push(int data){

        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public Integer pop(){
        if (head != null) {
            Node temp = head;
            head = head.next;
            return temp.data;
        } else {
            return null;
        }
    }

    public Integer peek(){
        if (head != null) {
            return head.data;
        } else {
            return null;
        }
    }
}
