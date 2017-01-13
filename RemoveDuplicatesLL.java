/*Write code to remove duplicates from an unsorted linked list*/

import java.util.Hashtable;
import java.util.Set;
import java.util.*;

public class RemoveDuplicatesLL {
    
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
    
    static List findduplicates(Node head) {
        
        Hashtable<Integer, Integer> linkedlistitems = new Hashtable<Integer, Integer>();
        
        while (head != null) {
            
            if (linkedlistitems.containsKey(head.item)) {
                
                linkedlistitems.put(head.item, 1 + linkedlistitems.get(head.item));
                
            }
            
            else {
                
                linkedlistitems.put(head.item, 1);
                
            }
            
            head = head.next;
            
        }
        
        Set<Integer> linkedlistkeys = linkedlistitems.keySet();
        List<Integer> duplicates = new ArrayList<Integer>();
        
        System.err.println("Here are all the duplicate integers.");
        
        int count = 0;
        
        for (int x: linkedlistkeys) {
            
            if (linkedlistitems.get(x) > 1) {
                
                duplicates.add(x);
                
            }
        }
        
        return duplicates;
        
    }
    
    static Node deleteduplicates(Node head, List duplicates) {
        
        Node headcopy = head;
        
        int x = 0;
        
        while (x < duplicates.size() && headcopy != null) {
         
            System.out.println("x = " + x);
            System.out.println("headcopy.item = " + headcopy.item);
            
            headcopy = headcopy.next;
            x +=1;
            
        }
        
        return null;
    }
    
    static void printLL(Node head) {
        
        if (head == null) {
            
            System.out.println("empty array");
            
        }
        
        else if (head.next == null) {
            
            System.out.print(head.item + ".");
            
        }
        
        else {
            
            System.out.print(head.item + " => ");
            printLL(head.next);
            
        }
        
    }
    
    public static void main(String[] args) {
        
        Node head = new Node(4, new Node(2, new Node(5, new Node(8, new Node(4, new Node(10, new Node(8)))))));
        
        printLL(head);
        
        System.out.println(findduplicates(head));
        
        printLL(deleteduplicates(head, findduplicates(head)));
        
        
    }
    
}