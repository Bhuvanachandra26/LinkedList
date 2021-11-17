package com.bridgelabz.linkedlist;

import linkedlist.Linked_List;

public class Stack {
    Linked_List linkedList = new Linked_List();

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.show();
    }

    public void push(int data){
       linkedList.insert(data);
    }

    public void show(){
        linkedList.show();
    }
}