package com.mycompany.datastructure;
public class CircularLinkedList {
    class newNode{
        newNode next;
        int data;
        public newNode(int data){
            this.next = null;
            this.data = data;
        }
    }
    
    
    newNode head,last;
    
    public void insertBack (int data){
        if (isEmpty()){
            head = new newNode(data);
            last = head;
        }
        else {
            newNode n = new newNode(data);
            last.next = n;
            last = n;   
        
        }
        last.next = head;
    }
    public void printCLL(CircularLinkedList cl){
        newNode temp = head;
        while (temp.next != head){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        else
            return false;    
    }
    
}
