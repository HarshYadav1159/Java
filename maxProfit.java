public class maxProfit {

    public static void main(String args[]){
        int prices[]={5,7,2,7,3,3,5,3,0};
        int l=0, r=1, profit=0, maxP=0;        
        while(r<prices.length){
            if(prices[l]< prices[r]){
                profit = prices[r]-prices[l];
                maxP= Math.max(profit,maxP);
            }
            else
            l=r;
          r++;
        }
            
        System.out.print(maxP);
    }    
}
