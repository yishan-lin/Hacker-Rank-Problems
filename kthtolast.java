public class kthtolast {
    
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
    
    private static int count = 0;
    
    static void kthtolast(Node head, int k) {
        
        while (head != null) {
            
            count += 1;
            
            if (count == k) {
                
                while (head != null) {
             
                System.out.println(head.item);
                
                head = head.next;
                
                }
                
            }
            
            else {
            
            //System.out.println("head.item = " + head.item + " @ " + count);
            
            head = head.next;
            
            }
            
        }
        
        
    }
    
    public static void main(String[] args) {
        
        Node head = new Node(3, new Node(6, new Node(9, new Node(12))));
        
        kthtolast(head, 2);
        
    }
    
}