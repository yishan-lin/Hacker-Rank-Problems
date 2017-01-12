/*Write code to remove duplicates from an unsorted linked list*/

import java.util.Hashtable;
import java.util.Set;

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
    
    static void findduplicates(Node head) {
        
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
        
        for (int x: linkedlistkeys) {
            
            System.out.println("Key: " + x + " # Occurences: " + linkedlistitems.get(x));
         
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        Node head = new Node(4, new Node(2, new Node(5, new Node(8, new Node(4, new Node(10, new Node(8)))))));
        
        findduplicates(head);
        
    }
    
}