package com.app.vp.chapter_7_collections.tasks.task1;

public class SinglyLinkedList {
    private MyNode head;// Head node of the linked list

    public SinglyLinkedList() {
        this.head = null;
    }

    //add method
    public void add(int data){
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;  // If list is empty, make the new node the head
            return;
        }
        MyNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode; // Add the new node at the end
    }

    //print method
    public void printList(){
        MyNode current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
