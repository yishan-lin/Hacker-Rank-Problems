public class CAITAA {
    
    static void findpotential(String[] data) {
        
        System.out.println(data.length);
        
        int currentstockprice = 0;
        int currentday = 0;
        int nextday = 0;
        
        for (int x = 0; x < data.length; x++) {
            
            if (data[x].length() > 5) {
                
                System.err.println("this is a transaction.");
                
                String[] transactionparse = data[x].trim().split("\\|");
                
                System.err.println("parsed transaction[0] = " + transactionparse[0]);
                System.err.println("parsed transaction[1] = " + transactionparse[1]);
                
            }
            
            else {
                
                System.err.println("this is a stock price.");
                
                String[] stockparse = data[x].trim().split("\\|");
                
                System.err.println("parsed dataparsed[0] = " + stockparse[0]);
                System.err.println("parsed dataparsed[1] = " + stockparse[1]);
                
                currentstockprice = Integer.parseInt(stockparse[1]);
                currentday = Integer.parseInt(stockparse[0]);
  
                for (int y = x+1; y < data.length; y++) {
                 
                    if (data[y].length() <= 5) {
                     
                        String[] nextstockprice = data[y].trim().split("\\|");
                        
                        System.err.println("next day's stock price spotted");
                        System.err.println("the next day's stock price is " + nextstockprice[1] + " @ " + nextstockprice[0]);
                        
                    }

                }
            }
            
            System.out.println(data[x] + " @ length: " + data[x].length());
            
        }
        
        
        
    }
    
    public static void main(String[] args) {
        
        String[] data = {"0|20", "0|Kristi|SELL|3000", "0|Will|BUY|5000", "0|Tom|BUY|50000", "0|Shilpa|BUY|1500", "3|25"};
        findpotential(data);
    }
    
}