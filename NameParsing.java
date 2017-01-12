/*Suppose you have a string like this:"Once there was a woman name:angelina: and a man 
 * name:tony: and their friend name:jane: and ...".  Inside of a long text there are little 
 * "name:" sections. Write code to find and print all the names.*/

public class NameParsing {
    
    static void parsenames (String string) {
        
        boolean notreachedend = true;
        
        while (notreachedend) {
            
            int namebegindex = string.indexOf("name:") + 5;
            
            int nameendindex = string.indexOf(":", namebegindex);
            
            System.out.println(string.substring(namebegindex, nameendindex));
            
            string  = string.substring(nameendindex,string.length());
            
            if (string.indexOf("name:") == -1) {
                
                notreachedend = false;

            }
            
        }
        
    }
    
    public static void main(String[] args) {
        
        String test = "Once there was a woman name:angelina: and a man name:tony: and their friend name:jane: and ...";
        
        parsenames(test);
        
    }
    
}