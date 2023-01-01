import java.io.*;
import java.util.Arrays;
public class LCS {

    static int dp[][]=new int[7][7];
    static int lcs(String x, String y, int n, int m){
        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }

        if(x.charAt(n-1) == y.charAt(m-1)){
            dp[n][m] = 1 + lcs(x.substring(0,n-1), y.substring(0,m-1), n-1, m-1);
            return dp[n][m];
        }

        else{
            dp[n][m] = Math.max(lcs(x.substring(0,n-1), y.substring(0,m), n-1, m), 
            lcs(x.substring(0,n), y.substring(0,m-1), n, m-1)) ;

            return dp[n][m];
        }
    } 

    public static void main(String[] args){
        int t[][] = new int[7][7];
        // for(int[] row:dp)
        //   Arrays.fill(row, -1);
           
        String s1 = "abcdgh";
        String s2 ="abedfh";
        // lcs(s1, s2, s1.length(), s2.length());

        for(int i= 0; i<7;i++){
            for(int j=0; j<7; j++){
                if(i==0||j==0){
                    t[i][j] = 0;
                }
            }
        }

        for(int i= 1; i<7; i++){
            for(int j=1; j<7; j++){

                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }

                else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }

        // System.out.println(lcs(s1, s2, s1.length(), s2.length()));
        for(int i =0; i<7;i++){
            for(int j= 0; j<7;j++){
                System.out.print(t[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
