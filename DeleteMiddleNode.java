public class DeleteMiddleNode {
    
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
    
    private static int count = 0;
    
    static int findNodelength(Node head) {
     
        Node headcopy = head;
        
        while (headcopy != null) {
            
            count += 1;
            headcopy = headcopy.next;
            
        }
        
        return count;
    }
    
    
    static Node deletemiddleNode(Node head, int count) {
        
        int halfway = count/2;
        int secondcount = 0;
        Node previous = null;
        
        while (head != null) {
            
            secondcount += 1;
            
            if (secondcount == halfway) {
   
                previous.next = head.next;
                
            }
            
            previous = head;
            head = head.next;
            
            
        }
        

        return head;
        
    }
    
    static void printLL(Node head) {
        
        if (head == null) {
            System.err.println("empty array");
        }
        
        else if (head.next == null) {
            
            System.out.println(head.item + ".");
            
        }
        
        else {
            
            System.out.println(head.item + " => ");
            
            head = head.next;   
        }
        
    }
    
    public static void main(String[] args) {
        
        Node head = new Node(3, new Node(6, new Node(9, new Node(12))));
        int count = findNodelength(head);
        deletemiddleNode(head, count);
        
    }
    
}