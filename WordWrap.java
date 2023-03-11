import java.util.Arrays;

public class WordWrap {
    static int dp[][] = new int[5][8];
    public static int rec(int i,int rem, int[] arr, int k){
        if(i==arr.length+1){
            return 0;
        }
        
        if(dp[i][rem]!=-1){
            return dp[i][rem];
        }
         int ans;
        if(arr[i-1] > rem-1){
            ans = (rem)*(rem) + rec(i+1, k-arr[i-1]-1, arr, k);
        }

        else{
            int choice1 = (rem)*(rem) + rec(i+1, k-arr[i-1]-1,  arr, k);
            int choice2 = rec(i+1,rem-arr[i-1]-1, arr, k);
            ans =(int)(Math.min(choice1,choice2));
        }

        dp[i][rem] = ans;        
        return dp[i][rem];
    }
    public static int solveWordWrap(int[] nums, int k){
        for(int[] col:dp)
         Arrays.fill(col, -1);
        
       return rec(1,k+1, nums, k+1);
    } 
    public static void main(String args[]){
                
        int nums[]={3,2,2,5};
        int k=6;
        int ans = solveWordWrap(nums, k);
        System.out.println(ans);
        for(int[] col:dp){
            for(int row:col)
            System.out.print(row+ " ");
            System.out.println();
        }
        

    }
    
}
