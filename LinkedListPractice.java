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
        
        if (head == null) {
            
            System.out.println("null");
            
        }
        
        else if (head.next == null) {
            
            System.out.print(head.item + ".");
            
        }
        
        else {
            
            System.out.print(head.item + " => ");
            printLL(head.next);
            
        }
    }
    
    static Node addtofront(Node head, int target) {
        
        head = new Node(target, head);
        
        return head;
        
    }
    
    static Node addtorear(Node head, int target) {
        
        if (head.next == null) {
            
            head.next = new Node(target);
            
        }
        
        else {
            
            head.next = addtorear(head.next, target);
            
        }
        
        return head;
        
    }
    
    public static void main(String[] args) {
        
        Node head = new Node (3, new Node(6, new Node(9, new Node (12))));
        Node emptyLL = null;
        
        printLL(head);
        System.out.println();
        printLL(emptyLL);
        
        printLL(addtofront(head, 10));
        
        System.out.println();
        
        printLL(addtorear(head, 14));
    }
    
}