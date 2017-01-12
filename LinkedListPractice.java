public class LinkedListPractice {
    
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
    
    static void printLL(Node head) {
     
        if (head.next == null) {
            
            System.out.print(head.item + ".");
            
        }
        
        else {
            
            System.out.print(head.item + " => ");
            printLL(head.next);
            
        }
    }
    
    static Node deleteNode(Node head, int item) {
     
        if (head == null) {
        
            System.out.println("Didn't find " + item + " in LL.");
            return null;
        }
        
        else if (head.item == item) {
            
            System.err.println("Found " + item + "in LL.");
            System.err.println("head.item = " + head.item);
            System.err.println("head.next.item = " + head.next.item);
            System.err.println("head.next.next.item = " + head.next.next.item);
            head.next = head.next.next;

        }
        
        else {
            
            head.next = deleteNode(head.next, item);
        }
        
        return head;
        
    }
    
    public static void main(String[] args) {
        
        Node head = new Node (3, new Node(6, new Node(9, new Node (12))));
        
        printLL(head);
        
        System.out.println();
        
        deleteNode(head, 5);
        
        printLL(deleteNode(head, 9));
    }
    
}