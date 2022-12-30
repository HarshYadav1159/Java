import java.io.*;
import java.util.Arrays;
public class knapsack01 {
    
    static int dp[][] = new int[5][8]; 

    static int knapsack(int wt[], int val[], int w, int n){
        if(n==0||w==0){
            return 0;
        }

        if(dp[n][w]!=-1){
            return dp[n][w];
        }

        if(wt[n-1] > w){
            return dp[n][w] = knapsack(wt, val, w, n-1);
        }

        return dp[n][w] = Math.max(val[n-1] + knapsack(wt, val, w - wt[n-1], n-1), knapsack(wt, val, w, n-1));
    }

    public static void main(String[] args){
        for(int[] row:dp)
          Arrays.fill(row, -1);
          
       int wt[]={1,3,4,5};
       int val[]={1,4,5,7};
       int w=7,n=4;
    //    knapsack(wt, val, w, n);

       for(int i =0;i<n+1;i++){
        for(int j = 0;j<w+1;j++){
            if(i==0||j==0){
                dp[i][j]=0;
            }
        }
       }

       for(int i=1;i<5;i++){
        for(int j=1;j<8;j++){
            if(wt[i-1]<= j){
                dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
            }

            else{
                dp[i][j]=dp[i-1][j];
            }
        }
       }

       for(int i=0;i<5;i++){
        for(int j=0;j<8;j++){
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
       }
    }
    
}
