package com.bridgelabz.linkedlist;
import linkedlist.LinkedList_UC9;

public class Queue {
    LinkedList_UC9 linkedList = new LinkedList_UC9();

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.show();
    }

    public void enqueue(int data){
        linkedList.append(data);
    }

    public void show(){
        linkedList.show();
    }
}