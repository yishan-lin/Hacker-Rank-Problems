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
    
    void deleteduplicates(Node head) {
        
        
    }
    
    public static void main(String[] args) {
        
      Node head = new Node(3, new Node(6, new Node(1, new Node(8, new Node(3, new Node(7, new Node(10)))))));  
      
      
        
    }
    
}