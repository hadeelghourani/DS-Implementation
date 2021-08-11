package com.mycompany.datastructure;
public class DoublyLinkedList {
    class newNode{
        newNode next,prev;
        int data;
        public newNode(int data){
            this.next = null;
            this.data = data;
        }
    }
    
    static newNode head,last;
   
    public void insertBack (int data){
        if (isEmpty()){
            head = new newNode(data);
            head.prev = null;
            last = head;
        }
        else {
            newNode n = new newNode(data);
            last.next = n;
            n.prev = last;
            last = n;           
        
        }
    }
    public void printDLL(DoublyLinkedList dl){
        newNode temp = head;
        while (temp.next != null){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public void delete(DoublyLinkedList dl){
        newNode n = last;
        last.prev.next = null;
        n = null;
    }
    public void deletePos(int data){
        newNode temp = head;
        while (temp != null){
            if (temp.data == data){
                temp.prev.next = temp.next;
                temp = null;
                return;
            }
            temp = temp.next;
        }
    }
    public void DLLLength (DoublyLinkedList dl){
        newNode temp = head;
        int counter =0;
        while(temp != null){
            ++counter;
            temp = temp.next;
        }
        System.out.print (counter);
        temp = null;
    }
    
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        else
            return false;    
    }

    
    
    
}
