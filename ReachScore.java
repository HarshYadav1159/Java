import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReachScore {
    static int count =0;
    static int[] dp=new int[21];
    public static int sum(int N, int[] arr, int s){
        if(s== 0)
        return 1;

        if(N==0)
        return 0;
        
        // if(dp[s] == 0)
        // return 0;

        if(arr[N-1]>s)
        return dp[s] = sum(N - 1, arr, s);

        return dp[s] = count + sum(N-1,arr,s) + sum(N, arr,s - arr[N-1]);
    }
    public static void main(String args[]){
        Arrays.fill(dp, 0);
        dp[0]=1;
     int[] arr={3,5,10};
     for(int i=0;i<3;i++){
        for(int j=arr[i];j<21;j++){
            // if(arr[i]>j)
            dp[j]=dp[j] + dp[j-arr[i]];
        }
     }
    //  for(int i=3;i<21;i++){
    //     dp[i] =dp[i]+dp[i-3];
    //  }
    //  for(int i=5;i<21;i++){
    //     dp[i] =dp[i]+dp[i-5];
    //  }
    //  for(int i=10;i<21;i++){
    //     dp[i] =dp[i]+dp[i-10];
    //  }
    //  System.out.println((int)((sum(3, arr, 13))%Math.pow(10, 9)));
     for(int row:dp){
        System.out.print(row+" ");
     }
     
    }    
}
