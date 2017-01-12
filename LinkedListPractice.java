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
        
        if (head == null) {
            
            return new Node(target);
            
        }
        
        if (head.next == null) {
            
            head.next = new Node (target, null);
            
        }
        
        else {
            
            head.next = addtorear(head.next, target);
            
        }
        
        return head;
        
    }
    
    static Node insertinOrder(Node head, int target) {
        
        if (head == null) {
            
            return new Node(target);
            
        }
        
        else if (head.item > target) {
            
            return new Node(target, head);
            
        }
        
        else {
            
            head.next = insertinOrder(head.next, target);
            
        }
        
        return head;
        
    }
    
    static Node delete(Node head, int target) {
        
        if (head == null) {
            System.out.println("empty array");
            return null;
        }
        
        else if (head.item == target) {
            return head.next;
        }
        
        else {
            Node headcopy = head.next;
            
            while (headcopy.next != null) {
                
                System.out.println("traversal!");
                
                if (headcopy.next.item == target) {
                    
                    System.out.println("found target!");
                    System.out.println(headcopy.item);
                    System.out.println(headcopy.next.item);
                    
                    headcopy.next = headcopy.next.next;
                    
                }
                
                headcopy = headcopy.next;
            }
            
            return head;
            
        }
    }
    
    
    public static void main(String[] args) {
        
        Node head = new Node (3, new Node(6, new Node(9, new Node (12))));
        
        printLL(delete(head, 9));
        
        
        
        /*printLL(head);
         System.out.println();
         printLL(emptyLL);
         
         printLL(addtofront(head, 10));
         
         System.out.println();
         
         printLL(addtorear(head, 14));
         
         System.out.println();
         
         printLL(insertinOrder(head, 10));
         
         System.out.println();
         
         printLL(insertinOrder(head, 2));
         
         System.out.println();
         
         printLL(insertinOrder(head, 7));
         
         System.out.println();
         
         System.err.println("testing delete");
         
         printLL(delete(head, 6));
         
         System.out.println();*/
        
    }
    
}