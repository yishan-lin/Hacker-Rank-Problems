/*Write code to remove duplicates from an unsorted linked list*/

import java.util.Hashtable;

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
        
        
        while (head.next != null) {
            
            System.out.print(head.item + " => ");
            
            head = head.next;

            if (head.next == null) {
                
                System.out.print(head.item + ".");
                
            }
            
        }
        
    }
    
    
    public static void main(String[] args) {
        
        Node head = new Node(4, new Node(2, new Node(5, new Node(8, new Node(4, new Node(10, new Node(8)))))));
        
        findduplicates(head);
        
    }
    
}