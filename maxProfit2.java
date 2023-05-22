public class maxProfit2 {
    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        int profit =0;
        for(int i=1; i< prices.length; i++){
          if(prices[i] > prices[i-1]){
            profit = profit + (prices[i]-prices[i-1]);
          }
        }
        System.out.print(profit);
    }
}
