import java.util.*;

public class RemoveDuplicatesLLwithHashSet {
    
    static class Node {
        
        public int item;
        public Node next;
        
        Node() {
            
            item = 0;
            next = null;
            
        }
        
        Node(int x) {
            
            item = x;
            next = null;
            
        }
        
        Node(int x, Node y) {
            
            item = x;
            next = y;
            
        }
    };
    
    static Node removeduplicates(Node head) {
     
        HashSet<Integer> linkedlist = new HashSet <Integer>();
        Node previous = null;
        Node current = head;
        
        while (current != null) {
            
            if (linkedlist.contains(current.item)) {
             
                previous.next = current.next;
                
            }
            
            else {
             
                linkedlist.add(current.item);
                
                previous = current;
                
            }
            
            current = current.next;
            
        }
        
        return head;
    }
    
    static void printLL(Node head) {
     
        if (head == null) {
            
            System.out.println("can't print out empty arrays.");
            
        }
        
        while (head != null) {
            
            if (head.next == null) {
                
                System.out.print(head.item + ".");
                break;
            
            }
            
            System.out.print(head.item + " => ");
            head = head.next;
        
        }
        
    }
    
    public static void main(String[] args) {
        
        Node head = new Node(3, new Node(6, new Node(1, new Node(8, new Node(3, new Node (6, new Node(7, new Node(10)))))))); 
        System.err.println("Original head:");
        printLL(head);
        System.err.println("After removing duplicates:");
        printLL(removeduplicates(head));
        
//printLL(head);
        //printLL(deleteduplicates(head));
        
        
    }
    
}