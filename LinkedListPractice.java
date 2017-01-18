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
            System.err.println("empty array.");
        }
        else if (head.next == null) {
            System.out.print(head.item + ".");
        }
        else {
            System.out.print(head.item + " => ");
            printLL(head.next);
        }
        
    }
    
    static Node removeNode(Node head, int target) {
     
        Node headcopy = head;
        
        if (head == null) {
            System.err.println(target + " was not found.");
        }
        else if (headcopy.next.item == target) {
            headcopy.next = headcopy.next.next;
        }
        else {
         
            headcopy.next = removeNode(headcopy.next, target);
            
        }
        
        return head;
        
    }
    
    static Node addtofront(Node head, int target) {
     
        head = new Node(target, head);
        
        return head;
        
    }
    
    static Node insertinorder(Node head, int target) {
        
        Node headcopy = head;
        
        if (head == null) {
            
            head = new Node(target, head);
            
        }
        
        else if (headcopy.next.item > target) {
            
            headcopy.next = new Node(target, headcopy.next);
            
        }
        
        else {
            
            headcopy.next = insertinorder(headcopy.next, target);
            
        }
     
        return head;
        
    }
    
    public static void main(String[] args) {
        
        Node head = new Node(3, new Node(6, new Node(9, new Node(12))));

        printLL(head);
        System.out.println();
        printLL(removeNode(head, 6));
        System.out.println();
        printLL(insertinorder(head, 6));
        
    }
}