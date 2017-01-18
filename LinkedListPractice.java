public class LinkedListPractice {
    
    static class Node {
        
        public int item;
        public Node next;
        
        public Node() {
            
            item = 0;
            next = null;
            
        }
        
        public Node(int x) {
            
            item = x;
            next = null;
            
        }
        
        public Node(int x, Node y) {
            
            item = x;
            next = y;
            
        }
        
    };
    
    static void printLL(Node head) {

        if (head == null) {
            System.out.println("empty array.");
        }
        
        else if (head.next == null) {
            System.out.print(head.item + ".");            
        }
        
        else {
            
            System.out.print(head.item + " =>");
            printLL(head.next);
        }
        
    }
    
    public static void main(String[] args) {
        
        Node head = new Node(3, new Node(6, new Node(9, new Node(12))));
        
        printLL(head);
        
    }
}