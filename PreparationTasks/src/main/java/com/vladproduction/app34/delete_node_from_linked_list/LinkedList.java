package com.vladproduction.app34.delete_node_from_linked_list;

public class LinkedList {

    public static void main(String[] args) {
       /*Node head = null;
       head = push(head, 5);
       head = push(head, 4);
       head = push(head, 3);
       head = push(head, 2);
       head = push(head, 1);
       System.out.println("Created Linked list is: ");
       printList(head);

       // Delete node at position 2
       deleteNode2(head, 2);

       System.out.println("\nLinked List after Deletion at position 2: ");
       printList(head);*/

        //version for deleting position 1:
        Node head = null;
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        System.out.println("Created Linked list is: ");
        printList(head);

        // Delete node at position 1
        head = deleteNode2(head, 1);

        System.out.println("\nLinked List after Deletion at position 1: ");
        printList(head);

    }


    public static Node push(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void deleteNode(Node head, int position) {

        // List is empty
        if (head == null) {
            return;
        }

        // If position is 1st, removing head node
        if (position == 1) {
            head = head.next;
            return;
        }
        Node prevNode = head;
        int i = 2;
        while (prevNode != null && i != position) {
            prevNode = prevNode.next;
            i++;
        }
        // When position is more than number of node
        if (prevNode == null || prevNode.next == null) {
            return;
        }
        prevNode.next = prevNode.next.next;
    }

    //solution for if we want to delete the first element:
    public static Node deleteNode2(Node head, int position) {
        // List is empty
        if (head == null) {
            return head;
        }

        // If position is 1st, removing head node
        if (position == 1) {
            head = head.next;
            return head;
        }
        Node prevNode = head;
        int i = 2;
        while (prevNode != null && i != position) {
            prevNode = prevNode.next;
            i++;
        }
        // When position is more than number of node
        if (prevNode == null || prevNode.next == null) {
            return head;
        }
        prevNode.next = prevNode.next.next;
        return head;
    }

    public static void printList(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }


}