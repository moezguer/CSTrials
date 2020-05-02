package com.example.Cracking.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(2);
        linkedList.addFirst(1);

        System.out.println(LinkedList.isPalindrome(linkedList.head));
    }

}
