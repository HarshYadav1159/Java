import java.util.Arrays;

public class PalindromePartitioning { 
    static int dp[][] = new int[100][100];
    static boolean isPalin(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    
    static int solve(String s, int i, int j ){
        if(i>=j)
        return 0;

        if(isPalin(s, i, j))
        return 0;

        if(dp[i][j]!=-1)
        return dp[i][j];

        int min=(int)(Math.pow(2,31));
        int left,right;
        for(int k = i; k<j;k++){
           
            if(dp[i][k]!=-1)
            left =  dp[i][k];
            else
            left =  solve(s, i, k);

            if(dp[k+1][j]!=-1) 
            right = dp[k+1][j];
            else
            right = solve(s, k+1, j);
            int temp = 1 + left + right;
            if(temp<min){
                min = temp;
            }
        }

        return dp[i][j] =min;

    }
    public static void main(String args[]){
        for(int[]col:dp)
        Arrays.fill(col, -1);
    String s ="harsh";
    System.out.println(solve(s, 0, s.length()-1));
    }
    
}
