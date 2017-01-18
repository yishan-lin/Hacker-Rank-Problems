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
    
    static void deletemiddleNode(Node head) {
     
        Node headcopy = head;
        
        while (headcopy != null) {
            
            count += 1;
            System.out.println(head.item + " @ " + count);
            headcopy = headcopy.next;
            
        }
        
        System.out.println("the length of the head = " + count);
        
        int halfway = count/2;
        
        int second_count = 0;
        
        Node previous = head;
        
        while (head != null) {
            
            second_count += 1;
            
            if (second_count == halfway) {
                
                previous.next = head.next;
            }
            
            previous = head;
            head = head.next;
            
        }
        
    }
      
    public static void main(String[] args) {
        
        Node head = new Node(3, new Node(6, new Node(9, new Node(12))));
        deletemiddleNode(head);
    }
    
}