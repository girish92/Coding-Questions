
// VMWare Coding Interview: Oct 31st, 2017

// Write a LinkedList Class with the following functions:
//     1. Insert
//     2. Reverse
//     3. Print

// Possible Test Cases:

//     1. Input with duplicates at the start (head): 1,1,1,2,3,4
//     2. Input with duplicates at the end (tail): 1,2,3,4,4,4
//     3, Input with no duplicates (all distinct): 1,2,3,4
//     4. Input with all duplicates: 1,1,1,1 
//     5. Input with one element: 1
//     6. Inout with each element having duplicate: 1,1,2,3,2,4,3,4


public class LinkedList{
    
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int num){
            this.data = num;
            this.next = null;
        }
    }
    
    public void insert(int num){
        if(head == null){
            head = new Node(num);
            return;
        }
        
        Node new_node = new Node(num);
        new_node.next = null;

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new_node;
        return;
    }
    
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }
    
    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    

     public static void main(String []args){
         LinkedList ll = new LinkedList();
         
         ll.insert(1);
         ll.insert(2);
         ll.insert(3);
         
         ll.print();
         
         ll.reverse();
         
         ll.print();
     }
}