package com.mycompany.datastructure;

public class SinglyLinkedList {
    Node head;
    
    public void insert (int data){
        if (head == null){
            head = new Node(data);
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }
    
    public void printLinkedList(SinglyLinkedList l){
        Node temp=head;
        while(temp.next != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    
    }
}
