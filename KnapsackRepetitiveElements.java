import java.util.Arrays;

public class KnapsackRepetitiveElements {
    static int[][] dp=new int[3][4];
    public static int knapsackRepeat(int N, int W, int[] val, int[] wt){
         if(N==0 || W==0)
         return 0;

         if(dp[N][W]!=-1)
         return dp[N][W];

         int ans=0,c1,c2;

         if(wt[N-1] > W){
           ans = knapsackRepeat(N-1, W, val, wt);
         }

         else{        
             
                c1 = val[N-1] + knapsackRepeat(N, W-wt[N-1], val, wt);
                c2 = knapsackRepeat(N-1, W, val, wt);
                ans = Math.max(c1, c2);                            
         }

         dp[N][W] =ans;
         return dp[N][W];
    }
    public static void main(String args[]){

        // for(int[] col:dp)
        // Arrays.fill(col, -1);

       int[] val = {1,1};
       int[] wt = {2,1};
       int w =3;
    //    int ans = knapsackRepeat(4, w, val, wt);
       for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            if(i==0||j==0){
                dp[i][j] = 0;
            }
        }
       }

       for(int i=1;i<3;i++){
        for(int j=1;j<4;j++){
            if(wt[i-1] > j){
                dp[i][j] = dp[i-1][j];
            }
            else{
                dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
            }
        }
       }
       for(int[] col: dp){
        for(int row: col){
            System.out.print(row+" ");
        }
        System.out.println();
       }
    //    System.out.print(ans);
    }
    
}
