public class FinalCAIT {
    
    static String[] findMe(String[] data) {
        
        //INDIVIDUAL STUFF WHERE STUFF CHANGES WITHIN 3 DAYS AFTER AND DOE SOME OTHER STUFF
        
        int currentday = 0;
        int currentprice = 0;
        int nextday = 0;
        
        for (int x = 0; x < data.length; x++) {
            
            String[] datasplit = data[x].trim().split("\\|");
            
            if (data[x].length() <= 5) {
                //this element is price of wheat
                
                currentday = Integer.parseInt(datasplit[0]);
                currentprice = Integer.parseInt(datasplit[1]);
                
                //System.out.println("Current day = " + currentday + " @ $" + currentprice);
                
                //System.err.println("Looking for next day after day: " + currentday);
                
                for (int z = x + 1; z < data.length; z++) {
                    
                    String[] nextdaysplit = data[z].trim().split("\\|");
                    
                    if (data[z].length() <= 5) {
                        
                        nextday = Integer.parseInt(nextdaysplit[0]);
                        
                        //System.out.println("next day = " + nextdaysplit[0]);
                        //System.out.println("next day price = " + nextdaysplit[1]);
                        
                        break;
                        
                    }
                }
                
            }
            
            else {
                //this element is about lightsabers (DAY | NAME | BUY/SELL | AMOUNT
                
                //System.err.println("This is a lightsaber.");
                //System.err.println("Next day = " + nextday);
                
                if ((Math.abs(Integer.parseInt(datasplit[0]) - nextday) <= 3) && ((currentprice*Integer.parseInt(datasplit[3]) >= 4000000))) {
                    
                    System.err.println("***Flagging these transactions***");
                    System.err.println("ID: " +datasplit[1]);
                    System.err.println("Total amount in $: " + (currentprice*Integer.parseInt(datasplit[3])));
                }
                
                //System.out.println("Day of lightsaber: " + Integer.parseInt(datasplit[0]));
                
                //System.out.println("Total failure = " + " $" + currentprice + " * " + datasplit[3] + " shares = " + (Integer.parseInt(datasplit[3])*currentprice));
                
                
                
            }
            
            System.out.println();
            
        }
        
        
        return null;
        
    }
    
    public static void main(String[] args) {
        
        String[] data = {"0|20", "0|Krystal|SELL|3000", "0|Wubba|BUY|5000", "0|Timothy|BUY|5000", "0|Friendo|BUY|1500","1|Timothy|BUY|1500000","3|25","5|Friendo|SELL|1500", "8|Coruscant|SELL|600000", "9|Friendo|BUY|500", "10|15", "11|5", "14|Wubba|BUY|100000", "15|Wubba|BUY|100000","16|Wubba|BUY|100000", "17|25"}; 
        
        findMe(data);
        
    }
    
}