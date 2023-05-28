import java.util.Arrays;

public class JumpGame2 {
    static int  dp[] = new int[6];
    static int min = 1000;
    static int jump(int[] nums,int n,int count){
        if(n>=nums.length-1){
            if(count<min)
            min = count;
            // System.out.println(count);
            return count;
        }  
        // if(dp[n]!=-1)
        // return dp[n];
       int c=0;
        for(int i=1; i<=nums[n];i++){
            // System.out.print(nums[n]+" ");
            c=jump(nums, n+i, count+1);
        }
    return dp[n] = c;
    }

    public static void main(String args[]){
        Arrays.fill(dp,-1);
    int[] nums= {1,2,1,1,1};
    jump(nums, 0, 0);
    System.out.println(min);
    for(int e: dp){
        System.out.print(e+ " ");
    }
    }
    
}
