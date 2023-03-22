import java.util.Arrays;

public class ArrayRemovals {
    static int min =(int)(Math.pow(2,31));
    static int[][] dp = new int[1001][1001];
    static int solve(int[] a, int i, int j, int k, int count){
        if(i>j)
        return 0;

        if(a[j]-a[i]<=k)
        return count;

        if(dp[i][j]!=-1)
        return dp[i][j];
        
        
        return dp[i][j] = Math.min(solve(a, i+1, j, k, count+1), solve(a, i, j-1, k, count+1));
    }
    public static void main(String args[]){
        for(int[] col: dp)
        Arrays.fill(col, -1);
        int arr[]={1,2,5,6,8};
        int k=2;
        System.out.println(solve(arr, 0, arr.length-1, k, 0));
    }
    
}
