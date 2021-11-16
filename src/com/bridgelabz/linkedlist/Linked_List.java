package com.bridgelabz.linkedlist;

public class Linked_List {
    Node head;

    public static void main(String[] args) {
        Linked_List linkedList = new Linked_List();
        linkedList.insert(70);
        linkedList.insert(30);
        linkedList.insert(56);
        linkedList.show();
    }

    // 'insert()' will add/insert node at first position
    public void insert(int data) {
        // created object of 'Node' class
        Node node = new Node();

        //Creating and initializing node of the linked-list
        node.data = data;
        node.next = null;   // at the time of node creation, the 'next' will not refer to any other node

        node.next = head;   // inserting node at first position by referring 'next' to head

        head = node;        // assign that node as a head
    }

    // print the Linked-list
    public void show() {
        Node node = head;    
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}