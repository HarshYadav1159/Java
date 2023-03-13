

public class MinimumSumDiff {
    public static void main(String args[]){
        int[] arr = {1,2,7};
      boolean[][] dp = new boolean[arr.length+1][11];

      for(int i=0;i<=arr.length;i++){
        for(int j=0;j<11;j++){
            if(j==0)
            dp[i][j] =true;

            if(i==0 && j!=0)
            dp[i][j]=false;
        }
      }

      for(int i = 1; i<=arr.length; i++){
        for(int j=1; j<11; j++){
            if(arr[i-1] <= j){
                dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
            }
            else
            dp[i][j] = dp[i-1][j];
        }
      }
       
      int min = Math.max(2,30);
      for(int i=0; i<5;i++){
          if(dp[arr.length][i] == true){
            if(10 - 2*i < min){
                min = 10 - 2*i;
            }
          }
      }
    System.out.println(min);

    for(boolean[] col: dp){
        for(boolean row: col){
            System.out.print(row+" ");
        }
        System.out.println();
    }
    }    
}
