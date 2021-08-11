package com.mycompany.datastructure;

public class SinglyLinkedList  {
    class newNode{
        newNode next;
        int data;
        public newNode(int data){
            this.next = null;
            this.data = data;
        }
    }
    
    static newNode head;
    
    public void insertBack (int data){
        if (head == null){
            head = new newNode(data);
        }
        else {
            newNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new newNode(data);
        }
    }
    
    public void insertFront (int data){
        if (head == null){
            head = new newNode(data);
        }
        else{
            newNode n = new newNode(data);
            n.next = head;
            head = n;
        }
    }
    
    public void ListLingth (SinglyLinkedList l){
        int counter =0;
        newNode temp = head;
        while (temp != null){
            counter++;
            temp = temp.next;
        }
        System.out.println(counter);
    }
    
    public void deleteBack (){
        if (head == null){
            return;
        }
        else if (head.next == null){
            head = null;
        }
        else {
            newNode temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;       
        }
       
    }
    
    public void deleteFront(){
    
    }
    
    public void printLinkedList(SinglyLinkedList l){
        if (head == null){
        System.out.println("Emptyy");
        return;
        }
        newNode temp=head;
        while(temp.next != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    
    }
    
    
}
